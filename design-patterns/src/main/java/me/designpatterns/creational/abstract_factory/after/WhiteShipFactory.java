package me.designpatterns.creational.abstract_factory.after;

import me.designpatterns.creational.factory_method.after.DefaultShipFactory;
import me.designpatterns.creational.factory_method.after.Ship;
import me.designpatterns.creational.factory_method.after.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory{
    
    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory){
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
