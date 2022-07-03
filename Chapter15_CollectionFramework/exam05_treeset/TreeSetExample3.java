package exam05_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[c ~ f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", false);
		
		for(String word : rangeSet) {
			System.out.print(word + " ");
		} // for
		
		System.out.println("\n[a ~ b로 시작하는 단어 검색]");
		rangeSet = treeSet.headSet("c", false);
		
		for(String word : rangeSet) {
			System.out.print(word + " ");
		} // for
		
		System.out.println("\n[f부터 시작하는 단어 검색]");
		rangeSet = treeSet.tailSet("f", false);
		
		for(String word : rangeSet) {
			System.out.print(word + " ");
		} // for
	
		
	} // main

} // end class
