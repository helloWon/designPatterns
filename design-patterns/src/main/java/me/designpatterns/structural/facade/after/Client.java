package me.designpatterns.structural.facade.after;

public class Client {
    EmailSettings emailSettings = new EmailSettings(); // 퍼사드 의존성은 어쩔 수 없음
    emailSettings.setHost("127.0.0.1");

    EmailSender emailSender = new EmailSender(emailSettings);
    EmailMessage emailMessage = new EmailMessage();
    
    emailMessage.setFrom("keesun");
    emailMessage.setTo("whiteship");
    emailMessage.setCc("일남");
    emailMessage.setSubject("오징어게임");
    emailMessage.setText("밖은 더 지옥이더라고..");

    emailSender.sendEmail(emailMessage);
}
