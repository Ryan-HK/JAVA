package java_standard_exam;

public class LambdaEx1 {
	
	// 매개변수가 MyFunction인 메서드
	static void execute(MyFunction f) {
		f.run();
	};
	
	//반환 타입이 MyFunction인 메서드
	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		// 람다식으로 MyFunction의 run() 메서드를 구현해보자!
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		// 익명클래스로 구현해보기
		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("f2.run()");
			} // run
		};
		
		// 메서드 내부에 MyFunction의 run() 메소드가 구현되어 있다.
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		// 매개변수를 MyFunction을 받는다.
		// 이미 f1은 람다식을 통해 () -> System.out.println("f1.run()"); 으로 구현되어 있다.
		execute(f1);
		
		//이렇게 매개변수를 직접 구현해서 전달 할 수도 있다.
		execute( () -> System.out.println("run()"));
		
	} // main

} // end class

@FunctionalInterface
interface MyFunction {
	void run();
}
