package chap02_factorymethod_pattern;

public class WhiteshipFactory extends DefaultShipFactory {

	@Override
	public Ship createShip() {		
		return new Whiteship();
	}

}
