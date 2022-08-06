package chap04_builder_pattern._02_after;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import chap04_builder_pattern._01_before.DetailPlan;
import chap04_builder_pattern._01_before.TourPlan;

public class DefaultTourBuilder implements TourPlanBuilder {
	
	private String title;
	
	private int nights;
	
	private int days;
	
	private LocalDate startDate;
	
	private String whereToStay;
	
	private List<DetailPlan> plans;

	@Override
	public TourPlanBuilder title(String title) {
		this.title = title;
		return this;
	}

	@Override
	public TourPlanBuilder nightsAndDays(int nights, int days) {
		this.nights = nights;
		this.days = days;
		return this;
	}

	@Override
	public TourPlanBuilder startDate(LocalDate localDate) {
		this.startDate = localDate;
		return this;
	}

	@Override
	public TourPlanBuilder whereToStay(String whereToStay) {
		this.whereToStay = whereToStay;
		return this;
	}

	@Override
	public TourPlanBuilder addPlan(int day, String plan) {
		if(this.plans == null) {
			this.plans = new ArrayList<>();
		}
		
		this.plans.add(new DetailPlan(day, plan));
		return this;
	}

	@Override
	public TourPlan getPlan() {
		return new TourPlan(title, nights, days, startDate, whereToStay, plans);
	}

}
