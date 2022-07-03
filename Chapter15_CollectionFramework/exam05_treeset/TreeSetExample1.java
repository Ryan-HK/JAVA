package exam05_treeset;

import java.util.TreeSet;

public class TreeSetExample1 {
	
	public static void main(String[] args) {
		
		// TreeSet은 생성 시, 자동으로 오름차순으로 정렬해준다.
		// 자동으로 내림차순 정렬을 할 시, Collections 클래스의 reverseOrder()메소드를 매개변수로 넘겨 주면 된다.
		// 단! TreeSet생성 시, 정렬 사용한다면, TreeSet의 메소드들은 모두 반대로 된다.
		// 예를들어.. 제일 낮은 객체를 리턴하는 first()의 경우, Collections.reverseOrder() 내림 차순 정렬한 TreeSet은
		// 가장 높은 값을 리턴하게 되어버린다...
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores);
		
		Integer score = null;
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score + "\n");
		
		score = scores.lower(95);
		System.out.println("95점 아래 점수 : " + score);
		
		score = scores.higher(95);
		System.out.println("95점 위의 점수 : " + score  + "\n");
		
		// 오름 차순으로 하나씩 꺼내오고 제거하는 방법
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수 : " + scores.size() + ")");
		}
		
	} // main

} // end class
