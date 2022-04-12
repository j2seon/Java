package Chap17.Ex12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap<K,V> : 저장시에 Key를 기준으로 오름차순 정렬되어 저장됨.
		//출력 시에 오름차순 정렬되어 출력.
		// Key에 일반 객체를 저장할때 comparable<E> compareTo()를 재정의<== 객체 수정 및 재 컴파일, 
								//Comparator<E> compare()를 재정의 <== 객체 수정 없이 사용
							
//Map<K,V><==SortedMap<K,V>(정렬 메소드 정의) <<=NavigableMap<K,V> (검색메소드 정의)	< = TreeMap<K,V>
		//TreeMap을 사용할때는 타입을 TreeMap으로 지정해서 검색, 정렬의 메소드를 사용할 수 있다.


public class TreeMapMethod_1 {

	public static void main(String[] args) {
		// TreeMap<K,V>은 Map<K,V> 메소드를 모두 사용, 추가적으로 SortedMap, NavigableMap의 추가적인 메소드를 사용.
		TreeMap<Integer,String> treemap=new TreeMap(); //오름차순으로 정렬되어 입력됨.
		
		for(int i =20; i>0; i-=2) {
			treemap.put(i, i+"번째 데이터");
		}
		System.out.println(treemap); //Key,Value : Key를 기준으로 오름차순 정렬됨.
		
		//1.firstKet() : 제일 첫번째 키를 출력
		System.out.println(treemap.firstKey()); //2
		
		//2. firstEntry(): entry = Key+Value 쌍
		System.out.println(treemap.firstEntry());
		
		//3. lastKey() : 마지막키
		System.out.println(treemap.lastKey()); //20

		//4. lastEntry() : 마지막 키와 값
		System.out.println(treemap.lastEntry());
		
		//5. lowerKey (K key) : 입력받은 키의 낮은 값  		 시작일때는 포함, 끝일때는 미포함.
		System.out.println(treemap.lowerKey(10)); //8
		
		//6. higherKey(K key) : 
		System.out.println(treemap.higherKey(10)); //12
		
		//7. pollFirstEntry() :첫번째 키와 값을 끄집어 내온다.
		System.out.println(treemap.pollFirstEntry());
		System.out.println(treemap); //끄집어 내면 출력해 값이 빠진다.
		
		//8.pollLastEntry() : 마지막 값의 키와 값을 끄집어 내어온다.
		System.out.println(treemap.pollLastEntry());
		System.out.println(treemap);
		
		//9. SoredMap<K,V> headMap(K toKey) : 인풋받은 키의 head 쪽으로 처리 (아퍽)
		SortedMap<Integer, String> smap=treemap.headMap(8);
		System.out.println(smap);
		
		//10.NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nmap = treemap.headMap(8, true); //key 8을 포함하면서 Head쪽으로 출력
		System.out.println(nmap);
		
		//11. SortedMap<K,V> tailMap(K toKey,boolean inclusive)
		SortedMap<Integer, String> nmap1 = treemap.tailMap(14);
		System.out.println(nmap1);
		//12.NavigableMap<K,V> tailMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nmap2 =treemap.tailMap(14, false);
		System.out.println(nmap2);
		
		//13.SortedMap<K,V> subMap(K fromKey, K toKey) : 특정범위의 값을 저장
		SortedMap<Integer,String> submap =treemap.subMap(6, 10);
		System.out.println(submap);
		
		//14.NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
			//
		NavigableMap<Integer, String> nsubmap =treemap.subMap(6, true, 10, true);
		System.out.println(nsubmap);
		
		//15.NavigableSet<K,V> descendingKeySet(): 현재 키 정렬을 반대로 출력
		NavigableSet<Integer> nSet=treemap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet()); 
		
		//16.NavigableMap<K,V>descendingKeyMap() : 현재 정렬을 반대로 정렬
		NavigableMap<Integer,String> nvmap = treemap.descendingMap();
		System.out.println(nvmap);
		System.out.println(nvmap.descendingMap());

		
		
		
		

	}

}
