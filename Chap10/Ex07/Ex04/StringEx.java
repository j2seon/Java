package Chap10.Ex07.Ex04;

class A {
	String name;
	A(String name){
		this.name=name;
	}
} 

public class StringEx {

	public static void main(String[] args) {

		String s0 = new String("�ȳ�");
				
		
		String s1="�ȳ�"; 	//String�� ��������
		System.out.println(s0);		//String�� ��ü�� ����Ҷ� toString()������ �Ǿ��ִ�.
		System.out.println(s1);
		
		A a=new A("�ȳ�");
		System.out.println(a);
	}

}
