package Chap17.Ex04.EX01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exer {

	public static void main(String[] args) {
		
		/* List 인터페이스를 상속하는 아이들 중 ArrayList vs LinkedList!
		 * 
		 * ArrayList 는 index번호가 주어져있고 LinkedList는 서로 연결만 되어있다가 값을 출력할때 번호를 부여한다. 
		 * 
		 * 그렇게 되면!!! 값을 수정할때는 LinkedList가 훨씬 빠르고 ArrayList는 뒤로밀리니까 느려진다.
		 * 하지만 값을 출력할때는 LinkedList는 번호를 부여하야되기때문에 느리다!
		 *
		 * 값의 속도를 비교하기 위해서는 nanoTime()이라는 메소드를 사용해서 확인할 수 있다!
		 * */
		
		
		// 각 타입으로 객체를 만들어주었다!
		List<Integer> a1 =new ArrayList<>();
		List<Integer> a2 =new LinkedList<>();
		
		//Array로 값을 넣을때
		long start=0 ; long end=0;
		start=System.nanoTime();
		for(int i=0; i<100000; i++) {
			a1.add(0,i);
		}
		end=System.nanoTime();
		System.out.println("Array 데이터에 값을 넣을 때 "+(end-start));
		
		for(int i=0; i<100000; i++) {
			a2.add(0,i);
		}
		end=System.nanoTime();
		System.out.println("Linked데이터에 값을 넣을 때 "+(end-start));
		
		
		
		
	}

}
