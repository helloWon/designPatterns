package me.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class App2 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        /**
         * 싱글톤 깨뜨리기 2. 직렬화 & 역직렬화 사용
         */
        Settings settings = Settings.getInstance();
        Settings settings1 = null;

        // save as file
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        // read from file
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings) in.readObject();
        }

        System.out.println(settings != settings1);
    }
}
