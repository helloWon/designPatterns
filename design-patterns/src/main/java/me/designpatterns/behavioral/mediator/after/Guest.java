package me.designpatterns.behavioral.mediator.after;

import java.time.LocalDateTime;

public class Guest {

    private Integer id;

    private FrontDesk frontDesk = new FrontDesk();

    public void getTowels(int numberOfTowels) {
        this.frontDesk.getTowels(this, numberOfTowels); // 누구한테 줬는지 알아야하니까 this 도 넘김
    }

    private void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
