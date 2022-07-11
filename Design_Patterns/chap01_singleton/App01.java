package chap01_singleton;

public class App01 {
	
	public static void main(String[] args) {
		Settings01_basic settings = Settings01_basic.getInstance();
		Settings01_basic settings1 = Settings01_basic.getInstance();
		
		System.out.println(settings == settings1);
		
	} // main
	
} // end class - App
