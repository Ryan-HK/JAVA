package exam07_supplier;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		IntSupplier intsupplier = () -> {
			int num = (int)(Math.random()*6)+1;
			
			return num;
		};
		
		int num = intsupplier.getAsInt();
		System.out.println("눈의 수 : " + num);
	} // main
	
} // end class
