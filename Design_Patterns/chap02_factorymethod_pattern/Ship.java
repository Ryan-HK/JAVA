package chap02_factorymethod_pattern;

import chap03_abstract_factory_pattern.Anchor;
import chap03_abstract_factory_pattern.Wheel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {
	
	private String name;
	private String color;
	private String logo;
	private Wheel wheel;
	private Anchor anchor;
	
	public String toString() {
		return "Ship(" +
				"name = '" + name + "\'" +
				", color = '" + color + "\'" +
				", logo = '" + logo + "\'" + "}";
	}
	
	
}
