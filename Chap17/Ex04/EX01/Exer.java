package Chap17.Ex04.EX01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exer {

	public static void main(String[] args) {
		
		/* List �������̽��� ����ϴ� ���̵� �� ArrayList vs LinkedList!
		 * 
		 * ArrayList �� index��ȣ�� �־����ְ� LinkedList�� ���� ���Ḹ �Ǿ��ִٰ� ���� ����Ҷ� ��ȣ�� �ο��Ѵ�. 
		 * 
		 * �׷��� �Ǹ�!!! ���� �����Ҷ��� LinkedList�� �ξ� ������ ArrayList�� �ڷιи��ϱ� ��������.
		 * ������ ���� ����Ҷ��� LinkedList�� ��ȣ�� �ο��ϾߵǱ⶧���� ������!
		 *
		 * ���� �ӵ��� ���ϱ� ���ؼ��� nanoTime()�̶�� �޼ҵ带 ����ؼ� Ȯ���� �� �ִ�!
		 * */
		
		
		// �� Ÿ������ ��ü�� ������־���!
		List<Integer> a1 =new ArrayList<>();
		List<Integer> a2 =new LinkedList<>();
		
		//Array�� ���� ������
		long start=0 ; long end=0;
		start=System.nanoTime();
		for(int i=0; i<100000; i++) {
			a1.add(0,i);
		}
		end=System.nanoTime();
		System.out.println("Array �����Ϳ� ���� ���� �� "+(end-start));
		
		for(int i=0; i<100000; i++) {
			a2.add(0,i);
		}
		end=System.nanoTime();
		System.out.println("Linked�����Ϳ� ���� ���� �� "+(end-start));
		
		
		
		
	}

}
