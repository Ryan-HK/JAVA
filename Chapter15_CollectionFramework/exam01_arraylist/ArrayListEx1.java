package exam01_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		
		// 크기가 10인 ArrayList 생성
		// 물론 ArrayList의 default 생성 size는 10이다.
		ArrayList<Integer> list1 = new ArrayList<>(10);
		
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		// ArrayList 생성자 매개변수로 list를 전달하여, 생성도 가능하다
		// subList(int fromindex, int toindex) 사이에 있는 저장된 객체를 list형태로 반환하는 메소드
		ArrayList<Integer> list2 = new ArrayList<>(list1.subList(1, 4));
		print(list1, list2);
		
		// Collectios 클래스의 sort() 메소드
		// 배열을 정렬한다. (오름차순)
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		// containsAll(Collection c) : 컬렉션이 모두 포함되어 있는지 여부 확인!
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		// retainAll(Collection c) list1에서 list2와 공통적인 부분만 남기고 나머지는 삭제한다!.
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		list2.add(10);
		list2.add(30);
		
		// list2에서 list1과 공통적인 부분 삭제
		for(int i=list2.size()-1; i>=0; i--) {	
			if(list1.contains( list2.get(i) )){
				list2.remove(i);
			}
		} // for
		
		print(list1, list2);
		
		// clear() : list 객체 모두 삭제
		list1.clear();
		list2.clear();
		
		print(list1, list2);
		
	} // main
	
	static void print(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
	
} // end class
