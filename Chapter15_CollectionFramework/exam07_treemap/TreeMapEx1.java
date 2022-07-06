package exam07_treemap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		String[] data = new String[text.length()];
		data = text.split("");
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		for(int i=0; i<data.length; i++) {		
			map.put(data[i], map.getOrDefault(data[i], 0)+1);		
		} // for
		
		System.out.println("== 기본 정렬 ==");
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + " : " + printBar('#', map.get(key)) + " " + map.get(key));
		} // enhanced for
		
//		--------- map을 정렬하는 방법(사용자 정렬기준) ----------
		
//		1. entrySet() 메소드를 사용하여, Set 생성
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		
//		2. ArrayList를 생성하여, 결과적으로 map을 list로 변환
		List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
		
//		3. Collections.sort(List, 배열기준) 메소드를 사용하여, 정렬
		Collections.sort(list, new ValueComparator());
		
//		4. 반복자를 이용하여 list를 순회
		Iterator it = list.iterator();
		
		System.out.println("\n==값이 큰 기준으로 정렬==");
		
		while(it.hasNext()) {
			Map.Entry<String,Integer> entry = (Map.Entry<String, Integer>) it.next();
			int value = (int)entry.getValue();
			
			System.out.println(entry.getKey() + " : " + printBar('@', value) + " " + value);
		}

		
		
	} // main
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++) {
			bar[i] = ch;
		} // for
		
		return new String(bar);
	}
	

} // end class

// 값이 큰 기준으로 정렬
class ValueComparator implements Comparator {

	
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
			Map.Entry e1 = (Map.Entry) o1;
			Map.Entry e2 = (Map.Entry) o2;
			
			int v1 = ((Integer)e1.getValue()).intValue();
			int v2 = ((Integer)e2.getValue()).intValue();
			
			return v2 - v1;
		}
		return -1;
	}
	
}
