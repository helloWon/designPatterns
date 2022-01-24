package me.designpatterns.singleton;

public class Settings {

    // 오직 하나만
    private static Settings instance;

    // 외부에서 함부로 생성자를 만들지 못하게 private 생성자 만듦
    private Settings() {
    }

    // global하게 접근 가능하게 함
    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

}
