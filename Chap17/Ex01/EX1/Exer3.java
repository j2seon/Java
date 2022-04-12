package Chap17.Ex01.EX1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exer3 {

	public static void main(String[] args) {
		
		//���� ���� LIst�������̽��� ���� a1�� ArrayList�� �����߾�!!
		List<Integer> a1 =new ArrayList<Integer>(); 
		
		//���� �־��ٰ�!
		a1.add(1);a1.add(1);a1.add(2);a1.add(2);a1.add(7);
		System.out.println(a1); //���� ������ �迭�� �߰��Ǿ���!
		
		//�ٵ� 0��°�� �ٸ����� �ִ°� �����߳�? ���� �־�����!
		a1.add(0,4); //�ְ���� ��ġ, �� �����!
		System.out.println(a1); 
		
		//�ٸ� ��ü�� �ִµ� ���� �ֶ� ���ľߵȵ�!! ���� ���� �ٸ���ü��..a2��!
		List<Integer> a2 = new ArrayList<>();
		a2.add(3);a2.add(6);a2.add(9);a2.add(12);
		
		//a2�� a1�ڿ� �������Ұ�!
		a1.addAll(a2);
		System.out.println(a1);
		
		// �� �ٵ� �ְ� 1��° ���� �־��ַ�!!
		a1.addAll(1,a2);
		System.out.println(a1);
		
		//�׸��� 5��° 1�� 15�� �ٲ�޷�!
		a1.set(5, 15);
		System.out.println(a1);
		
		//�ʹ� ������ٰ� 0��° 4�� ���ִ޷�!
		a1.remove(0);
		System.out.println(a1);
		
		//�׷��� ��ٰ� 1,2�� ���ִ޷�
		a1.remove(new Integer(2));
		a1.remove(new Integer(2));
		a1.remove(new Integer(1));
		System.out.println(a1);
		
		//���ϴ� �� �������ϱ� �� �����޷�
		a1.clear();
		System.out.println(a1);
		//���������� Ȯ������!!
		System.out.println(a1.isEmpty());
		
		//�Ʊ� �־��� a2 ���� �����?
		System.out.println("size : "+a2.size());
		
		//�׷� a2�� ������ ��ġ�� ���� �󸶾�?
		System.out.println(a2.get(3));
		
		//�׷� ���δ� �˷���!!!
		for(int i=0; i<a2.size(); i++) {
			System.out.println(i+"��° :" + a2.get(i));
		}
		
		//����ߴ� ���� �ٵ� List�� ����ؼ� �׷��� �迭�� �ٲ��� �� �־�?
		Object[] ob = a2.toArray();
		System.out.println(Arrays.toString(ob));
		
		//���� Ÿ������ �־��ֶ�!
		Integer[] it= a2.toArray(new Integer[0]);
		System.out.println(Arrays.toString(it));
		//�ٵ� �� �� 5�����ߵ� �Ф� 
		Integer[] it2 = a2.toArray(new Integer[5]);
		System.out.println(Arrays.toString(it2));
		
		
	}

}
