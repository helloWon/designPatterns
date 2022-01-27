package me.designpatterns.creational.abstract_factory.after;

public interface ShipPartsFactory {
    
    Anchor createAnchor();

    Wheel createWheel();
}
