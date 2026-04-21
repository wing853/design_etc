package com.tenco.strategy.ch03;

public class Main {

    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        String message = "hi";

        encoder.setEncodingStrategy(new Base64Strategy());
        System.out.println(encoder.getMessage(message));

        encoder.setEncodingStrategy(new AppendStrategy());
        System.out.println(encoder.getMessage(message));

        encoder.setEncodingStrategy(new UrlStrategy());
        System.out.println(encoder.getMessage(message));
    }

}
