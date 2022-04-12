package Chap17.Ex17;

import java.util.Stack;

//Stack �ڷᱸ�� : LIFO(Last In First Out) :���� �������� ������ ���� ���� ó������.


public class StackMethod {

	public static void main(String[] args) {
		
		Stack<Integer> stack =new Stack<Integer>();
		
		//1. E push(E element) : ���ÿ� ���� ���� �� �ڵ�.
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		
		//2. E peek() : ������ ���� ������ �Ĵٺ�.
		System.out.println(stack.peek()); //7 
		
		//3.search(Object o): �˻� (���� �־����� index ��ȣ�� ���, ����: ���ȣ�� ������ 1������ �Ҵ�ȴ�. )
		System.out.println(stack.search(7));  	//1
		System.out.println(stack.search(3));	//2
		System.out.println(stack.search(5));	//3
		System.out.println(stack.search(2));	//4
		System.out.println(stack.search(9));	//���� �������� �ʴ� ��� : -1

		//4.E pop() : ������ ���� ��������, ���� �������� ���� ������ �����ü� �ִ�.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		
		//5. boolean empty() : ��������� true
		System.out.println(stack.empty());
		
		
	}

}
