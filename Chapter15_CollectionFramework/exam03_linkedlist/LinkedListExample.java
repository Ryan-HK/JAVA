package exam03_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		System.out.println("-- 0번 인덱스에 객체 추가 --");
		System.out.println("ArrayList : " + valueAdd(list1));
		System.out.println("LinkedList : " + valueAdd(list2));
		System.out.println();
		
		System.out.println("-- 객체를 순차적으로 읽기 --");
		System.out.println("ArrayList : " + valueRead(list1));
		System.out.println("LinkedList : " + valueRead(list2));
		System.out.println();
		
		System.out.println("-- 객체를 중간부터 삭제 --");
		System.out.println("ArrayList : " + valueRemove2(list1));
		System.out.println("LinkedList : " + valueRemove2(list2));
		System.out.println();
		
		valueAdd(list1);
		valueAdd(list2);
		
		System.out.println("-- 객체를 순차적으로 삭제(뒤부터) --");
		System.out.println("ArrayList : " + valueRemove(list1));
		System.out.println("LinkedList : " + valueRemove(list2));
		System.out.println();
		

		
		
		
	} // main
	
	public static long valueAdd(List<String> list) {
		long startTime = System.nanoTime();
		
		for(int i=0; i<100000; i++) {
			list.add(0, String.valueOf(i));
		} // for
		
		long endTime = System.nanoTime();
		
		return endTime-startTime;
	} // valueAdd
	
	public static long valueRead(List<String> list) {
		long startTime = System.nanoTime();
		
		for(int i=0; i<100000; i++) {
			list.get(i);
		} // for
		
		long endTime = System.nanoTime();
		
		return endTime-startTime;
	} // read
	
	public static long valueRemove(List<String> list) {
		long startTime = System.nanoTime();
		
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		} // for
		
		long endTime = System.nanoTime();
		
		return endTime-startTime;
	} // valueRemove
	
	public static long valueRemove2(List<String> list) {
		long startTime = System.nanoTime();
		
		for(int i=0; i<list.size(); i++) {
			list.remove(0);
		} // for
		
		long endTime = System.nanoTime();
		
		return endTime-startTime;
	} // valueRemove2

} // end class
