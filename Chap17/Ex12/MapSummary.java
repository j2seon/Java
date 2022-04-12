package Chap17.Ex12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map ���� : Key�� �ߺ��� �� ����.
	//1. HashMap	: key�� �������� ����� �����ϰ� ���, �޼ҵ尡 ����ȭ �ȵ� , �̱۾����� ȯ��
	//2. HashTable	: ��� �޼ҵ尡 ����ȭ �Ǿ� �ִ�. ��Ƽ ������ ȯ�濡�� ����.
	//3. LinkedHashMap	: �Է¼������ ���. 
	//4. TreeMap 	: �������� ���ĵǾ� �Է� ,Comparable<E>, Comparator


public class MapSummary {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap =new HashMap<>();
		hashMap.put("��", 40);
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		System.out.println(hashMap);
		
		Map<String, Integer> hashTable =new Hashtable<>();
		hashTable.put("��", 40);
		hashTable.put("��", 30);
		hashTable.put("��", 40);
		hashTable.put("��", 50);
		System.out.println(hashTable);
		
		Map<String, Integer> linkedHashMap =new LinkedHashMap();
		linkedHashMap.put("��", 40);
		linkedHashMap.put("��", 30);
		linkedHashMap.put("��", 40);
		linkedHashMap.put("��", 50);
		System.out.println(linkedHashMap);
		
		//4. TreeMap : �������� ���ĵǾ� ����
		Map<String, Integer> treeMap =new TreeMap<>();
		treeMap.put("��", 40);
		treeMap.put("��", 30);
		treeMap.put("��", 40);
		treeMap.put("��", 50);
		System.out.println(linkedHashMap);
		
	}

}
