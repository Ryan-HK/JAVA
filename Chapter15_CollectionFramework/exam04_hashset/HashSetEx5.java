package exam04_hashset;

import java.util.HashSet;

public class HashSetEx5 {
	
	public static void main(String[] args) {
		HashSet<Integer> setA = new HashSet<>();
		HashSet<Integer> setB = new HashSet<>();
		HashSet<Integer> setHab = new HashSet<>();
		HashSet<Integer> setKyo = new HashSet<>();
		HashSet<Integer> setCha = new HashSet<>();
		
		setA.add(1);	setA.add(2);	setA.add(3);
		setA.add(4);	setA.add(5);
		System.out.println("A = " + setA);
		
		setB.add(4);	setB.add(5);	setB.add(6);
		setB.add(7);	setB.add(8);
		System.out.println("B = " + setB);
		
		setA.forEach( s-> {
			if(setB.contains(s)){
				setKyo.add(s);
			}		
		});
		System.out.println("A ∩ B : " + setKyo);
		
		setA.forEach( s-> setHab.add(s));
		setB.forEach( s-> setHab.add(s));
		System.out.println("A ∪ B : " + setHab);
		
		
		setA.forEach( s-> {
			
			if(!setB.contains(s)) {
				setCha.add(s);
			}
		});
		System.out.println("A - B : " + setCha);	
	} // main
} // end class
