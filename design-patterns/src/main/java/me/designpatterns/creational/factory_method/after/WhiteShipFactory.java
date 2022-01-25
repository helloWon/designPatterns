package me.designpatterns.creational.factory_method.after;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
