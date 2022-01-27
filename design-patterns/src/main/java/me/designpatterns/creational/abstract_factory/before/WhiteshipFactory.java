package me.designpatterns.creational.abstract_factory.before;

import me.designpatterns.creational.factory_method.after.DefaultShipFactory;
import me.designpatterns.creational.factory_method.after.Ship;
import me.designpatterns.creational.factory_method.after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
