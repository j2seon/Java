package Chap16.Ex02;

class Cake{
	String name;
	int price;
	
	Cake(String name, int price){
		this.name=name;
		this.price=price;
	}
	
	public void soldout() {
		System.out.println("케이크 품절");
	}
	
	@Override
	public String toString() {
		return "케이크 이름 : " + name + " , 가격 : " + price+"원";
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
		return "커피 이름 : " + name + " , 가격 : " + price+"원";
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
		goods1.setObj(new Cake("초코케이크",6000));
		System.out.println((Cake)goods1.getObj());
		Cake cake=(Cake)goods1.getObj();
		cake.soldout();
		
		
		Cafe goods2 = new Cafe();
		goods2.setObj(new Coffee("아메리카노", 3500));
		Coffee coffee=(Coffee)goods2.getObj();
		System.out.println(coffee);
		
	}

}
