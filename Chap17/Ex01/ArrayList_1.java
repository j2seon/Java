package Chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//java.lang 패키지의 클래스들은 import가 필요하지 않다.
/* 컬랙션 : 동일한 자료형을 저장, 방의 크기가 동적으로 변화 
 * 배열 : 동일한 자료형을 저장, 방의 크기가 고정되어있다, 배열 생성 시 방의 크기를 지정
 * 		 방의 크기는 수정 불가
 * 
 * List<E> : 인터페이스, 제너릭 인터페이스 : 다양한 데이터 타입을 사용가능
  	- 특징: 인덱스(Index 방번호)를 가지고 있다. 방의 크기는 동적으로 변화한다.  
	- ArrayList<E> : 싱글 쓰레드환경에서 사용. 검색은 빠르나 값을 추가하거나 제거할때 느리다.
	- Vector<E> : 멀티 쓰레드 환경에서 사용. 모든메소드가 동기화 되어있다.
	- LinkedList<E> : 검색은 느리지만 값을 추가하거나 제거할때 빠르다.
*/
public class ArrayList_1 {
	public static void main(String[] args) {
	//1. 배열
		String array[]=new String[] {"가","나","다","라","마","바","사"};
		System.out.println(array.length);  //7
		array[2]=null;
		array[5]=null;
		System.out.println(array.length); 	//7
		
		//1.Arrays.toStrnig)(배열변수)
		System.out.println(Arrays.toString(array)); //Arrays.toString(배열변수)
		//2. for문 사용
		for(int i =0; i<array.length; i++) {
			if(i==array.length-1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]+ " , ");
			}
		}
		System.out.println();
		//3. 향상된 for문
		for (String k: array) {
			System.out.print(k + " , ");
		}
	
		System.out.println();
	//2. List : 인터페이스 , 객체생성을 할 수 없음, 타입은 지정 가능
		
		List<String> aList1= new ArrayList<String>();
		List<String> aList2= new ArrayList<>();
		List<String> aList3= new ArrayList();
		
		//List에서 방의 개수출력 : aList.size();//size()사용		//length:배열에서 사용 
		
		System.out.println(aList1.size());  //방의 크기는 0
		
		//List에 값 할당하기 : aList.add(값할당); 제일 마지막에 값을 추가
		aList1.add("가");aList1.add("나");aList1.add("다");aList1.add("라");aList1.add("마");aList1.add("바");aList1.add("사");
		//List에 저장된 데이터의 개수 구하기 : aList.size()
		System.out.println(aList1.size());
		
		//List에 저장된 값을 제거 : aList.remove("삭제할내용")
		aList1.remove("다");
		aList1.remove("바");
		System.out.println(aList1.size());

		//List는 index를 가지고 있다. (1.for 문 출력)
		for(int i =0; i<aList1.size(); i++) {
			System.out.print(aList1.get(i));
		}
		//2.향상된 for
		
		System.out.println();
		//3. 객체의 toStrnig()을 호출해서 출력
		System.out.println(aList1);		// List는 toStrnig이 재정의 되어있다.
		
		}
	}


