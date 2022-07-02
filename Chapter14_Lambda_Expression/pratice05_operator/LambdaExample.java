package pratice05_operator;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = { 10, 50, 3 };
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		} // for
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int max = maxOrMin(
				(a, b) -> {
					if(a>=b) {
						return a;
					} else {
						return b;
					}
				}		
		);
		
		System.out.println("최대값: " + max);
		
		int min = maxOrMin(
				(a,b) -> {
					if(a<b) return a;
					else return b;
				}
		);
		
		System.out.println("최솟값: " + min);
	
	} // main
	
} // end class
