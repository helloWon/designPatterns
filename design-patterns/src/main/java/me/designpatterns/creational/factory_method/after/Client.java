package me.designpatterns.creational.factory_method.after;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "swlee@mail.com");
        client.print(new BlackShipFactory(), "blackship", "swlee@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
