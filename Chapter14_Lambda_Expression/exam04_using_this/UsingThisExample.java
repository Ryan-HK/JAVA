package exam04_using_this;

public class UsingThisExample {
	
	public static void main(String[] args) {
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();	// 내부 클래스를 선언하는법
		
		inner.method();
		
		
	} // main
	
	
} // end class

class UsingThis {
	
	public int outterField = 10;
	
	class Inner {
	 	int innerField = 20;
	 	
	 	void method() {
	 		
	 		MyFunctionalInterface fi = () -> {
	 		System.out.println("outterField : " + outterField);
	 		System.out.println("outterField : " + UsingThis.this.outterField);
	 		
	 		System.out.println("innerField : " + innerField);
	 		System.out.println("innerField : " + this.innerField);
	 		};
	 		
	 		fi.method();
	 		
	 	} // method
	 	

	} // end class - Inner
	
} // end class

interface MyFunctionalInterface{
	
	public void method();
	
} // end interface
