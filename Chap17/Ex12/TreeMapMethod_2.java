package Chap17.Ex12;

import java.util.Comparator;
import java.util.TreeMap;

//TreeMap<K,V> : Key가 정렬되어서 처리<오름차순 정렬>
	//Key : 일반 객체를 사용할 경우, Comparable compareTo(),Comparator<E> compare() 재정의가 필요.


class MyClass{ //일반 클래스
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return data1+ " 값 출력";
	}
}

//Comparable<E> 인터페이스의 compareTo() 재정의

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	public  MyComparableClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return data1+ " 값 출력";
	}
	
	@Override
	public int compareTo(MyComparableClass o) { //오름차순 정렬 방식처리
		if(this.data1 < o.data2) {
			return-1;
		}else if(this.data1 == o.data2) {
			return 0;
		}else {
			return 1;
		}
		
	}}

public class TreeMapMethod_2 {
	public static void main(String[] args) {

		//1.MyClass를 TreeMap의 Key로 인풋할 경우 : 실행 시 오류
//		TreeMap<MyClass, String> treemap1 =new TreeMap<>();
//		
//		MyClass m1 = new MyClass(2, 5);
//		MyClass m2 = new MyClass(3, 3);
//		
//		treemap1.put(m1, "첫번째"); 		//Comparable,Comparator 구현하지 않았는데 TreeMap의 Key로 사용 , 실행 시 오류
//		treemap1.put(m2, "두번째");		
//		System.out.println(treemap1);
		  
		//2. Comparable을 구현한 클래스 사용.
		TreeMap<MyComparableClass, String> treemap2 = new TreeMap<>();
		
		MyComparableClass my1 = new MyComparableClass(2,5);
		MyComparableClass my3 = new MyComparableClass(10,5);
		MyComparableClass my2 = new MyComparableClass(3, 3);
		
		treemap2.put(my1, "첫번째");
		treemap2.put(my3, "세번째");
		treemap2.put(my2, "두번째");
		
		System.out.println(treemap2.size()); //2
		System.out.println(treemap2);
		
		//3.Comparator를 구현 : 기존의 객체를 사용, 객체 수정이 불필요하다.
		TreeMap<MyClass, String> treemap3 = new TreeMap<>(new Comparator<MyClass>() {
			//익명자식 클래스
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if(o1.data1<o2.data1) {
					return -1;
				}else if(o1.data1 == o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		MyClass m4 = new MyClass(2, 5);
		MyClass m6 = new MyClass(20, 20);
		MyClass m5 = new MyClass(3, 3);
		
		treemap3.put(m4, " 첫번째");
		treemap3.put(m6, "세번째");
		treemap3.put(m5, " 두번째");
		System.out.println(treemap3);
		System.out.println(treemap3.size());
		
		
		
	}

}
