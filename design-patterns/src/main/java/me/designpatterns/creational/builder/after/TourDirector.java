package me.designpatterns.creational.builder.after;

import java.time.LocalDate;

import me.designpatterns.creational.builder.before.TourPlan;

public class TourDirector {

    public TourPlan cancunTrip(TourPlanBuilder tourPlanBuilder) {
        return tourPlanBuilder.title("칸쿤 여행").nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();
    }

    public TourPlan longBeachTrip(TourPlanBuilder tourPlanBuilder) {
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
    }
}
