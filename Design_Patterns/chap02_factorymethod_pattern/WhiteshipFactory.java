package chap02_factorymethod_pattern;

public class WhiteshipFactory implements ShipFactory {

	@Override
	public Ship createShip() {
		
		return new Whiteship();
	}

}
