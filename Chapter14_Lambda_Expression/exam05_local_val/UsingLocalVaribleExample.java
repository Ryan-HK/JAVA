package exam05_local_val;

public class UsingLocalVaribleExample {
	
	public static void main(String[] args) {
		UsingLocalVariable ulv = new UsingLocalVariable();
		ulv.method(20);
		
	} // main

} // end class

class UsingLocalVariable {
	
	void method(int arg) {
		int localVar = 40;
		
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar + "\n");
		};
		
		fi.method();
	}
	
} // end class

interface MyFunctionalInterface {
	public void method();
} // end interface