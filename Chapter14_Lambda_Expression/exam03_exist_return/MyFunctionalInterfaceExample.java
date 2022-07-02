package exam03_exist_return;

public class MyFunctionalInterfaceExample {
	
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		
		System.out.println(fi.method(2,	5));
		
		
	} // main
	
} // end class

@FunctionalInterface
interface MyFunctionalInterface {
	
	public int method(int x, int y);
	
} // end interface