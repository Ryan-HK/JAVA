package exam09_stack;
import java.util.Stack;

public class StackEx1 {
	public static Stack<String> back = new Stack<>();
	public static Stack<String> forward = new Stack<>();
	
	
	public static void main(String[] args) {
		goURL("1. 네이트");
		goURL("2. 네이버");
		goURL("3. 야후");
		goURL("4. 다음");
		
		printStatus();
		
		goBack();
		System.out.println("\n뒤로 가기 버튼 누른 후...");
		printStatus();
		
		goBack();
		System.out.println("\n뒤로 가기 버튼 누른 후...");
		printStatus();
		
		goForward();
		System.out.println("\n앞으로 가기 버튼 누른 후...");
		printStatus();
		
		goURL("5. 카카오");
		System.out.println("\n새로운 주소를 입력 후 ..");
		printStatus();
		
	} // main
	
	public static void goURL(String url) {
		back.push(url);
		
		if(!forward.empty()) {
			forward.clear();
		} // if
		
	} // goURL
	
	public static void goForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	} // goForward()
	
	public static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());
		} // if
	} // goBack
	
	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재 화면은 [" + back.peek() + "] 입니다.");
	} // printStatus

} // end class