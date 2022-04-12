package Chap17.Ex03;

//LinkedList�� ArrayList�� ������ 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class LinkedListMethod_1 {

	public static void main(String[] args) {
		//List�� �޼ҵ� : 13�� ������ �޼ҵ� , 
			//1. ArrayList
			//2. Vector
			//3. LinkedList
		List<Integer> Linkedlist1 =new ArrayList<Integer>();
		
		//1. add(E element) : ������ ���� ���� �߰��ϱ�.
		Linkedlist1.add(3);Linkedlist1.add(4);Linkedlist1.add(5);
		System.out.println(Linkedlist1);		//�����
		System.out.println(Linkedlist1.size()); 	//���� ����
		
		//2.add (int index, E element)
		Linkedlist1.add(1,6);	//���ȣ 1���� 6�� �߰�
		System.out.println(Linkedlist1);
		
		//3. addAll(�Ǵٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		List<Integer> Linkedlist2 =new ArrayList();
		Linkedlist2.add(1);
		Linkedlist2.add(2);
		
		Linkedlist2.addAll(Linkedlist1); //aList1 ����� ���� �����ؼ� aList2�� �߰���.
		System.out.println(Linkedlist2);
		
		//4. addAll(int index,�Ǵٸ� ��ü)
		List<Integer> Linkedlist3 = new ArrayList();
		Linkedlist3.add(1);
		Linkedlist3.add(2);
		Linkedlist3.addAll(1,Linkedlist3); //�ڽ��� ���� �߰� ==> �ٸ���ü�� �߰�
		System.out.println(Linkedlist3);
		
		//5. set(int index, E element) : Ư�� ���ȣ�� ���� ����
		Linkedlist3.set(1,5); //1�� ���ȣ�� ���� 5�� �����ض�
		//aList3.set(4,7); // 4������ �����Ƿ� �����߻�
		System.out.println(Linkedlist3);
		
		//6. remove(int index) : Ư�� ���ȣ�� ���� ����, 
		Linkedlist3.remove(1); //���ȣ 1�� �濡 �ִ� ���� ����
		System.out.println(Linkedlist3);
		
		//7. remove (Object o) : ������ ����.
		Linkedlist3.remove(new Integer(2));
		System.out.println(Linkedlist3);
		
		//8.clear() : ��λ���
		Linkedlist3.clear();
		System.out.println(Linkedlist3);
		
		//9. isEmpty() : ���� ��������� True, ������� ������ false
		System.out.println(Linkedlist3.isEmpty());
		
		//10. size() : ���� ����, ���� ����
		System.out.println(Linkedlist3.size());
		Linkedlist3.add(1);Linkedlist3.add(2);Linkedlist3.add(3);
		System.out.println(Linkedlist3.size());
		
		//11. get(int index) : ���ȣ�� ���� ���
		System.out.println(Linkedlist3.get(0));
		System.out.println(Linkedlist3.get(1));
		System.out.println(Linkedlist3.get(2));
		
		System.out.println("=================================");
		System.out.println(Linkedlist3); //List�϶� ��ü�� ����ϸ� ��ü�� ���� ��µȴ�!!! but �迭�϶��� �ٸ���.
		
		//12. toArray() : List(����Ʈ) ---> Array(�迭)�� ��ȯ
		Object[] object = Linkedlist3.toArray(); 	//�⺻������ toArray() �޼ҵ�� Object Ÿ������ ������ ��.
			// �ٿ�ĳ������ �ʿ��ϴ�. 
		System.out.println(Arrays.toString(object)); //�迭�϶��� Arrays.toStrnig���� ���.
		
		System.out.println("==================");
		
		//13-1 toArray(T[]t) ---->t[] : Inter�� �ٷ� ĳ����
		Integer[] integer1 =Linkedlist3.toArray(new Integer[0]);
			//0�� �ǹ� : ����Ʈ�� ����� ������ ���� ��� ����Ʈ�� ����� ���� ������ �´�.
		System.out.println(Arrays.toString(integer1));
		System.out.println("====================");
		
		//13-1 toArray(T[]t) ---->t[] : Inter�� �ٷ� ĳ����
		Integer[] integer2 =Linkedlist3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
	}

}
