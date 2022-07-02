package exam06_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("java", "8");
		
		
	} // main

} // end clas
