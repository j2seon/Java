package Chap17.Ex01.EX1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Exer2 {

	public static void main(String[] args) {

		/*List<E>�� �������̽�! ���� ��ü�� ������ �� ����.
		 * LIst<E>�� �����ϴ� Ŭ�������� �����ϱ� ������ �� Ŭ������ Ȱ��!!
		 * ArrayList Vector LInkedList!! �� �����ϴ� �� 
		 * �⺻ �뷮�� 10! ������ ���� ���� ������ LInkedList�� xxxx
		 * 
		 * �ι�°�� �� Arrays.asList�� ����ϴ� ���!!!!!
		 * Arrays.asList�� ���� ����� �װ� List�� ���Ѵٰ� �����ؾ��Ѵ�. ���� new�ȵ�!!!!!
		 * �ش����� �迭�� ���⶧���� ��������� ������ �� ����.
		 * */
		List<Integer> alist1= new ArrayList<Integer>(30);
		List<String> alist2 = new Vector<>(20);
		List<Integer> alist3 = new LinkedList<>(); 
	
	
		List<Integer> alist4 = Arrays.asList(1,2,3);
		System.out.println(alist4); //List�� ���ױ� ������ �׳� ������ �־ ��µȴ�/
		alist4.set(0, 0);
		System.out.println(alist4);
	
	
	
	
	}

}
