package Chap16.Ex08;

//���ʸ� Ŭ������ �����ؼ�, Ÿ������(Apple,Strawberry, banana),pencilŸ������ ������ �� ������ ����
abstract class Fluit{
	public abstract void print(); // �߻�޼ҵ�
}
class Apple extends Fluit {
	String name;
	int price;
	Apple(String name , int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ "+price;
	}
	@Override
	public void print() {
		System.out.println("����Ư��");
	}
}
class Strawberry extends Fluit{
	String name;
	int price;
	Strawberry(String name , int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ "+price;
	}
	@Override
	public void print() {
		System.out.println("���� �ι�");
	}
}

class Banana extends Fluit{
	String name;
	int price;
	Banana(String name , int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ "+price;
	}
	@Override
	public void print() {
		System.out.println("Ķ�����Ͼ� ��");
	}
}
class pencil{
	String name;
	int price;
	pencil(String name , int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name + "�̰� ������ "+price;
	}
}


public class EX_Restric_Generic_Type {

	public static void main(String[] args) {
		Generic1<Apple> applepr =new Generic1<>();
		applepr.setUse(new Apple("���", 1000));
		Apple apple = applepr.getUse();
		System.out.println(apple);
		apple.print();
		
		Generic1<Strawberry> straw =new Generic1<>();
		straw.setUse(new Strawberry("����", 2000));
		Strawberry strawbetrry =straw.getUse();
		System.out.println(strawbetrry);
		strawbetrry.print();
		
		Generic1<Banana> baa =new Generic1<>();
		baa.setUse(new Banana("�ٳ���",3000));
		Banana banana = baa.getUse();
		System.out.println(banana);
		
		
		//Generic1<pencil> pens =new Generic1<>(); ��� �ȵž �ȵ�!!!

		
	}

}
