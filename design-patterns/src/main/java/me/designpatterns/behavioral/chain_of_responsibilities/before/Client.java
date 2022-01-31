package me.designpatterns.behavioral.chain_of_responsibilities.before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new LoggingRequestHandler(); // 단일 책임 원칙은 지킬 수 있으나, 확장성에 문제
        // 사용해야 하는 핸들러를 직접 알아야함
        requestHandler.handler(request);
    }
}
