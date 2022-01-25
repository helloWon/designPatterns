package me.designpatterns.creational.factory_method.example;

import me.designpatterns.creational.factory_method.after.BlackShip;
import me.designpatterns.creational.factory_method.after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
