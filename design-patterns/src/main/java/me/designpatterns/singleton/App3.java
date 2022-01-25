package me.designpatterns.singleton;

import java.lang.reflect.InvocationTargetException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 안전하고 단순하게 enum으로 구현
 */
public class App3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        Settings2 settings = Settings2.INSTANCE;
        Settings2 settings1 = null;

        /**
         * enum 으로 만든 singleton은 reflection이 막혀 있어서 유일한 인스턴스가 보장됨
         */
        // Constructor<?>[] declaredConstructors = Settings2.class.getDeclaredConstructors();
        // for (Constructor<?> constructor : declaredConstructors) {
        //     constructor.setAccessible(true);
        //     settings1 = (Settings2) constructor.newInstance("INSTANCE");
        // }
        // System.out.println(settings != settings1);

        /**
         * 직렬화 역직렬화에서 안전
         */
        // save as file
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        // read from file
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings2) in.readObject();
        }

        System.out.println(settings == settings1);
    }
}
