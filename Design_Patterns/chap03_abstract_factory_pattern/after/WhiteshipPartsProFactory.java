package chap03_abstract_factory_pattern.after;

import chap03_abstract_factory_pattern.Anchor;
import chap03_abstract_factory_pattern.ShipPartsFactory;
import chap03_abstract_factory_pattern.Wheel;

public class WhiteshipPartsProFactory implements ShipPartsFactory{

	@Override
	public Anchor createAnchor() {
		return new WhiteAnchorPro();
	}

	@Override
	public Wheel createWheel() {
		// TODO Auto-generated method stub
		return new WhiteWheelPro();
	}

}
