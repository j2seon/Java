package Ex;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public int[] solution(long n) {	        
	    // ��� ������ �𸣴ϱ� �迭���� ����Ʈ��
		 List<Integer> li = new LinkedList<Integer>();
	    
		 while(n>0) {
			 int a =(int)(n%10);
			 li.add(a);
			 n=n/10;
		 }
		 
		 int answer[] = new int[li.size()];
		 for(int i=0; i<li.size(); i++) {
			 answer[i]=li.get(i);
		 }
		 
		return answer;
		 
		 
	 }
	
	public static void main(String[] args) {
		Solution sol =new Solution();
		System.out.println(sol.solution(28463943));
	}
}