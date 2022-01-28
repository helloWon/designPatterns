package me.designpatterns.structural.bridge.before;

import me.designpatterns.structural.bridge.after.Skin;

public interface Champion extends Skin {
    
    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();
}
