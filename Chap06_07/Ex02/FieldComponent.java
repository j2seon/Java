package Chap06_07.Ex02;

class Abc{
	int m = 3;	//필드 (Heap에 저장) 객체화 시켰을때 
	int n = 4;
	
	void work1() {		//메소드 (인풋값이 없는 메소드)
		int k=5;		//지역변수 : (Stack 영역에 저장) 메소드가 종료 시 없어진다.
		System.out.println(k);
		work2(3); //다른 메소드 호출
	}
	
	void work2(int i) {
		int j =4; 	//지역변수(Stack 공간에 변수와 값이 같이 저장)
		System.out.println(i + j);
		
		int l;
		//l=0;
		//System.out.println(l); //지역변수이므로 강제 초기화가 되지 않는다.
		//지역변수는 Stack에 있기 때문에 초기 값을 넣어주어야한다.
	
	}

}


public class FieldComponent {

	public static void main(String[] args) {
		//클래스를 활용해서 객체(abc) 생성
		Abc abc = new Abc();		//abc 객체 생성
		
		System.out.println(abc.m);
		System.out.println(abc.n);
		
		//메소드 호출
		abc.work1();
		
	}

}
