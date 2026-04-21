package com.tenco.build;

// 빌더 패턴

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 외부에서 직접 생성자를 호출 못하게 막음
    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    ;

    // 내부 클래스로 Builder 클래스를 정의
    public static class Builder {
        // 1. 아우터 클래스의 멤버변수를 다시 한번 더 선언
        private String name;
        private int age;

        // 필요하다면 내부 클래스의 생성자를 선언 할 수 있다.
        // 단, 이 경우의 목적은 필수값, 선택값을 나눠야 할 때 선택 가능
        // 즉, Student를 생성할 때 필수 값을 정의하고 싶다면
        // 내부 클래스의 생성자를 만들어 준다.
        public Builder(String name) {
            this.name = name;
        }

        // 2. 각각 멤버 변수를 설정할 수 있는 메서드를 만들어준다
        // 단, return 타입은 자기자신
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        // 핵심 - 빌더 패턴에서 반드시 정의 되어야 함
        // return 타입은 아우터 클래스를 정의 내려 주어야 한다
        public Student build() {
            return new Student(this);
        }
    }

}
