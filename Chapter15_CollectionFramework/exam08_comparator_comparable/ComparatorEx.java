package exam08_comparator_comparable;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
	
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		
		// String의 Comparable 구현에 의한 정렬 (기본 값 : 오름차순)
		Arrays.sort(strArr);
		System.out.println("strArr : " + Arrays.toString(strArr));
		
		// 대소문자 구분 없이 정렬 (오름차순)
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("\nstrArr : " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		System.out.println("\nstrArr : " + Arrays.toString(strArr));
		
	} // main

} // end class

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			
			// 오름차순 정렬을 위해, -1을 곱하여, 반대로 설정해준다.
			return c1.compareTo(c2)*-1;
		}
		return -1; // Comparable 안할 시, 기본 오름차순 정렬로 리턴
	}
	
}
