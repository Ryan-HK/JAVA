package chap03_abstract_factory_pattern;

public class WhiteshipPartsFactory implements ShipPartsFactory{

	@Override
	public Anchor createAnchor() {
		return new WhiteAnchor();
	}

	@Override
	public Wheel createWheel() {
		return new WhiteWheel();
	}

} // end class
