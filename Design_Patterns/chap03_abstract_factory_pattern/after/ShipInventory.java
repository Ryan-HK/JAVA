package chap03_abstract_factory_pattern.after;

import chap02_factorymethod_pattern.Ship;
import chap02_factorymethod_pattern.ShipFactory;
import chap03_abstract_factory_pattern.WhiteshipFactory;
import chap03_abstract_factory_pattern.WhiteshipPartsFactory;

public class ShipInventory {
	
	public static void main(String[] args) {
		ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
		
		Ship ship = shipFactory.createShip();
		System.out.println(ship.getAnchor().getClass());
		System.out.println(ship.getWheel().getClass());
		
		
	} // main

} // end class
