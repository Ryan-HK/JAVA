package chap02_factorymethod_pattern;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		
		client.print(new WhiteshipFactory(), "Whiteship", "keesun@mail.com");
		client.print(new BlackshipFactory(), "Blackship", "keesun@mail.com");
		
	} // main
	
	private void print(ShipFactory shipFactory, String name, String email) {
		System.out.println(shipFactory.orderShip(name, email));
	} // print

} // end class
