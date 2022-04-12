package Chap16.Ex08;

//제너릭 클래스를 생성해서, 타입제한(Apple,Strawberry, banana),pencil타입으로 접근할 수 없도록 설정
abstract class Fluit{
	public abstract void print(); // 추상메소드
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
		return name + "이고 가격은 "+price;
	}
	@Override
	public void print() {
		System.out.println("할인특가");
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
		return name + "이고 가격은 "+price;
	}
	@Override
	public void print() {
		System.out.println("양이 두배");
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
		return name + "이고 가격은 "+price;
	}
	@Override
	public void print() {
		System.out.println("캘리포니아 산");
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
		return name + "이고 가격은 "+price;
	}
}


public class EX_Restric_Generic_Type {

	public static void main(String[] args) {
		Generic1<Apple> applepr =new Generic1<>();
		applepr.setUse(new Apple("사과", 1000));
		Apple apple = applepr.getUse();
		System.out.println(apple);
		apple.print();
		
		Generic1<Strawberry> straw =new Generic1<>();
		straw.setUse(new Strawberry("딸기", 2000));
		Strawberry strawbetrry =straw.getUse();
		System.out.println(strawbetrry);
		strawbetrry.print();
		
		Generic1<Banana> baa =new Generic1<>();
		baa.setUse(new Banana("바나나",3000));
		Banana banana = baa.getUse();
		System.out.println(banana);
		
		
		//Generic1<pencil> pens =new Generic1<>(); 상속 안돼어서 안됨!!!

		
	}

}
