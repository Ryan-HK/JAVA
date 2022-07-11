package chap01_singleton;

public class Settings05_static_inner {
	
	private Settings05_static_inner() {
		;;
	} // default Constructor
	
	// 새롭게 객체생성 역할을 하는 Inner Class를 만든다.
	private static class SettingsHolder {
		
		private static final Settings05_static_inner SETTINGS = new Settings05_static_inner();
		
	} // end inner class
	
	// getInstance를 통해, Inner-Class에 접근하여, 생성 된 인스턴스를 리턴한다.
	public static Settings05_static_inner getInstance() {

		return SettingsHolder.SETTINGS;
		
	} // getInstance
	
} // end class

