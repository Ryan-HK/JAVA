package chap02_factorymethod_pattern;

public class BlackshipFactory extends DefaultShipFactory {

	@Override
	public Ship createShip() {
		return new Blackship();
	}

}
