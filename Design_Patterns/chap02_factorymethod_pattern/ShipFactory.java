package chap02_factorymethod_pattern;

public interface ShipFactory {
	
	default Ship orderShip(String name, String email) {
		validate(name, email);
		prepareFor(name);
		Ship ship = createShip();
		sendEmailTo(email, ship);
		
		return ship;
	}
	
	void sendEmailTo(String email, Ship ship);

	// 하위 클래스가 반드시 정의 해야한다.
	Ship createShip();
	
	private void validate(String name, String email) {
		if(name == null || name.isBlank()) {
			throw new IllegalArgumentException("배 이름을 지어주세요");
		}
		
		if(email == null || email.isBlank()) {
			throw new IllegalArgumentException("연락처를 남겨주세요");
		}
	}
	
	private void prepareFor(String name) {
		System.out.println(name + " 만들 준비 중...");
	}
	
} // end interface
