package exam16_method_references;

import java.util.function.IntBinaryOperator;

public class MethodReferencesExample {
	
	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		
		//정적 메소드 참조
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과 1 : " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("결과 2 : " + operator.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조
		Calculator obj = new Calculator();
		
		operator = obj :: instanceMethod;
		System.out.println("결과 4 : " + operator.applyAsInt(7, 8));
		
		
		
	} // main

} // end class

class Calculator {
	
	public static int staticMethod(int x, int y) {
		return x+y;
	} // staticMethod
	
	public int instanceMethod(int x, int y) {
		return x+y;
	} // instanceMethod
	
	
} // end class