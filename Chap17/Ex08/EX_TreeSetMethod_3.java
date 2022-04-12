package Chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

import Chap06_07.Ex02.A;

//이름과 나이를 입력시 이름을 오름차순으로 출력하도록 구현한다.
//1.Comparable<E>의 comparTo()메소드 재정의
	//기존의 객체 수정 필요
//2. Comparator compare
	//기존의 객체를 수정 없이 구현

class Abc{
	String name; 	//<정렬 컴럼. 가나다라....하, 이름 3개 넣기
				// 홍길동, 이순신, 강감찬 ===> 강감찬, 이순신, 홍길동
	int age;		//나이
	Abc(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return name+ " ";
	}
}

class Abc_T implements Comparable<Abc_T>{
	String name;
	int age;
	public Abc_T(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Abc_T o) {
		return(this.name.compareTo(o.name));

	}
	
	
}


public class EX_TreeSetMethod_3 {

	public static void main(String[] args) {
		TreeSet<Abc_T> treeset1= new TreeSet<>();
		
		Abc_T a1= new Abc_T("홍길동", 20);
		Abc_T a2= new Abc_T("이순신", 30);
		Abc_T a3= new Abc_T("강감찬", 40);
		
		treeset1.add(a1);
		treeset1.add(a2);
		treeset1.add(a3);
		System.out.println(treeset1);
		
		TreeSet<Abc> treeset2= new TreeSet<>(new Comparator<Abc>() {

			@Override
			public int compare(Abc o1, Abc o2) {
				return(o1.name.compareTo(o2.name));

			}
		});
		Abc abc1 = new Abc("홍길동", 20);
		Abc abc2 = new Abc("이순신", 30);
		Abc abc3 = new Abc("강감찬", 40);
		
		treeset2.add(abc1);
		treeset2.add(abc2);
		treeset2.add(abc3);
		System.out.println(treeset2);
	}
}
