package Chap17.Ex10;


//Map<K,V> : K<= Key, V<=Value �������� �����͸� ����.

	//key�� �ߺ��� �� ����. <= Set���� ����. index�� �ƴϴ�. index�� 0���� �Ҵ�, JVM�� �Ҵ���.
	//Value�� �ߺ��� ���� ���� �� �ִ�.

	//HashMap : ����� �����ϰ� �ʴ�!! ���Ͼ����� ȯ�濡 ����. ��� �޼ҵ尡 ����ȭ �Ǿ� ���� �ʴ�
	//Hashtable : ��� �޼ҵ尡 ����ȭ �Ǿ��ִ�. ��Ƽ������ ȯ�濡 �����ϴ�.
				//���޼ҵ�� HashMap�� ����

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {

	public static void main(String[] args) {
		
		Map<Integer,String> hTab1e1 = new Hashtable();
		
		//1.put(K key, V value) : ���� ������.
		hTab1e1.put(2,"���ٶ�");
		hTab1e1.put(1,"������");
		hTab1e1.put(3,"�ٶ�");
		//hMap1.put(3,"������");  //Ű�� �ߺ��ؼ� ����� �� ����. ���� ���� ��� ������ ���� �����ȴ�/
		System.out.println(hTab1e1);

		//2.putAll(�ٸ��ʰ�ü) : �ٸ����� �����ؼ� ���.
		Map<Integer, String> hTab1e2 =new Hashtable<>();
		hTab1e2.putAll(hTab1e2);
		System.out.println(hTab1e2);
		
		//replace(K key, V value) ; key�� ����Ȱ��� value�� ����.
		hTab1e2.replace(1, "������");
		hTab1e2.replace(4, "����"); //key4�� �������� �ʴ´�. �۵��� �ȵ�. (���ܵ� �߻��� �ȉ�.)
		System.out.println(hTab1e2);
		
		//4. replace(K key, V oldValue, V newValue,) : oldValue�� newValue�� ����
		hTab1e2.replace(1, "������","������");
		hTab1e2.replace(2, "�ٴٴ�","����"); //���۾ȵ� <==key�� value�� ��Ȯ�� ��ġ�ؾ� ������.
		
		System.out.println(hTab1e2);
		//5.get(Object key) : Map�� ���� �����ö�. key�� �־���� Key�� �Ҵ�� Value�� ���.
		
		System.out.println(hTab1e2.get(1)); //����!!! index�� �ƴ϶� Key
		System.out.println(hTab1e2.get(2));
		System.out.println(hTab1e2.get(3));
		
		//6.containsKey(Object key) ; �ʿ� �ش�Ű�� �����ϴ��� Ȯ��. true, false
		System.out.println(hTab1e2.containsKey(1));	//true
		System.out.println(hTab1e2.containsKey(5)); //false
		
		//7.containsValue(Object value) : �ʿ� �ش� ���� �����ϴ� �� Ȯ��, true, false
		System.out.println(hTab1e2.containsValue("������"));	//true
		System.out.println(hTab1e2.containsValue("������")) ;   //false
	
		//8. SEt<K> keySet(): Ű�� ����
		Set<Integer> keySet = hTab1e2.keySet(); 	//hmap2�� ����� KeySet�� ���� //Set ���� ����
		System.out.println(keySet) ;
		
		//9. Set<Map.Entry<K,V>> entrySet() : Ű�� ���� Set�� ����
		Set<Map.Entry<Integer, String>> entrySet =hTab1e2.entrySet();
		System.out.println(entrySet);
		
		//10.size(); �� ����
		System.out.println(hTab1e2.size()); //3
		
		//11. remove(Object key) �ش� Ű�� Key�� value�� ����.
		hTab1e2.remove(1);	//1�� ����
		hTab1e2.remove(4);	//�������� ����.
		System.out.println(hTab1e2);
	
		//12. remove(Object key, Object value) key�� value�� ��Ȯ�ϰ� ��ġ�� �� ����.
		hTab1e2.remove(2,"���ٶ�"); //����
		hTab1e2.remove(3,"�ٴٴ�");	//���۾���. Key�� value�� ��Ȯ�ϰ� ��ġ�ؾ���.
		System.out.println(hTab1e2);
		
		//13.clear() : ��� ����
		hTab1e2.clear();
		System.out.println(hTab1e2);
		
		
	
	}
	

}
