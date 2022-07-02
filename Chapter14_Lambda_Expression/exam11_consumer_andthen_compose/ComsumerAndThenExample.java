package exam11_consumer_andthen_compose;

import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class ComsumerAndThenExample {
	
	public static void main(String[] args) {
		Consumer<Member> consumerA = m -> System.out.println("consumerA: " + m.getName());
		Consumer<Member> consumerB = m -> System.out.println("consumerB: " + m.getId());
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
	} // main

} // end class

@AllArgsConstructor
@Getter
class Member {
	private String name;
	private String id;
	private Address address;
}

@AllArgsConstructor
@Getter
class Address{
	private String country;
	private String city;
}
