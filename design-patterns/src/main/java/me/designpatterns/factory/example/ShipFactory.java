package me.designpatterns.factory.example;

import org.springframework.beans.factory.FactoryBean;

import me.designpatterns.factory.after.Ship;
import me.designpatterns.factory.after.WhiteShip;

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
