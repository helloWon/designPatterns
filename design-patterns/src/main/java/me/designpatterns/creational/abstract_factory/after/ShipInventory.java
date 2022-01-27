package me.designpatterns.creational.abstract_factory.after;

import me.designpatterns.creational.factory_method.after.Ship;
import me.designpatterns.creational.factory_method.after.ShipFactory;

public class ShipInventory {
    
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    } 
}
