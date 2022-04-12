package Chap17.Ex01.EX1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exer2 {

	public static void main(String[] args) {

		/*List<E>는 인터페이스! 따라서 객체를 생성할 수 없다.
		 * LIst<E>를 구현하는 클래스들이 존재하기 때문에 그 클래스를 활용!!
		 * ArrayList Vector LInkedList!! 가 구현하는 것 
		 * 기본 용량은 10! 변경할 수도 있음 하지만 LInkedList는 xxxx
		 * 
		 * 두번째로 는 Arrays.asList를 사용하는 방법!!!!!
		 * Arrays.asList를 먼저 만들고 그걸 List로 감싼다고 생각해야한다. 따라서 new안들어감!!!!!
		 * 해당방법은 배열과 같기때문에 저장공간을 변경할 수 없다.
		 * */
		List<Integer> alist1= new ArrayList<Integer>(30);
		List<String> alist2 = new Vector<>(20);
		List<Integer> alist3 = new LinkedList<>(); 
	
	
		List<Integer> alist4 = Arrays.asList(1,2,3);
		System.out.println(alist4); //List로 감쌓기 때문에 그냥 변수만 넣어도 출력된다/
		alist4.set(0, 0);
		System.out.println(alist4);
	
	
	
	
	}

}
