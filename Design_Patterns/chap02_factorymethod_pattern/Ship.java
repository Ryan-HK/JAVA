package chap02_factorymethod_pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {
	
	private String name;
	private String color;
	private String logo;
	private String wheel;
	private String anchor;
	
	public String toString() {
		return "Ship(" +
				"name = '" + name + "\'" +
				", color = '" + color + "\'" +
				", logo = '" + logo + "\'" + "}";
	}
	
}
