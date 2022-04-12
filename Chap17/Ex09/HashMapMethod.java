package Chap17.Ex09;


//Map<K,V> : K<= Key, V<=Value 형식으로 데이터를 저장.
	//key는 중복될 수 없다. <= Set으로 관리. index가 아니다. index는 0부터 할당, JVM이 할당함.
	//Value는 중복된 값을 넣을 수 있다.

	//HashMap : 출력이 랜덤하게 됨다!!

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer,String> hMap1 = new HashMap<>();
		
		//1.put(K key, V value) : 값을 넣을때.
		hMap1.put(2,"나다라");
		hMap1.put(1,"가나다");
		hMap1.put(3,"다라마");
		//hMap1.put(3,"가가가");  //키는 중복해서 저장될 수 없다. 값을 넣을 경우 기존의 값이 수정된다/
		System.out.println(hMap1);

		//2.putAll(다른맵객체) : 다른맵을 복사해서 사용.
		Map<Integer, String> hMap2 =new HashMap<>();
		hMap2.putAll(hMap1);
		System.out.println(hMap2);
		
		//replace(K key, V value) ; key에 저장된값을 value로 수정.
		hMap2.replace(1, "가가가");
		hMap2.replace(4, "라라라"); //key4는 존재하지 않는다. 작동이 안됨. (에외도 발생이 안됌.)
		System.out.println(hMap2);
		
		//4. replace(K key, V oldValue, V newValue,) : oldValue를 newValue로 수정
		hMap2.replace(1, "가가가","나나나");
		hMap2.replace(2, "다다다","라라라"); //동작안됨 <==key와 value가 정확히 일치해야 수정됨.
		
		System.out.println(hMap2);
		//5.get(Object key) : Map의 값을 가져올때. key를 넣어줘야 Key에 할당된 Value를 출력.
		
		System.out.println(hMap2.get(1)); //주의!!! index가 아니라 Key
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		
		//6.containsKey(Object key) ; 맵에 해당키가 존재하는지 확인. true, false
		System.out.println(hMap2.containsKey(1));	//true
		System.out.println(hMap2.containsKey(5)); //false
		
		//7.containsValue(Object value) : 맵에 해당 값이 존재하는 지 확인, true, false
		System.out.println(hMap2.containsValue("나나나"));	//true
		System.out.println(hMap2.containsValue("하하하")) ;   //false
	
		//8. SEt<K> keySet(): 키만 추출
		Set<Integer> keySet = hMap2.keySet(); 	//hmap2의 저장된 KeySet을 추출 //Set 으로 선언
		Iterator<Integer> itor = keySet.iterator();
		while(itor.hasNext()) {
			Integer itg = itor.next();
			String str1 =hMap2.get(itg);
			System.out.println("key  "+itg+" value : "+str1);
		}
		
		//9. Set<Map.Entry<K,V>> entrySet() : 키와 값의 Set을 추출
		Set<Map.Entry<Integer, String>> entrySet =hMap2.entrySet();
		System.out.println(entrySet);
		
		//10.size(); 총 갯수
		System.out.println(hMap2.size()); //3
		
		//11. remove(Object key) 해당 키로 Key와 value를 삭제.
		hMap2.remove(1);	//1번 삭제
		hMap2.remove(4);	//동작하지 않음.
		System.out.println(hMap2);
	
		//12. remove(Object key, Object value) key와 value가 정확하게 일치할 때 삭제.
		hMap2.remove(2,"나다라"); //삭제
		hMap2.remove(3,"다다다");	//동작안함. Key와 value가 정확하게 일치해야함.
		System.out.println(hMap2);
		
		//13.clear() : 모두 삭제
		hMap2.clear();
		System.out.println(hMap2);
		
		
	
	}
	

}
