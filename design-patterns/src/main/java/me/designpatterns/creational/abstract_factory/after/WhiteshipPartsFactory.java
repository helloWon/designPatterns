package me.designpatterns.creational.abstract_factory.after;

import me.designpatterns.creational.abstract_factory.before.WhiteAnchor;
import me.designpatterns.creational.abstract_factory.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
