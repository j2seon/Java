package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	
	 public int[] solution(int[] arr) {
	        int[] answer= {}; 
	        int max=0;
	        ArrayList<Integer> arrli= new ArrayList<>();
	        for(int i=0; i<arr.length; i++) {
	        	if(arr[i]>max) {
	        		max=arr[i];
	        	}
	        }
	        //값이 5인 애들 인덱스 번호를 가져와야한다.
	        for(int i =0; i<arr.length; i++) {
	        	if(arr[i]==max) {
	        		arrli.add(i);
	        	}
	        }
	        for(int i=0; i<arrli.size(); i++) {
	        	answer[i]=arrli.get(i);
	        }
	        
	        
	        return answer;
	        
    }
	public static void main(String[] args) {
		Solution sol =new Solution();
		int[] a =new int[] {1,2,3,4,5};
		System.out.println(sol.solution(a));
	}
}