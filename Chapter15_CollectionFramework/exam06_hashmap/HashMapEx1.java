package exam06_hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner sc = new Scanner(System.in);
		
		Point2:
		while(true) {
			System.out.println("id와 password를 입력하세요.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			
			
			Point1:
			for(;;) {
				System.out.print("password : ");
				String password = sc.nextLine().trim();
				System.out.println();
				
				if(!map.containsKey(id)) {
					System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
					continue Point2;
				} else {
					if(!password.equals(map.get(id))) {
						System.out.println("입력하신 비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
						continue Point1;
					} else {
						System.out.println("id와 비밀번호가 일치합니다.");
						break Point2;
					}
				}
			} // for-Point1

		} // while-Point2
		
		
	} // main

} // end class
