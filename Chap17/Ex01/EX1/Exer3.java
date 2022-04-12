package Chap17.Ex01.EX1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exer3 {

	public static void main(String[] args) {
		
		//내가 지금 LIst인터페이스를 변수 a1인 ArrayList로 구현했어!!
		List<Integer> a1 =new ArrayList<Integer>(); 
		
		//값을 넣어줄게!
		a1.add(1);a1.add(1);a1.add(2);a1.add(2);a1.add(7);
		System.out.println(a1); //위의 값들이 배열로 추가되었엉!
		
		//근데 0번째에 다른값을 넣는걸 깜박했네? 값을 넣어주자!
		a1.add(0,4); //넣고싶은 위치, 값 쓰면돼!
		System.out.println(a1); 
		
		//다른 객체가 있는데 개랑 애랑 합쳐야된데!! 먼저 들어가는 다른객체는..a2야!
		List<Integer> a2 = new ArrayList<>();
		a2.add(3);a2.add(6);a2.add(9);a2.add(12);
		
		//a2를 a1뒤에 오도록할게!
		a1.addAll(a2);
		System.out.println(a1);
		
		// 앗 근데 애가 1번째 부터 넣어주래!!
		a1.addAll(1,a2);
		System.out.println(a1);
		
		//그리고 5번째 1을 15로 바꿔달래!
		a1.set(5, 15);
		System.out.println(a1);
		
		//너무 길어졌다고 0번째 4를 없애달래!
		a1.remove(0);
		System.out.println(a1);
		
		//그래도 길다고 1,2도 없애달래
		a1.remove(new Integer(2));
		a1.remove(new Integer(2));
		a1.remove(new Integer(1));
		System.out.println(a1);
		
		//원하는 값 나왔으니까 다 지워달래
		a1.clear();
		System.out.println(a1);
		//지워졌는지 확인해줘!!
		System.out.println(a1.isEmpty());
		
		//아까 넣었던 a2 값은 몇개였지?
		System.out.println("size : "+a2.size());
		
		//그럼 a2의 마지막 위치한 값은 얼마야?
		System.out.println(a2.get(3));
		
		//그럼 전부다 알려줘!!!
		for(int i=0; i<a2.size(); i++) {
			System.out.println(i+"번째 :" + a2.get(i));
		}
		
		//고생했다 ㅎㅎ 근데 List가 어색해서 그런데 배열로 바꿔줄 수 있어?
		Object[] ob = a2.toArray();
		System.out.println(Arrays.toString(ob));
		
		//숫자 타입으로 넣어주라!
		Integer[] it= a2.toArray(new Integer[0]);
		System.out.println(Arrays.toString(it));
		//근데 나 값 5개여야돼 ㅠㅠ 
		Integer[] it2 = a2.toArray(new Integer[5]);
		System.out.println(Arrays.toString(it2));
		
		
	}

}
