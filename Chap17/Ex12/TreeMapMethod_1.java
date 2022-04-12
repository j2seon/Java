package Chap17.Ex12;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap<K,V> : ����ÿ� Key�� �������� �������� ���ĵǾ� �����.
		//��� �ÿ� �������� ���ĵǾ� ���.
		// Key�� �Ϲ� ��ü�� �����Ҷ� comparable<E> compareTo()�� ������<== ��ü ���� �� �� ������, 
								//Comparator<E> compare()�� ������ <== ��ü ���� ���� ���
							
//Map<K,V><==SortedMap<K,V>(���� �޼ҵ� ����) <<=NavigableMap<K,V> (�˻��޼ҵ� ����)	< = TreeMap<K,V>
		//TreeMap�� ����Ҷ��� Ÿ���� TreeMap���� �����ؼ� �˻�, ������ �޼ҵ带 ����� �� �ִ�.


public class TreeMapMethod_1 {

	public static void main(String[] args) {
		// TreeMap<K,V>�� Map<K,V> �޼ҵ带 ��� ���, �߰������� SortedMap, NavigableMap�� �߰����� �޼ҵ带 ���.
		TreeMap<Integer,String> treemap=new TreeMap(); //������������ ���ĵǾ� �Էµ�.
		
		for(int i =20; i>0; i-=2) {
			treemap.put(i, i+"��° ������");
		}
		System.out.println(treemap); //Key,Value : Key�� �������� �������� ���ĵ�.
		
		//1.firstKet() : ���� ù��° Ű�� ���
		System.out.println(treemap.firstKey()); //2
		
		//2. firstEntry(): entry = Key+Value ��
		System.out.println(treemap.firstEntry());
		
		//3. lastKey() : ������Ű
		System.out.println(treemap.lastKey()); //20

		//4. lastEntry() : ������ Ű�� ��
		System.out.println(treemap.lastEntry());
		
		//5. lowerKey (K key) : �Է¹��� Ű�� ���� ��  		 �����϶��� ����, ���϶��� ������.
		System.out.println(treemap.lowerKey(10)); //8
		
		//6. higherKey(K key) : 
		System.out.println(treemap.higherKey(10)); //12
		
		//7. pollFirstEntry() :ù��° Ű�� ���� ������ ���´�.
		System.out.println(treemap.pollFirstEntry());
		System.out.println(treemap); //������ ���� ����� ���� ������.
		
		//8.pollLastEntry() : ������ ���� Ű�� ���� ������ ����´�.
		System.out.println(treemap.pollLastEntry());
		System.out.println(treemap);
		
		//9. SoredMap<K,V> headMap(K toKey) : ��ǲ���� Ű�� head ������ ó�� (����)
		SortedMap<Integer, String> smap=treemap.headMap(8);
		System.out.println(smap);
		
		//10.NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nmap = treemap.headMap(8, true); //key 8�� �����ϸ鼭 Head������ ���
		System.out.println(nmap);
		
		//11. SortedMap<K,V> tailMap(K toKey,boolean inclusive)
		SortedMap<Integer, String> nmap1 = treemap.tailMap(14);
		System.out.println(nmap1);
		//12.NavigableMap<K,V> tailMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String> nmap2 =treemap.tailMap(14, false);
		System.out.println(nmap2);
		
		//13.SortedMap<K,V> subMap(K fromKey, K toKey) : Ư�������� ���� ����
		SortedMap<Integer,String> submap =treemap.subMap(6, 10);
		System.out.println(submap);
		
		//14.NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
			//
		NavigableMap<Integer, String> nsubmap =treemap.subMap(6, true, 10, true);
		System.out.println(nsubmap);
		
		//15.NavigableSet<K,V> descendingKeySet(): ���� Ű ������ �ݴ�� ���
		NavigableSet<Integer> nSet=treemap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet()); 
		
		//16.NavigableMap<K,V>descendingKeyMap() : ���� ������ �ݴ�� ����
		NavigableMap<Integer,String> nvmap = treemap.descendingMap();
		System.out.println(nvmap);
		System.out.println(nvmap.descendingMap());

		
		
		
		

	}

}
