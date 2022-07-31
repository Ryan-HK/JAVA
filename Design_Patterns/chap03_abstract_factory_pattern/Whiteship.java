package chap03_abstract_factory_pattern;

import chap02_factorymethod_pattern.Ship;

public class Whiteship extends Ship {

	public Whiteship() {
		setName("whiteship");
		setLogo("고래");
		setColor("white");
	}
}
