package chap01_singleton;

public class Settings03_eager_initialization {
	
	// 객체의 크기가 미리 생성해주어도, 상관없을 때 사용한다.
	// 미리 객체를 초기화해주어, Thread-Safe하게 만든다.
	
	// 만약 객체를 생성하는데 메모리가 크게 걸리는 객체라면, 클래스가 로딩 될 대 많은 메모리를 차지한다.
	private static final Settings03_eager_initialization INSTANCE = new Settings03_eager_initialization();

	private Settings03_eager_initialization() {
		;;
	} // default Constructor
	
	
	public static Settings03_eager_initialization getInstance() {
		return INSTANCE;
	}
	
} // end class

