package exam02_vector;

import java.util.Vector;

public class VectorEx1 {
	
	public static void main(String[] args) {
		// size가 5인 Vector 생성
		Vector<Integer> v = new Vector<>(5);
		
		v.add(1);
		v.add(2);
		v.add(3);
		
		// size와 capacity를 같게 해준다.
		// 배열은 기본적으로 용량(capacity)를 변경할 수 가 없다.
		// List의 구현 클래스는 새로운 배열을 생성 한 후에, 그 주소값을 변수에 다시 할당한다.
		// 즉 Vector v가 처음에 참조하였던 인스턴스는 더 이상 사용할 수 가 없다.
		// 이 인스턴스는 후에, 가비지컬렉터(garbage collector)에 의해 메모리 상에서 삭제 된다.
		v.trimToSize();
		print(v);
		
		// ensureCapacity(6)는 v의 capacity가 최소한 6으로 설정해준다.
		// 현재 배열의 크기가 3이기 때문에, 새로운 인스턴스를 생성한 후, v는 그 주소를 참조하게 된다.
		v.ensureCapacity(6);
		print(v);
		
		// setsize(int size) : 최소 크기를 정해준다.
		// 지금 v의 size는 3이며, capacity는 6이다. capacity가 정해준 size보다 크면 상관이 없으나,
		// 작기 때문에, 새로운 인스턴스를 생성하고, 그 주소를 참조한다.
		// capacity가 부족하여, 새로운 인스턴스 생성시에는 2배가 할당된다.
		// 값이 안들어 간 공간에는 null 값들이 들어간다.
		v.setSize(7);
		print(v);
		
	} // main
	
	// Vector의 저장한 객체 / size / Vector의 크기를 알 수 있는 메소드
	public static void print(Vector<Integer> v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity());
		System.out.println();
	} 

} // end class
