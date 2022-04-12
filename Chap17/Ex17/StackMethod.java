package Chap17.Ex17;

import java.util.Stack;

//Stack 자료구조 : LIFO(Last In First Out) :제일 마지막에 저장한 값이 제일 처음나옴.


public class StackMethod {

	public static void main(String[] args) {
		
		Stack<Integer> stack =new Stack<Integer>();
		
		//1. E push(E element) : 스택에 값을 넣을 때 자동.
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		
		//2. E peek() : 가져올 값을 위에서 쳐다봄.
		System.out.println(stack.peek()); //7 
		
		//3.search(Object o): 검색 (값을 넣었을때 index 번호를 출력, 주의: 방번호는 위부터 1번으로 할당된다. )
		System.out.println(stack.search(7));  	//1
		System.out.println(stack.search(3));	//2
		System.out.println(stack.search(5));	//3
		System.out.println(stack.search(2));	//4
		System.out.println(stack.search(9));	//값이 존재하지 않는 경우 : -1

		//4.E pop() : 스택의 값을 가져오기, 제일 마지막에 넣은 값부터 가져올수 있다.
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();
		
		//5. boolean empty() : 비어있을때 true
		System.out.println(stack.empty());
		
		
	}

}
