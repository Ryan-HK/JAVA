package chap04_builder_pattern._01_before;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TourPlan {
	
	private String title;
	
	private int nights;
	
	private int days;
	
	private LocalDate startDate;
	
	private String whereToStay;
	
	private List<DetailPlan> plans;
	
	public void addPlan(int day, String plan) {
		this.plans.add (new DetailPlan(day, plan) );
	} // addPlan

}
