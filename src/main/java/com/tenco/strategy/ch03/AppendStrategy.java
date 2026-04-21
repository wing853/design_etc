package com.tenco.strategy.ch03;

public class AppendStrategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return "ABC[" + text +"]";
    }
}
