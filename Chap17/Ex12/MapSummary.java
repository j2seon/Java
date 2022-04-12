package Chap17.Ex12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map 정리 : Key는 중복될 수 없다.
	//1. HashMap	: key를 기준으로 출력이 랜덤하게 출력, 메소드가 동기화 안됨 , 싱글쓰레드 환경
	//2. HashTable	: 모든 메소드가 동기화 되어 있다. 멀티 쓰레드 환경에서 사용됨.
	//3. LinkedHashMap	: 입력순서대로 출력. 
	//4. TreeMap 	: 오름차순 정렬되어 입력 ,Comparable<E>, Comparator


public class MapSummary {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap =new HashMap<>();
		hashMap.put("다", 40);
		hashMap.put("마", 30);
		hashMap.put("나", 40);
		hashMap.put("가", 50);
		System.out.println(hashMap);
		
		Map<String, Integer> hashTable =new Hashtable<>();
		hashTable.put("다", 40);
		hashTable.put("마", 30);
		hashTable.put("나", 40);
		hashTable.put("가", 50);
		System.out.println(hashTable);
		
		Map<String, Integer> linkedHashMap =new LinkedHashMap();
		linkedHashMap.put("다", 40);
		linkedHashMap.put("마", 30);
		linkedHashMap.put("나", 40);
		linkedHashMap.put("가", 50);
		System.out.println(linkedHashMap);
		
		//4. TreeMap : 오름차순 정렬되어 저장
		Map<String, Integer> treeMap =new TreeMap<>();
		treeMap.put("다", 40);
		treeMap.put("마", 30);
		treeMap.put("나", 40);
		treeMap.put("가", 50);
		System.out.println(linkedHashMap);
		
	}

}
