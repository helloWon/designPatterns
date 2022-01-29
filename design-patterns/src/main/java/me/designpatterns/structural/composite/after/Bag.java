package me.designpatterns.structural.composite.after;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() { // client가 너무 많은걸 알지 않아도 됨
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
