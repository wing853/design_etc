package com.tenco.strategy.ch02;

// 전략을 사용하는 주체 클래스
public class Encoder {

    // 인터페이스 타입의 전략을 필드로 가짐(핵심)
    private EncodingStrategy encodingStrategy;

    // 전략 클래스를 세팅 할 수 있는 메서드 선언
    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }

    // 넘겨 받은 메세지를 인코딩해서 반환 하는 기능 메서드
    public String getMessage(String message) {
        return encodingStrategy.encode(message);
    }

}
