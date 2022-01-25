package me.designpatterns.creational.factory_method.example;

import org.springframework.beans.factory.FactoryBean;

import me.designpatterns.creational.factory_method.after.Ship;
import me.designpatterns.creational.factory_method.after.WhiteShip;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
