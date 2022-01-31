package me.designpatterns.behavioral.chain_of_responsibilities.before;

public class RequestHandler {

    public void handler(Request request) {
        // 인증이 되었나?
        // 이 핸들러를 사용할 수 있는 유저인가? // 단일 책임 원칙 위배
        System.out.println(request.getBody());
    }
}
