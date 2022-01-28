package me.designpatterns.structural.bridge.after;

import me.designpatterns.structural.bridge.before.Champion;

public abstract class App implements Champion {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA()); // abstract만 사용하고 있음
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillR();
        poolParty아리.skillW();
    }
}