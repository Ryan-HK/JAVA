package exam01_no_parameter_and_return;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		
		fi.method();
		
		fi = () -> {
			System.out.println("method call2");
		};
		
		fi.method();
		
		fi = () -> System.out.println("method call3");
		
		fi.method();
		
		
	} // main
} // end class


@FunctionalInterface
interface MyFunctionalInterface {
	
	public void method();
	
} // end interface
