package chap02_factorymethod_pattern;

public class BlackshipFactory implements ShipFactory {

	@Override
	public Ship createShip() {
		return new Blackship();
	}
	
	

}
