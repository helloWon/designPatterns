package me.designpatterns.behavioral.mediator.after;

public class CleaningService {

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowels(Integer guestId, int numberOfTowels) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);
        System.out.println("provide " + numberOfTowels + " to " + roomNumber);
    }
}
