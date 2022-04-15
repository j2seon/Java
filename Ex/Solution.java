package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Solution {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        //참가자 String / 완료자 String 실패자만 출력하자/ 동명이인이 있을 수 있다. 
        Map<String,Integer> list = new HashMap<String, Integer>();
        
        //Strings
        for( String a : participant) {
        	list.put(a, list.getOrDefault(a, 0)+1);
        
        for( String a1 : completion) {
        	list.put(a1, list.getOrDefault(a1, 0)-1);
        	
        }
		return answer;
       
    }
	
	public static void main(String[] args) {
		Solution sol =new Solution();
		System.out.println(sol.solution(new String[]{"leo", "kiki", "eden","kiki"}, new String[]{"eden","kiki"}));
	}
}