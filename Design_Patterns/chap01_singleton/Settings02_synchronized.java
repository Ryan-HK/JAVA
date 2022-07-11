package chap01_singleton;

public class Settings02_synchronized {
	
	private static Settings02_synchronized instance;

	private Settings02_synchronized() {
		;;
	} // default Constructor
	
	// 자바의 동기화 블럭처리 방법으로 synchronized를 사용하여 
	//멀티쓰레드 환경에서 안전하게 만든다.
	
	// 다만, 이 방법은 getInstance가 불릴때마다 동기화 처리하는데
	// 성능에 불이득이 발생한다!!
	
	// 이때, getInstance메소드는 static이므로 동기화 시, 사용되는
	// 락(lock)는 클래스의 락이다.
	public static synchronized Settings02_synchronized getInstance() {
		// 만약 instance가 null이라면 객체를 생성한다. 
		if(instance == null) {
			instance = new Settings02_synchronized();
		}
		
		return instance;
	}
	
} // end class

