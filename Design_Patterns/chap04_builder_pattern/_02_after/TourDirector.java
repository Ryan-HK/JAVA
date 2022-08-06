package chap04_builder_pattern._02_after;

import java.time.LocalDate;

import chap04_builder_pattern._01_before.TourPlan;

public class TourDirector {
	
	private TourPlanBuilder tourPlanBuilder;
	
	public TourDirector(TourPlanBuilder tourPlanBuilder) {
		this.tourPlanBuilder = tourPlanBuilder;
	} // Constructor

	public TourPlan japanTrip() {
		
		return 	tourPlanBuilder.title("일본 여행")
		.nightsAndDays(2, 3)
		.startDate(LocalDate.of(2022, 8, 15))
		.whereToStay("고급호텔")
		.addPlan(0, "체크인 하고 짐 풀기")
		.addPlan(0, "점심식사")
		.addPlan(0, "저녁식사")
		.getPlan();
	} // japanTrip
	
	public TourPlan longBeachTrip() {
		return tourPlanBuilder.title("롱비치")
				.startDate(LocalDate.of(2022, 8, 16))
				.getPlan();
	} // longBeachTrip
	
	
} // end class
