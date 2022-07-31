package chap03_abstract_factory_pattern;

public interface ShipPartsFactory {

	Anchor createAnchor();
	
	Wheel createWheel();
	
} // end interface
