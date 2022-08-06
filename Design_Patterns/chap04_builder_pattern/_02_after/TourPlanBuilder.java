package chap04_builder_pattern._02_after;

import java.time.LocalDate;

import chap04_builder_pattern._01_before.TourPlan;

public interface TourPlanBuilder {
	
	TourPlanBuilder title(String title);
	
	TourPlanBuilder nightsAndDays(int nights, int days);
	
	TourPlanBuilder startDate(LocalDate localDate);
	
	TourPlanBuilder whereToStay(String whereToStay);
	
	TourPlanBuilder addPlan(int day, String plan);
	
	TourPlan getPlan();

} // end interface
