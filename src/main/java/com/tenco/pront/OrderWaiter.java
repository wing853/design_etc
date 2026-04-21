package com.tenco.pront;

public class OrderWaiter implements Waiter {
    @Override
    public void doWorker() {
        System.out.println("웨이터: 주문을 주방으로 전달합니다");
    }
}
