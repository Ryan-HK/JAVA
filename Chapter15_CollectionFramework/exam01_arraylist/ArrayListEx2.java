package exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		final int LIMIT = 10;
		String source = "0123456789abcdefghijklmnopqrstuvwxyz";
		int length = source.length();
		
		// 여유있게 ArrayList 생성
		List<String> list = new ArrayList<String>(length + LIMIT);
		
		for(int i=0; i<length; i+=LIMIT) {
			if(i+LIMIT < length) {
				list.add(source.substring(i, i+LIMIT));
			} else {
				list.add(source.substring(i));
			}
		}
		
		list.forEach( s -> System.out.println(s));
	} // main

} // end class
 