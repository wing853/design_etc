package com.tenco.pront;

public class FrontController {

    // 지배인은 누가 어떤 일을 잘 하는지 이미 다 알고 있다(Dispatcher 역할)
    private void dispatcherRequest(String request){
        if(request.equalsIgnoreCase("ORDER")){
            new OrderWaiter().doWorker();
        } else if (request.equalsIgnoreCase("PAYMENT")) {
            new PaymentWaiter().doWorker();
        } else if (request.equalsIgnoreCase("TOILET")) {
            new ToiletWaiter().doWorker();
        } else if (request.equalsIgnoreCase("RESERVE")) {
            new ReserveWaiter().doWorker();
        } else {
            System.out.println("지배인: " + request + "서비스는 제공되지 않습니다");
        }
    }

    // 외부 모든 요청이 들어오는 공통 입구를 만들어 준다(프론트 컨트롤러 패턴)
    public void handleRequest(String request) {
        // 1. 공통 처리(보안, 로그 기록 등)
        System.out.println("[공통 처리 : 모든 요청은 일단 지배인에게 온다]");

        // 2. 분석후 알맞은 담당자에게 배졍
        dispatcherRequest(request);
    }
}
