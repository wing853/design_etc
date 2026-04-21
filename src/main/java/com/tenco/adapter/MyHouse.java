package com.tenco.adapter;

interface IElectronic220v {
    void connect();
}

interface IElectronic110v {
    void connect();
}

public class MyHouse {

    public static void homeConnect(IElectronic220v iElectronic220V) {
        // 벽에 콘센트 스펙 220v
        iElectronic220V.connect();
    }

    // 메인함수
    public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer();
        AirConditioner airConditioner = new AirConditioner();

        ElectronicAdapter electronicAdapter = new ElectronicAdapter(hairDryer);

        // homeConnect()를 통해서 가전 기기를 연결하는 행위
        homeConnect(airConditioner);
        // 인터페이스가 서로 호환이 되지않아 철물점에 가서 돼지코를 사와야 함
        // 어댑터 패턴으로 해결
        // homeConnect(hairDryer);
        homeConnect(electronicAdapter);
    }

} // end of myHouse

class HairDryer implements IElectronic110v {

    @Override
    public void connect() {
        System.out.println("헤어드라이어 연결 110v");
    }
}

class AirConditioner implements IElectronic220v{

    @Override
    public void connect() {
        System.out.println("에어컨 연결 220v");
    }
}