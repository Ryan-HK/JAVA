package chap04_builder_pattern._02_after;

import java.time.LocalDate;

import chap04_builder_pattern._01_before.TourPlan;

public class App {
	
	public static void main(String[] args) {

		TourPlanBuilder builder = new DefaultTourBuilder();
		TourPlan a = builder.title("일본 여행")
				.nightsAndDays(2, 3)
				.startDate(LocalDate.of(2022, 8, 15))
				.whereToStay("고급호텔")
				.addPlan(0, "체크인 하고 짐 풀기")
				.addPlan(0, "점심식사")
				.addPlan(0, "저녁식사")
				.getPlan();
		
		System.out.println(a);
		
		TourPlan longBeachTrip = builder.title("롱비치")
				.startDate(LocalDate.of(2022, 8, 16))
				.getPlan();	
		
		System.out.println(longBeachTrip);
		
		TourDirector director = new TourDirector(new DefaultTourBuilder());
		TourPlan tourPlan = director.japanTrip();
		TourPlan tourPlan1 = director.longBeachTrip();
		
		System.out.println("1. " + tourPlan);
		System.out.println("2. " + tourPlan1);
		
	} // main

} // end class
