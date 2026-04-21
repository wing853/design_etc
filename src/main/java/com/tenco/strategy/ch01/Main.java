package com.tenco.strategy.ch01;

import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) {

    }
}

// 인코딩을 담당해주는 클래스
class Encoder {
    // base64 인코딩 방법(Byte 데이터 --> 특정 형태의 문자열로 인코딩)
    // 파일을 전송 할 때 바이너리 데이터로 전송
    // Client에서 Server측으로 파일을 전송
    // Server에서는 바이너리 형태를 받계 설계되어 있지 않음 --> Json 형식으로 전송
    // Json 형식: 문자(바이너리 형식을 집어 넣지 못함) --> 인코딩 필요 --> ASCII 기준으로 변환

    public String encode(String text, String format) {
        if("base64".equalsIgnoreCase(format)){
           return java.util.Base64.getEncoder().encodeToString(text.getBytes());
        } else if("append".equalsIgnoreCase(format)){
            return "ABC[" + text + "]";
        } else if("url".equalsIgnoreCase(format)){
            // 브라우저에 한글이나 특수문자를 %2F 같은 형태로 변환
            try {
                return java.net.URLEncoder.encode(text,"UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }
}