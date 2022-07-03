package exam04_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
	
		// Iterator(반복자)를 사용하여, HashSet을 출력하는 방법1)
		Iterator<String> iterator = set.iterator();
	
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		} // while
		System.out.println();
		
		// enhanced for문을 사용하여, HashSet을 출력하는 방법2
		// ** enhanced for문은 Iterable한 객체에만 사용가능하다.
		for(String element : set) {
			System.out.println("\t"+element);
		}
		
		System.out.println();
		// Stream API를 이용한 출력방법
		set.forEach( s -> System.out.println("\t" + s));
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("\n총 객체 수 : " + set.size());
		set.forEach( s -> System.out.println("\t" + s));
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("\n비어 있음.");
		}
		
		
	} // main 

} // end class
