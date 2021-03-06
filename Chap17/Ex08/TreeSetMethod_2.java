package Chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

//TreeSet의 이점: 1. 중복저장되지 않는다.(Set의 특징) 2. 오름차순 정렬되어 입력, 3. 정렬되어 출력(오름차순), 검색기능 사용
				//5. 특정범위의 값을 추출 6. asc(오름차순정렬), desc(내림차순정렬)

//TreeSet에 일반 객체를 저장할 경우, 특정 필드를 크기비교 기준 필드가 존재해야한다.
	//1. Comparable<E> 인터페이스의 compareTo()메소드 재정의 : TreeSet에 일반 객체를 저장할 때 재정의해야한다.
		//기존클래스를 수정해서 사용.   comparable<E> 인터페이스를 상속 후 compareTo()메소드 재정의

	//2. Comparator<E> 인터페이스 compare()메소드를 재정의 함. <<익명 내부객체를 사용.
		//기존의 객체를 수정하지 않고 사용할때.
		//TreeSet<E> 객채를 생성할때 생성자에 Comparator<E>인터페이스를 구현한 익명객체를 생성.

	//3. 익명 내부객체를 사용해서 처리하는 방법.

class MyClass{
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return data1+" "+data2;
	}
}


//Comparable<E> 인터페이스를 구현한 클래스 생성
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;		//<<==필드를 비교기준으로 설정, CompareTo()를 재정의 
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public int compareTo(MyComparableClass o) { //객체의 크기비교 기준을 설정하는 메소드, <<TreeSet에서 사용>> (음수, 0, 양수)
			/*									// 오름차순 처리 방식 ! 내림차순은 숫자를 반대로 적용하면된다.
		if(this.data1 < o.data1) { 			//this.data1 기준
			return -1; 		//this.data1 기준 값이 작을 경우 : -1(음수)
		}else if(this.data1 == o.data1) {	//this.data1 기준 값이 같을 경우 : 0
			return 0;
		}else {								//this.data1 기준값이 클 경우 : 1 (양수)
			return 1;
		}*/
		if(this.data1 < o.data1) { 			//this.data1 기준
			return 1; 						//this.data1 기준 값이 작을 경우 : 1(양수)
		}else if(this.data1 == o.data1) {	//this.data1 기준 값이 같을 경우 : 0
			return 0;
		}else {								//this.data1 기준값이 클 경우 : -1 (음수)
			return -1;
		}
	}
	@Override
	public String toString() {
		return data1 + "  " + data2;
	}
}


public class TreeSetMethod_2 {

	public static void main(String[] args) {
		//Wrapper 클래스는 comparable<E> 인터페이스의 compareTo()메소드를 재정의하고 있다.
			//Wrapper 클래스의 값을 treeSet에 넣으면 정렬되어 저장된다.
		
		//1. Integer Wrapper 클래스의 크기 비교.
		TreeSet<Integer> treeset1 = new TreeSet<Integer>();
		Integer intvalue1 = new Integer(20); 	//큰값	
		//Integer intValue3 = 3; 도 가능
		Integer intvalue2 =new Integer(10);		//작은 값
		
		treeset1.add(intvalue1); treeset1.add(intvalue2);
		System.out.println(treeset1); 		// 오름차순 정렬 출력.
		
		//2. String Wrapper 클래스의 크기 비교.
		TreeSet<String> treeset2 =new TreeSet<String>();
		String str1 = new String("가나"); 	//작은값
		//String str1="가나"; 도 가능
		String str2=new String("다라");		//큰값
		
		treeset2.add(str1);			//treeset2.add()를 사용해서 객체를 저장할 경우 값의 크기를 비교하는 필드가 정의가 되어있어야한다.
		treeset2.add(str2); 		//Comparable<E> 인터페이스의 compareTo()메소드가 재정의 되어야 한다.
		System.out.println(treeset2);
		
		
		//3. Myclass(일반 클래스)가 TreeSet에 저장이 될까? 정답은 xxxxxxxxx (Comparable<E> 인터페이스의 compareTo()메소드가 재정의 되어야 TreeSet컬렉션에 저장가능)
//		TreeSet<MyClass> treeset3 =new TreeSet<MyClass>();
//		MyClass myclass1 = new MyClass(2, 5);
//		MyClass myclass2 = new MyClass(3, 3);
//		
//		treeset3.add(myclass2); 	// TreeSet에는 Comparable<E> 인터페이스의 comparTo() 메소드를 재정의한 클래스만 넣을 수 있다.
//		treeset3.add(myclass1);		//실행 시 오류 발생 런타임 오륜
//		
//		System.out.println(treeset3);	//실행시 오류

		//TreeSet에 일반객체를 저장할 경우
		//4.방법 1. MyComparableClass 객체 크기 비교. :Comparable<E> 인터페이스의 compareTo()재정의
				//기존객체의 수정이 필요. 다시 컴파일
		TreeSet<MyComparableClass> treeset4 = new TreeSet<MyComparableClass>();
		
		MyComparableClass m1 =new MyComparableClass(2, 5);  	//TreeSet에 저장될때 Comparable<E> 인터페이스의 compareTo()재정의
		MyComparableClass m2 =new MyComparableClass(5, 3);
		MyComparableClass m3 =new MyComparableClass(4, 3);
		treeset4.add(m1); 
		treeset4.add(m2);
		treeset4.add(m3);
		System.out.println(treeset4);
		System.out.println("=========================");
		
		//5. 방법 2. 기존의 객체를 수정하지 않고 TreeSet에 저장할경우. 
		//TreeSet 생성자 내부에 comparator<E>인터페이스를 정의해서 익명객체로 구현.
		TreeSet<MyClass> treeset5 =new TreeSet<>(new Comparator<MyClass>() {
			//Comparator<MyClass>를 구현한 익명 자식클래스 블락
			@Override
			public int compare(MyClass o1, MyClass o2) { //오름차순정렬!! data1 
				if(o1.data1<o2.data1) {
					return -1;
				}else if(o1.data1==o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		MyClass myclass1 = new MyClass(2,5);
		MyClass myclass2 = new MyClass(3,3);
		
		treeset5.add(myclass1);
		treeset5.add(myclass2);
		
		System.out.println(treeset5);
	
		}
	}


