package Chap17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList vs LinkedList
//ArrayList : ���� ���ؼ� index���� ������ �ִ�.(index���ȣ�� �������̴�.) �˻��ӵ��� ������.
			//���� : �߰��� ���� �߰�/���� �� ���ϰ� ������ ���� �ɸ���.
//linkedList : �� ���� ���� �յ��� ������� ������ �ִ�. �˻� �ÿ� index��ȣ�� �����Եȴ�.���� ArrayList�� ���ؼ� ������.
			// ���� : �߰��� ���� �߰�/���� �� ���ϰ� �ɸ��� �ʴ´�.



public class ArrayListVSLinkdList {

	public static void main(String[] args) {
		// 1.�����͸� �߰��ð� ��
		List<Integer> aList =new ArrayList<>();
		List<Integer> linkedlist = new LinkedList<>();
		long startTime = 0, endTime=0;
		
		//1-1 Array List���� ������ �߰��ð�
		startTime = System.nanoTime();		//System.nanoTime() :
		for(int i=0; i<100000; i++) {
			aList.add(0, i); // 0���� �濡�� ����ؼ� 10����° ����, ��� �ڷ� �и��鼭 ���� �߰��ȴ�.
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList���� ������ �߰��ð�"+ (endTime-startTime)+"ns");
			//507863300ns
		//1-2 LinkedList���� ������ �߰� �ð� : ArrayList���� ������.
		startTime = System.nanoTime();
		for(int i =0; i<100000; i++) {
			linkedlist.add(0,i);
		}
		endTime=System.nanoTime();
		System.out.println("LinkedList���� ������ �߰��ð�"+ (endTime-startTime)+"ns");
			//6676900ns : 250�� ���� ������
		
		System.out.println("=====================================");
		
		//2. �˻� �� ��. : arrayList�� LinkedList���� ������.
		//2-1 ArrayList �˻��ð�
		startTime = System.nanoTime();
		for(int i =0; i<1000000; i++) {
			aList.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("arrayList���� ������ �˻� �ð�"+ (endTime-startTime)+"ns");
		
		//2-2 LinkedList �˻��ð�
		startTime = System.nanoTime();
		for(int i =0; i<1000000; i++) {
			linkedlist.get(i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList���� ������ �˻� �ð�"+ (endTime-startTime)+"ns");
		
		//3. ������ ������ ����ð� �� : LinkedList�� �ξ� ������.
		startTime = System.nanoTime();		//System.nanoTime() :
		for(int i=0; i<100000; i++) {
			aList.get(i); // 0���� �濡�� ����ؼ� 10����° ����, ��� �ڷ� �и��鼭 ���� �߰��ȴ�.
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList���� ������ �߰��ð�"+ (endTime-startTime)+"ns");
		
		startTime = System.nanoTime();		//System.nanoTime() :
		for(int i=0; i<100000; i++) {
			linkedlist.get(i); // 0���� �濡�� ����ؼ� 10����° ����, ��� �ڷ� �и��鼭 ���� �߰��ȴ�.
		}
		endTime=System.nanoTime();
		System.out.println("ArrayList���� ������ �߰��ð�"+ (endTime-startTime)+"ns");

	}
}
