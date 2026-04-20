package com.tenco.single;

public class Main {

    public static void main(String[] args) {
       // 우리 프로젝트 내에서 SingleTon 객체를 Heap 메모리에 올려보기
        // SingleTon singleTon = new SingleTon(); // 생성자 막아둠 - 호출 불가

        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();

        System.out.println("1. " + singleTon1);
        System.out.println("2. " + singleTon2);

        if(singleTon1 == singleTon2) {
            System.out.println("같은 객체");
        }
    }
}
