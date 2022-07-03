package exam06_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수 : " + map.size());

		//객체를 Key-Value 형태로 출력
		
		
		// 1. KeySet과 Iterator을 이용하여 출력하는 방법
		Set<String> keySet1 = map.keySet();
		Iterator<String> keyIterator = keySet1.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + "-" + value);
		} // while
		
		System.out.println();
		
		// 2. KeySet과 Map.entrySet을 이용하여 출력하는 방법
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "-" + value);
		} // while
		
		System.out.println();
		
		// 3. KeySet과 enhanced for문을 이용한 출력 방법
		Set<String> keySet2 = map.keySet();
		
		for(String key : keySet2) {
			Integer value = map.get(key);
			
			System.out.println(key + "-" + value);
		}
		
		System.out.println();
		
		// 4. keySet과 Stream API를 이용해 출력방법
		Set<String> keySet3 = map.keySet();
		
		keySet3.forEach( s -> System.out.println(s + "-" + map.get(s)));
		
	} // main

} // end class
