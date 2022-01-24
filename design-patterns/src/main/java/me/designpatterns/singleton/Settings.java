package me.designpatterns.singleton;

import java.io.Serializable;

public class Settings implements Serializable {

    /**
     * thread safe 1.synchronized keyword 사용 --> 성능 부하 주의
     */
    // // 오직 하나만
    // private static Settings instance;

    // // 외부에서 함부로 생성자를 만들지 못하게 private 생성자 만듦
    // private Settings() {
    // }

    // // global하게 접근 가능하게 함
    // public static synchronized Settings getInstance() {
    // if (instance == null) {
    // instance = new Settings();
    // }
    // return instance;
    // }

    /**
     * thread safe 2.eager initialization 사용 --> 미리 만드는거 자체가 단점이 될 수 있음
     */
    // private static final Settings INSTANCE = new Settings();

    // private Settings() {
    // }

    // public static synchronized Settings getInstance() {
    // return INSTANCE;
    // }

    /**
     * thread safe 3. double checked locking 사용 --> 복잡
     */
    // private static volatile Settings instance;

    // private Settings() {
    // }

    // public static synchronized Settings getInstance() {
    // if (instance == null) {
    // synchronized (Settings.class) {
    // if (instance == null) {
    // instance = new Settings();
    // }
    // }
    // }
    // return instance;
    // }

    /**
     * thread safe 4. static inner 클래스 사용 --> 권장방법 중 하나
     */
    private Settings() {
    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    /**
     * 싱글톤 깨뜨리기 2. 직렬화 & 역직렬화 대응 방안
     */
    protected Object readResolve() {
        return getInstance();
    }

}
