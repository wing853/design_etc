package com.tenco.pront;

public class ReserveWaiter implements Waiter{
    @Override
    public void doWorker() {
        System.out.println("웨이터: 예약을 진행합니다");
    }
}
