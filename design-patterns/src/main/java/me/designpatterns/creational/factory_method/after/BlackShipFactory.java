package me.designpatterns.creational.factory_method.after;

public class BlackShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
