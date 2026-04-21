package com.tenco.pront;

public class ToiletWaiter implements Waiter{
    @Override
    public void doWorker() {
        System.out.println("웨이터: 화장실을 안내합니다");
    }
}
