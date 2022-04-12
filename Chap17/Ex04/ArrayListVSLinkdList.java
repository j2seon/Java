package Chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList vs LinkedList
//ArrayList : 값에 대해서 index값을 가지고 있다.(index방번호가 고정적이다.) 검색속도가 빠르다.
			//단점 : 중간에 값을 추가/삭제 시 부하가 굉장히 많이 걸린다.
//linkedList : 각 각의 값은 앞뒤의 연결고리만 가지고 있다. 검색 시에 index번호를 가지게된다.따라서 ArrayList에 비해서 느리다.
			// 장점 : 중간에 값을 추가/삭제 시 부하가 걸리지 않는다.



public class ArrayListVSLinkdList {

	public static void main(String[] args) {
		// 1.데이터를 추가시간 비교
		List<Integer> aList =new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		long startTime = 0, endTime=0;
		
		//1-1 Array List에서 데이터 추가시간
		startTime = System.nanoTime();		//System.nanoTime() :
		for(int i=0; i<100000; i++) {
			aList.add(0, i); // 0번쨰 방에서 계속해서 10만번째 까지, 계속 뒤로 밀리면서 값이 추가된다.
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList에서 데이터 추가시간"+ (endTime-startTime)+"ns");
			//507863300ns
		//1-2 LinkedList에서 데이터 추가 시간 : ArrayList보다 빠르다.
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedlist.add(0,i);
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList에서 데이터 추가시간"+ (endTime-startTime)+"ns");
			//6676900ns : 250배 정도 빠르다
		
		System.out.println("=====================================");
		
		//2. 검색 시 비교. : arrayList가 LinkedList보다 빠르다.
		//2-1 ArrayList 검색시간
		startTime = System.nanoTime();
		for(int i =0; i<1000000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("arrayList에서 데이터 검색 시간"+ (endTime-startTime)+"ns");
		
		//2-2 LinkedList 검색시간
		startTime = System.nanoTime();
		for(int i =0; i<1000000; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList에서 데이터 검색 시간"+ (endTime-startTime)+"ns");
		
		//3. 데이터 삭제시 실행시간 비교 : LinkedList가 훨씬 빠르다.
		startTime = System.nanoTime();		//System.nanoTime() :
		for(int i=0; i<100000; i++) {
			aList.get(i); // 0번쨰 방에서 계속해서 10만번째 까지, 계속 뒤로 밀리면서 값이 추가된다.
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList에서 데이터 추가시간"+ (endTime-startTime)+"ns");
		
		startTime = System.nanoTime();		//System.nanoTime() :
		for(int i=0; i<100000; i++) {
			linkedlist.get(i); // 0번쨰 방에서 계속해서 10만번째 까지, 계속 뒤로 밀리면서 값이 추가된다.
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList에서 데이터 추가시간"+ (endTime-startTime)+"ns");

	}
}
