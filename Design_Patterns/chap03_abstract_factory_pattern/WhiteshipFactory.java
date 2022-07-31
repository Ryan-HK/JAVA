package chap03_abstract_factory_pattern;

import chap02_factorymethod_pattern.DefaultShipFactory;
import chap02_factorymethod_pattern.Ship;

public class WhiteshipFactory extends DefaultShipFactory {

	private ShipPartsFactory shipPartsFactory;
	
	public WhiteshipFactory (ShipPartsFactory shipPartsFactory) {
		this.shipPartsFactory = shipPartsFactory;
	}
	
	@Override
	public Ship createShip() {		
		Ship ship = new Whiteship();
		ship.setAnchor(shipPartsFactory.createAnchor());
		ship.setWheel(shipPartsFactory.createWheel());
		
		return ship;
	} // createShip
 
} // end class
