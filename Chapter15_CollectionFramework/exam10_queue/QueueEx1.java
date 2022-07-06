package exam10_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
	static Queue<String> q = new LinkedList<>();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		
		System.out.println("help 입력 시, 도움말");
		
		while(true) {
			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().trim();
			
			if("".equals(input)) continue;
			
			if(input.equalsIgnoreCase("q")) {
				// main메서드가 종료될 때, 이 메서드가 사용된다.
				// 사용자가 "q" 입력 시, 프로그램 사용 용도
				System.exit(0);
			} else if (input.equalsIgnoreCase("help")) {
				save(input);
				
				System.out.println("help - 도움말을 보여줍니다.");
				System.out.println("q 또는 Q - 프로그램을 종료한다");
				System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
			} else if (input.equalsIgnoreCase("history")) {
				
				// 명령어를 Queue에 저장
				save(input);
				
				// LinkedList의 내용을 보여준다.
				LinkedList<String> temp = (LinkedList<String>)q;
				
				int i =0;
				
				for(String s : temp) {
					System.out.println(++i + "." + s);
				}
				
			} else {
				save(input);
				System.out.println(input);
			}
			
		} // while

		
	} // main

	public static void save(String input) {
		//queue에 저장
		if(!"".equals(input)) q.offer(input);
		
		// queue의 최대크기가 넘으면 제일 처음 입력된 것을 삭제!
		if(q.size() > MAX_SIZE) q.poll();
	}
	
} // end class
