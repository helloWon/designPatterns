package me.designpatterns.behavioral.template.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyHello extends HttpServlet {

    // 필요한 메소드 override
    // servlet engine이 초기화 하고 요청한 메소드를 보고 이 메서드 안에서 코드 실행 (Inversion of Control: 제어의 역전)
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
