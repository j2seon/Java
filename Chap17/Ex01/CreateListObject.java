package Chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {

	public static void main(String[] args) {
		//1.List ���� Ŭ������ �����ڸ� ����Ͽ� ��ü ����
		//List�� �������̽��̹Ƿ� new ���� �ü� ����. ArrayList
		//capacity : �޸��� ���� ũ�⸦ �Ҵ�, �⺻���� 10
		//size() : ���� ����� ���� ����
		List<Integer> aList1 = new ArrayList(); //capacity : 10
		List<Integer> aList2 = new ArrayList<>(30); //capacity :30 �޸��� ���� Ȯ��
		
		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<Integer>(30);
		
		List<Integer> aList5 = new LinkedList<>();
//		List<Integer> aList6 = new LinkedList<>(30); //LinkedList�� ������� �Ҵ� �Ұ�.
		
		//2. Arrays Ŭ������ ���� �޼ҵ带 �̿��ϴ� ��� : ������ ũ�⸦ �ٲ� �� ����.
			//����, ����, �Ϸ� 24�ð� <== ������ ���� ������ �� ���.
		List<Integer> aList7 = Arrays.asList(1,2,3,4); //������ ���� ����
		List<String> aList8 = Arrays.asList("��","ȭ","��","��","��","��","��");
		aList7.set(1, 7); //set() �޼ҵ� ������ ���� �����Ҷ�, index 1�� 7�� �ְڴ�.
		//aList7.add(5); //�����߻� add() ���������� ���� �� �߰��Ҷ� ���.
		
		aList8.set(0, "����");
		System.out.println(aList7);
		System.out.println(aList8);
		
		
		
		
	}

}