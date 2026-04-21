package com.tenco.pront;

public class PaymentWaiter implements Waiter{

    @Override
    public void doWorker() {
        System.out.println("웨이터: 결제를 진행하고 영수증을 드립니다.");
    }
}
