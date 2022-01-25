package me.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        /**
         * 싱글톤 깨뜨리기 1. reflection 사용
         */
        Settings settings = Settings.getInstance();

        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();

        System.out.println(settings != settings1);
    }
}
