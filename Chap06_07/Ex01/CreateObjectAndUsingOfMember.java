package Chap06_07.Ex01;

//Ŭ����(class) : ��ü�� �����ϱ� ���� Ʋ, ���赵, �ؾ�� Ʋ
//��ü(Object) : Ŭ������ �����ؼ� RAM���� �۵��Ǵ� �����ڵ�(��, �ؾ)
  //��ü = �ν��Ͻ� , �ν��Ͻ�ȭ(��üȭ)��Ų��. (���θ޼ҵ忡�� ��ü�� �ν��Ͻ�ȭ ��������Ѵ�.)
  // A a = new A();     <== Ŭ������ ��üȭ ���Ѽ� �޸𸮿� �ε�

class A{  //�ܺ�Ŭ����
	int m=3; 	// m: �ʵ�(����) : Ŭ���� ������ ����� ������ �ʵ�� ȣĪ
				//�ʵ�� �ν��Ͻ�ȭ(��üȭ)�� ���Ѿ� ����� �� �ִ�.  //�ʵ�
				//�ʵ�� �޸��� Heap������ ���� 
	void print() {// �޼ҵ� : ������������ �Լ� ,��ü������� �Լ��� �޼ҵ�� ȣĪ.
		System.out.println("��ü ���� �� Ȱ��");
	}
}

class B{ //�ܺ� Ŭ����
	String name = "ȫ�浿";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName() {
		System.out.println(name);
	}
	void printAge() {
		System.out.println(age);
	}
	void printPhone() {
		System.out.println(phone);
	}
}

public class CreateObjectAndUsingOfMember { // publicŬ������ �ϳ���!!
	//public�� ��ġ�� Ŭ�����̸��� �����̸��̴�.
	public static void main(String[] args) {
		A a = new A(); //Class A�� ��üȭ(�ν��Ͻ�ȭ) ��Ų��.(RAM�� �ε��Ų��.)
		System.out.println(a.m);
		a.print();
		
		System.out.println("============");
		
		A b=new A(); //Class A�� ��üȭ (�ν��Ͻ�ȭ) ���Ѽ� RAM�� �ε�
		System.out.println(b.m);
		b.print();
		
		A c=new A();
		System.out.println(c.m); //.�� ������ �ش� Ŭ������ �ִ� �͵��� �ҷ����� �� �� ����.
		c.print(); 
		
		System.out.println("==============");
		
		B bb = new B();	//main�޼ҵ忡�� B Class�� bb��� �̸����� ��üȭ(�ν��Ͻ�)��Ų��.
		  //new�� ����ϴ� ���� �޸𸮿� class b�� Ʋ�� bb��� �̸����� ���ÿ� �ε��Ų��.
		  //BŬ���� �ȿ� �ִ� �ʵ� 3���� �޼ҵ� 3���� ����� �� �ְ� ��.(���� ��ġ�ϰԵ�)
		  // .�� ������ ���� ȣ���� �� �ִ�!!!!
		bb.printName();  //bb��ü�� �޼ҵ带 ȣ��
		bb.printAge();	//bb��ü�� �޼ҵ� ȣ��
		bb.printPhone();	
		System.out.println(bb.name);
		
		B cc =new B();
		cc.printAge();
		cc.printAge();
		cc.printPhone();
		
		
	}

}
