package me.designpatterns.creational.builder.after;

import me.designpatterns.creational.builder.before.TourPlan;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector();
        TourPlan tourPlan = director.cancunTrip(new DefaultTourBuilder());
        TourPlan tourPlan1 = director.longBeachTrip(new DefaultTourBuilder());
        System.out.println(tourPlan);
        System.out.println(tourPlan1);
    }
}
