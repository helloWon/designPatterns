package me.designpatterns.structural.composite.after;

public class Item implements Component {

    private String name;

    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override // 제공하는 메소드가 맞는지 확인
    public int getPrice() {
        return this.price;
    }
}
