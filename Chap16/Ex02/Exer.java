package Chap16.Ex02;

class Cake{
	String name;
	int price;
	
	Cake(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	public void soldout() {
		System.out.println("����ũ ǰ��");
	}
	
	@Override
	public String toString() {
		return "����ũ �̸� : " + name + " , ���� : " + price+"��";
	}
}

class Coffee{
	String name;
	int price;
	
	Coffee(String name, int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Ŀ�� �̸� : " + name + " , ���� : " + price+"��";
	}
}

class Cafe{
	private Object obj = new Object();

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

public class Exer {
	public static void main(String[] args) {

		Cafe goods1= new Cafe();
		goods1.setObj(new Cake("��������ũ",6000));
		System.out.println((Cake)goods1.getObj());
		Cake cake=(Cake)goods1.getObj();
		cake.soldout();
		
		
		Cafe goods2 = new Cafe();
		goods2.setObj(new Coffee("�Ƹ޸�ī��", 3500));
		Coffee coffee=(Coffee)goods2.getObj();
		System.out.println(coffee);
		
	}

}
