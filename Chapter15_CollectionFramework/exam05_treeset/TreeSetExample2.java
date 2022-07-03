package exam05_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 내림차순으로 정렬
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		descendingSet.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		// 오름차순으로 
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
	} // main

} // end class
