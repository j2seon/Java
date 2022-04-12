package Chap16.Ex02;


//Object�� ��� ��ü�� ������ �� �ִ�.
//��ǰ�� �����ϴ� Ŭ������ Object Ÿ������ �����ϸ� ��簴ü�� ���� �� �ִ�.
//Object�� ���� : ��� ��ü�� ���� �� �ִ�.(casting)
		// ���� : �Ź� �ٿ�ĳ������ �ؼ� ����ؾ��Ѵ�.
		// ���� Ÿ�� üũ : ����� ClassCastException�� �߻�

class Apple{ //��� Ŭ����
	String name;
	int price;

	Apple(String name,int price){  //������
		this.name=name;
		this.price=price;
	}
	public void abc() {
		System.out.println("abc()�޼ҵ� ���");
	}
	
	@Override
	public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ� �ʵ��� ������ ���. 
		return "�̸� : " + name+" , " +"���� : "+ price;
	}
}
class Pencil{ //����Ŭ���� 
	String name;
	int price;
	public Pencil(String name,int price) { //�����ڸ� ���ؼ� �ʵ��� �� �Ҵ�.
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ� �ʵ��� ������ ���. 
		return "�̸� : " + name+" , " +"���� : "+ price;
	}
}

class Goods{ //Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�.
	
	private Object obj =new Object();   // Object: ���Ŭ������ Object Ÿ������ ��ȯ

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {  // ObjectŸ������ ��ĳ���õ�.
		this.obj = obj;
	}
}

public class Using_Object {
	public static void main(String[] args) {
		
		//1.Apple�� ���� �� ���. Object
		Goods goods1 =new Goods();
		goods1.setObj(new Apple("��� 3 ", 4000));
		System.out.println((Apple)goods1.getObj());
		((Apple)goods1.getObj()).abc(); //�ٿ�ĳ������ �ؾ��ϴ� ����!  Apple Ŭ������ �ٸ� �޼ҵ�,�ʵ带 Ȱ���Ҽ� �ֱ� ����!!
		
		//2.Pencil�� ������ ��� 
		Goods goods2 = new Goods();
		goods2.setObj(new Pencil("���� 3",2000));
		System.out.println((Pencil)goods2.getObj());

		//3. �߸��� ĳ������ �� �� �ִ� (���� Ÿ�� üũ) : Object�� ������.
		Goods goods3 =new Goods();
		goods3.setObj(new Apple("��� 4 ", 5000));
//		System.out.println((Pencil)goods3.getObj()); //����Ÿ��üũ  ���� �� �����߻�
	}

}
