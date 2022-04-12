package Chap17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO(First In First Out) :처음 들어간 값이 처음나옴

public class QueueMethod {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//1. 예외처리를 미포함한 메소드 (add(),element(),remove())
			//1.add() : 큐에 값을 추가할때
			//System.out.println(queue.element()); //실행시 오류발생, 예외처리가 안되어 있다.
			queue.add(3);
			queue.add(4);
			queue.add(5);
			
			//2. element()
			System.out.println(queue.element()); //제일 앞에 넣은 값.

			//3.E remove() : 큐의 값을 끄집어 낼때 사용.
			System.out.println(queue.remove()); //3
			System.out.println(queue.remove()); //4
			System.out.println(queue.remove()); //5
			//System.out.println(queue.remove()); //모두 끄집어 내고 나서 끄집어 낼때 예외 발생, 오류발생
			System.out.println();
			
		//2. 예외처리를 포함 메소드(offer(),peek(),poll()) <== 권장사항
			Queue<Integer> queue2 =new LinkedList<Integer>();
			
				System.out.println(queue2.peek()); //예외처리가 되어있기 때문에 오류가 발생되지 않는 것!
				
			//1. offer(E item) : 값을 추가
			queue2.offer(3);
			queue2.offer(4);
			queue2.offer(5);
			
			//2.E peek() : 출력할 값을 미리 보는 것.  
			System.out.println(queue2.peek());
			
			//3. poll(); 값을 끄집어내기
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());
			System.out.println(queue2.poll());
			System.out.println();
	}

}
