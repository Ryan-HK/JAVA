package exam04_hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

public class HashSetExample2 {
	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		// 얼핏보면 두 객체는 같이 보인다. 하지만 new 객체로 생성하기 때문에 다른 인스터긴 하지만!
		// Member 클래스에서 equals메서드와 hashCode 메서드를 오버라이딩 해었다.
		// 객체 내부에서는 동일한 데이터로 인식하여, 객체는 1개만 저장 된다.
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체 수 : " + set.size());
		
	} // main

} // end class

@AllArgsConstructor
@EqualsAndHashCode
class Member {
	public String name;
	public int age;
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member)obj;
//			return ( member.name.equals(this.name) )&& ( member.age == this.age );
//		} else {
//			return false;
//		}
//	} // equals
	
//	@Override
//	public int hashCode() {
//		return name.hashCode() + age;
//	} // hashCode
//	
//	public int hashCode(){
//		return Objects.hash(name, age);
//	}
}
