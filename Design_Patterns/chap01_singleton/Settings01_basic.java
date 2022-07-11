package chap01_singleton;

public class Settings01_basic {
	
	private static Settings01_basic instance;
	
	// 생성자를 private로 만들어준다.
	// 외부에서는 new로 객체 생성을 할 수 없다.
	private Settings01_basic() {
		;;
	} // default Constructor
	
	// getInstance를 static메소드로 선언한다.
	// ** static으로 선언된 메소드는 MethodArea에 저장되어,
	// 프로그램이 시작되었을 때부터 생성이 되기 때문에, 
	// 별도의 인스턴스 생성 없이 메소드 접근이 가능하다.
	public static Settings01_basic getInstance() {
		// 만약 instance가 null이라면 객체를 생성한다. 
		if(instance == null) {
			instance = new Settings01_basic();
		}
		
		return instance;
	}
	
} // end class

