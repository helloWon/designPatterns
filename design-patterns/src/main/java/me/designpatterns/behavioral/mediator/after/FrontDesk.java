package me.designpatterns.behavioral.mediator.after;

import java.time.LocalDateTime;

public class FrontDesk {

    private CleaningService cleaningService = new CleaningService();

    private Restaurant restaurant = new Restaurant();

    public void getTowels(Guest guest, int numberOfTowels) {
        cleaningService.getTowels(guest.getId(), numberOfTowels); // 여기서 만약 guest 그대로 넘기면 또 의존성 생기는거임
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
