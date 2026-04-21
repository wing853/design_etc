package com.tenco.build;

public class Cat {
    private String name;
    private String variety;

    public String getName() {
        return name;
    }

    public String getVariety() {
        return variety;
    }

    private Cat(Builder builder) {
        this.name = builder.name;
        this.variety = builder.variety;
    }

    public static class Builder {
        private String name;
        private String variety;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder variety(String variety) {
            this.variety = variety;
            return this;
        }

        public Cat build() {
            return new Cat(this);
        }
    }

}
