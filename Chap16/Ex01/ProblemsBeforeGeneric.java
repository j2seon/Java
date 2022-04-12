package Chap16.Ex01;

//Genric 사용전 문제점. - 상품을 저장할 
// 객체를 담을 클래스를 만들 경우, 매번 객체를 생성할때 마다 그 객체를 담을 클래스를 만들어 줘야한다.
//객체를 저장할 클래스를 생성해서 객체 정보를 담을 수 있다. <==새로운 상품이 추가될때 마다, 상품을 담을 클래스를 생성해줘야한다.(코드복잡해짐)

class Apple{ //사과 클래스
	String name;
	int price;

	Apple(String name,int price){  //생성자
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {		//객체 자체를 출력시 객체의 주소가 아닌 필드의 정보를 출력. 
		return "이름 : " + name+" , " +"가격 : "+ price;
	}
}

//1. Apple을 담을 수 있는 클래스 생성

class Goods1{  //상품클래스 - 사과
	private Apple apple =new Apple("사과",1000);

	public Apple getApple() {  //getter : 객체 필드의 정보를 출력하는 것.
		return apple;
	}

	public void setApple(Apple apple) {  //setter
		this.apple = apple;
	}
}


class Pencil{ //연필클래스 
	String name;
	int price;
	public Pencil(String name,int price) { //생성자를 통해서 필드의 값 할당.
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {		//객체 자체를 출력시 객체의 주소가 아닌 필드의 정보를 출력. 
		return "이름 : " + name+" , " +"가격 : "+ price;
	}
}

class Goods2{
	private Pencil pencil = new Pencil("연필", 2000);

	public Pencil getPencil() {
		return pencil;
	}
	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
}



public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		//1. Goods1 상품이 저장되어있다. Apple객체 추가 및 가져오기
		Goods1 goods1 =new Goods1(); //기본생성자 호출
		goods1.setApple(new Apple("사과2",2000)); //setter로 값을 할당하고
		System.out.println(goods1.getApple());   //필드의 내용을 출력
		
		//2. Goods2 상품이 저장. pancil 객체를 저
		Goods2 goods2= new Goods2();
		goods2.setPencil(new Pencil("연필2",3000));  //Setter로 pencil 객체 생성 및 값 할당.
		System.out.println(goods2.getPencil());
		
	}

}
