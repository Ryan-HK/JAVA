package pratice06_function;

import java.util.function.ToIntFunction;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class LambdaExample {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	// Student 객체를 받아, 평균점수로 매핑 ( T -> int)
	public static double avg(ToIntFunction<Student> function) {
		
		int cnt = 0;
		int sum = 0;
		
		for(Student student : students) {
			cnt++;
			
			sum += function.applyAsInt(student);
		};
		
		
		return (double)sum / cnt;
	}
	
	
	public static void main(String[] args) {
//		double englishAvg = avg( s -> s.getEnglishScore());
		double englishAvg =  avg(Student :: getEnglishScore);
		
		System.out.println("영어점수 : " + englishAvg);
		
//		double mathAvg = avg ( s-> s.getMathscore());
		double mathAvg = avg (Student :: getEnglishScore);
		System.out.println("수학점수 : " + mathAvg);
			
	} // main
	
	@AllArgsConstructor
	@Getter
	public static class Student {
		private String name;
		private int englishScore;
		private int mathscore;
	}

} // end class

