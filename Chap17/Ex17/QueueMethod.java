package Chap17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO(First In First Out) :ó�� �� ���� ó������

public class QueueMethod {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//1. ����ó���� �������� �޼ҵ� (add(),element(),remove())
			//1.add() : ť�� ���� �߰��Ҷ�
			//System.out.println(queue.element()); //����� �����߻�, ����ó���� �ȵǾ� �ִ�.
			queue.add(3);
			queue.add(4);
			queue.add(5);
			
			//2. element()
			System.out.println(queue.element()); //���� �տ� ���� ��.

			//3.E remove() : ť�� ���� ������ ���� ���.
			System.out.println(queue.remove()); //3
			System.out.println(queue.remove()); //4
			System.out.println(queue.remove()); //5
			//System.out.println(queue.remove()); //��� ������ ���� ���� ������ ���� ���� �߻�, �����߻�
			System.out.println();
			
		//2. ����ó���� ���� �޼ҵ�(offer(),peek(),poll()) <== �������
			Queue<Integer> queue2 =new LinkedList<Integer>();
			
				System.out.println(queue2.peek()); //����ó���� �Ǿ��ֱ� ������ ������ �߻����� �ʴ� ��!
				
			//1. offer(E item) : ���� �߰�
			queue2.offer(3);
			queue2.offer(4);
			queue2.offer(5);
			
			//2.E peek() : ����� ���� �̸� ���� ��.  
			System.out.println(queue2.peek());
			
			//3. poll(); ���� �������
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());
			System.out.println();
	}

}
