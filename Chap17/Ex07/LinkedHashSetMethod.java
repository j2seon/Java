package Chap17.Ex07;


//LinkedHashSet : 값의 정보에 내 앞에 값의 정보와 내 뒤의 위치정보를 가지고 있다.
	//HashSet과 공통점 : 모든 메소드가 동일하다. 중복된 값을 저장하지 않는다. 방번호(index)값을 가지지 않는다.
						//기본for문으로 출력할 수 없다. Iterator, 향상된 for문을 사용한다.
	//HashSet과 다른점 : HashSet은 입력대로 출력되지 않는다. LinkedHashSet은 입력대로 출력된다.

//단축키 정보 확인 :Ctrl + Shift + L


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Set : 인터페이스, 방번호(index)가 없다. 중복된 값을 넣을 수 없다.
	// - LinkedHashSet : 중복된 값을 넣을 수 없다. 출력시 순서대로 출력된다.  
	// - TreeSet  : 저장될때 값이 정렬이 되어서 저장. ascending (오름차순 정렬되어 저장됨) 0 -> 9 a -> z, 가 ->하 
											//참고 descending(내림차순 정렬) : 9->0, z->a, 하->가

public class LinkedHashSetMethod {

	public static void main(String[] args) {

		Set<String> linkedset1 =new LinkedHashSet<>(); //Set은 Interface 이므로 타입으로만 지정 
			//Set의 제너릭 타입변수로 Wrapper클래스를 사용할 경우, equals(),hashCode(),toString() 가 재정의 되어있다. 
			
		//1. add(E element) : Set에 값을 추가
		linkedset1.add("가"); linkedset1.add("나");linkedset1.add("가");  //"가"를 중복 저장 안됨. 두번 넣었지만 안된다~
		System.out.println(linkedset1);
		System.out.println(linkedset1.toString()); 	//toStrnig 메소드가 재정의 되어 있다.

		System.out.println("=================================");
		
		//2.addAll(다른 set 객체) : 자신의 Set에 다른 Set에 저장된 값을 추가 : 중복된 값은 제거됨.
		Set<String>linkedset2 = new HashSet();
		linkedset2.add("나");linkedset2.add("다"); //[나,다] 	//입력과 출력이 동일하다/
		linkedset2.addAll(linkedset1);
		System.out.println(linkedset2);
		
		//3. remove(Object o) : 값으로 삭제, (List 인 경우 방번호로 삭제)
		linkedset2.remove("나");
		System.out.println(linkedset2);
		
		//4. clear() : 모두삭제
		linkedset2.clear();
		System.out.println(linkedset2);
		
		//5. isEmpty() : 비어있으면 true, 비어있지 않으면 false
		System.out.println(linkedset2.isEmpty());

		
		//6. contains(Object o) : 값이 Set에 존재하면 true, 없으면 false
		Set<String>linkedset3 = new HashSet<>();
		linkedset3.add("가");linkedset3.add("나");linkedset3.add("다"); 
		System.out.println(linkedset3);
		System.out.println(linkedset3.contains("라"));  //false
		
		
		
		//7. size(): Set에 포함된 값의 갯수
		System.out.println(linkedset3.size());

		System.out.println("===========iterator()를 사용한 출력.===============");
		
		//8. iterator(): Set은 index를 가지지 않는다. for문은 방번호를 가지고 출력한다.따라서  for문은 사용 xxx //but enhanced for문은 사용가능
					// 순회자, Set의 값들을 순회하면서 출력.
					//hasNext(): Set의 값이 존재하면 true, 존재하지 않으면 false.
					// next() : 현재값을 출력하고 다음 값으로 이동 
			Iterator<String> iterator = linkedset3.iterator();
				//Iterator 클래스<E> 참조객체 = Set객체 .iterator();
			while(iterator.hasNext()){
				System.out.print(iterator.next()+"  ");
			}System.out.println();
			System.out.println("============== 향상된 for문 ================");
			for(String k : linkedset3) {
				System.out.print(k+ "  ");
			}
			System.out.println();
			//toArray() : Set의 값들을 배열로 보낸다. object 타입으로 리턴 따라서 다운캐스팅이 필요하다.
			Object[] obj = linkedset3.toArray();
			System.out.println(Arrays.toString(obj)); //간단하게 출력
			
			//for문 사용
			for(int i=0; i<obj.length; i++) {
				System.out.print(obj[i]);
			}
			System.out.println();
			//향상된 for문
			for(Object k : obj) {		//다운캐스팅이 필요하다.
				System.out.print(k);
			}
			System.out.println();
			
			//10.  toArray(T[] t) : 바로 다운 캐스팅을 한 후 출력.
			String[] strArray = linkedset3.toArray(new String[0]);  //0은 방의 크기를 지정.
														   // 방의 크기가 실제 값보다 작을 경우 방의 크기만큼 지정.
			System.out.println(Arrays.toString(strArray));
			
			
			//11. 실제 Set의 값보다 방의 크기를 크게 했을 경우는 null이 들어 갈 수 있다.
				String[] strArray2 = linkedset3.toArray(new String[5]);  //0은 방의 크기를 지정.
			// 방의 크기가 실제 값보다 작을 경우 방의 크기만큼 지정.
				System.out.println(Arrays.toString(strArray2));

	
	
			//12 
				Set<Integer> inSet1 =new LinkedHashSet();
				inSet1.add(30);inSet1.add(50);inSet1.add(10);inSet1.add(100);
				Iterator<Integer> iterator1 = inSet1.iterator();
				while(iterator1.hasNext()) {
					System.out.print(iterator1.next()+"  ");
				}
				System.out.println();
				for(Integer kk: inSet1) {
					System.out.print(kk+ "  ");
				} 
				
 	}
	

}


