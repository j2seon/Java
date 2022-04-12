package Chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_1 {

	public static void main(String[] args) {
		//List의 메소드 : 13개 정도의 메소드 , 
			//1. ArrayList
			//2. Vector
			//3. LinkedList
		List<Integer> aList1 =new ArrayList<Integer>();
		
		//1. add(E element) : 마지막 값에 값을 추가하기.
		aList1.add(3);aList1.add(4);aList1.add(5);
		System.out.println(aList1);		//값출력
		System.out.println(aList1.size()); 	//값의 갯수
		
		//2.add (int index, E element)
		aList1.add(1,6);	//방번호 1번에 6을 추가
		System.out.println(aList1);
		
		//3. addAll(또다른 리스트의 객체를 복사해서 추가)
		List<Integer> aList2 =new ArrayList();
		aList2.add(1);
		aList2.add(2);
		
		aList2.addAll(aList1); //aList1 저장된 값을 복사해서 aList2에 추가함.
		System.out.println(aList2);
		
		//4. addAll(int index,또다른 객체)
		List<Integer> aList3 = new ArrayList();
		aList3.add(1);
		aList3.add(2);
		aList3.addAll(1,aList3); //자신의 값에 추가 ==> 다른객체를 추가
		System.out.println(aList3);
		
		//5. set(int index, E element) : 특정 방번호의 값을 수정
		aList3.set(1,5); //1번 방번호의 값을 5로 수정해라
		//aList3.set(4,7); // 4번방이 없으므로 오류발생
		System.out.println(aList3);
		
		//6. remove(int index) : 특정 방번호의 값을 삭제, 
		aList3.remove(1); //방번호 1번 방에 있는 값을 삭제
		System.out.println(aList3);
		
		//7. remove (Object o) : 값으로 삭제.
		aList3.remove(new Integer(2));
		System.out.println(aList3);
		
		//8.clear() : 모두삭제
		aList3.clear();
		System.out.println(aList3);
		
		//9. isEmpty() : 값이 비어있으면 True, 비어있지 않으면 false
		System.out.println(aList3.isEmpty());
		
		//10. size() : 방의 갯수, 값의 갯수
		System.out.println(aList3.size());
		aList3.add(1);aList3.add(2);aList3.add(3);
		System.out.println(aList3.size());
		
		//11. get(int index) : 방번호의 값을 출력
		System.out.println(aList3.get(0));
		System.out.println(aList3.get(1));
		System.out.println(aList3.get(2));
		
		System.out.println("=================================");
		System.out.println(aList3); //List일때 객체를 출력하면 객체의 값이 출력된다!!! but 배열일때는 다르다.
		
		//12. toArray() : List(리스트) ---> Array(배열)로 변환
		Object[] object = aList3.toArray(); 	//기본적으로 toArray() 메소드는 Object 타입으로 리턴이 됨.
			// 다운캐스팅이 필요하다. 
		System.out.println(Arrays.toString(object)); //배열일때는 Arrays.toStrnig으로 사용.
		
		System.out.println("==================");
		
		//13-1 toArray(T[]t) ---->t[] : Inter로 바로 캐스팅
		Integer[] integer1 =aList3.toArray(new Integer[0]);
			//0의 의미 : 리스트에 저장된 값보다 작을 경우 리스트에 저장된 값만 가지고 온다.
		System.out.println(Arrays.toString(integer1));
		System.out.println("====================");
		
		//13-1 toArray(T[]t) ---->t[] : Inter로 바로 캐스팅
		Integer[] integer2 =aList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
	}

}
