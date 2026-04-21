package com.tenco.pront;

public class ResMain {

    public static void main(String[] args) {

        // 프론트 컨트롤러 패턴 적용후 코드 확인
        FrontController frontController = new FrontController();

        // 손님1 주문 요청
        System.out.println("--- 손님1 입장 ---");
        frontController.handleRequest("ORDER");

        // 손님2 계산 요청
        System.out.println("--- 손님2 입장---");
        frontController.handleRequest("PAYMENT");

        // 예약 웨이터, 화장실 안내 웨이터 추가후 실행

        // 손님3 화장실 요청
        System.out.println("--- 손님3 입장---");
        frontController.handleRequest("TOILET");

        // 손님4 예약 요청
        System.out.println("--- 손님4 입장---");
        frontController.handleRequest("RESERVE");

    }
}
