package chap01_singleton;

public class Settings04_double_checked_locking {
	
	// volatile 키워드를 사용한다.
	// 다중의 스레드들은 각각의 cache에 저장한다.
	// volatile 사용 시, main-momory에 저정하겠다고 명시적으로 표현하는 것이다
	private static volatile Settings04_double_checked_locking instance;

	private Settings04_double_checked_locking() {
		;;
	} // default Constructor
	
	
	public static Settings04_double_checked_locking getInstance() {
		if(instance == null) {
			synchronized (Settings04_double_checked_locking.class) {
				if(instance == null) {
					instance = new Settings04_double_checked_locking(); 
				} // if
			} // synchronized 블럭
		} // if
		
		return instance;
	} // getInstance
	
} // end class

