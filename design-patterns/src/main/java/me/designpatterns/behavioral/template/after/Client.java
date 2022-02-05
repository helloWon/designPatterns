package me.designpatterns.behavioral.template.after;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Multiply("number.txt");
        int result = fileProcessor.process((sum, number) -> sum += number); // 템플릿 콜백 패턴, 다른 클래스 필요없음
        System.out.println(result);
    }
}
