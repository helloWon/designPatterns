package me.designpatterns.structural.flyweight.after;

public class Character {

    private char value; // extrinsit

    private String color;

    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
