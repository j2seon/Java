package Chap16.Ex01;

//Genric ����� ������. - ��ǰ�� ������ 
// ��ü�� ���� Ŭ������ ���� ���, �Ź� ��ü�� �����Ҷ� ���� �� ��ü�� ���� Ŭ������ ����� ����Ѵ�.
//��ü�� ������ Ŭ������ �����ؼ� ��ü ������ ���� �� �ִ�. <==���ο� ��ǰ�� �߰��ɶ� ����, ��ǰ�� ���� Ŭ������ ����������Ѵ�.(�ڵ庹������)

class Apple{ //��� Ŭ����
	String name;
	int price;

	Apple(String name,int price){  //������
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ� �ʵ��� ������ ���. 
		return "�̸� : " + name+" , " +"���� : "+ price;
	}
}

//1. Apple�� ���� �� �ִ� Ŭ���� ����

class Goods1{  //��ǰŬ���� - ���
	private Apple apple =new Apple("���",1000);

	public Apple getApple() {  //getter : ��ü �ʵ��� ������ ����ϴ� ��.
		return apple;
	}

	public void setApple(Apple apple) {  //setter
		this.apple = apple;
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

class Goods2{
	private Pencil pencil = new Pencil("����", 2000);

	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}



public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//1. Goods1 ��ǰ�� ����Ǿ��ִ�. Apple��ü �߰� �� ��������
		Goods1 goods1 =new Goods1(); //�⺻������ ȣ��
		goods1.setApple(new Apple("���2",2000)); //setter�� ���� �Ҵ��ϰ�
		System.out.println(goods1.getApple());   //�ʵ��� ������ ���
		
		//2. Goods2 ��ǰ�� ����. pancil ��ü�� ��
		Goods2 goods2= new Goods2();
		goods2.setPencil(new Pencil("����2",3000));  //Setter�� pencil ��ü ���� �� �� �Ҵ�.
		System.out.println(goods2.getPencil());
		
	}

}
