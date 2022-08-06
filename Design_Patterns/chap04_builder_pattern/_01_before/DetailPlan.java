package chap04_builder_pattern._01_before;

public class DetailPlan {
	
	private int day;
	
	private String plan;
	
	public DetailPlan(int day, String plan) {
		this.day = day;
		this.plan = plan;
	} // Constructor
	
	public int getDay() {
		return day;
	} // getDay
	
	public void setDay(int day) {
		this.day = day;
	} // setDay
	
	public String getPlan() {
		return this.plan;
	} // getPlan
	
	public void setPlan(String plan) {
		this.plan = plan;
	} // setPlan
	
	public String toString() {
		return "DetailPlan{" +
				"day = " + day + ", plan = " + plan + "\'" + "}";
	} 

} // end class
