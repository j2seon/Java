package Chap06_07.Ex03;

class Car{
	String company; //필드(인스턴스필드)의 company를 알려주는 this,heap메모리에 저장
	String model;	//인스턴스 : 객체화를 했을 때 사용 가능한 필드
	String color;	//[필드명: 필드 값]은 Heap영역에 저장
	double maxSpeed;
	
	Car(){}
	Car(String company, String model, String color, double max ){
		this.company=company; //this 키는 객체의 필드의 변수를 뜻한다.
		this.model= model;	  //3개 변수 모두가 동일할 경우 객체 필드의 변슈를 알려주는 역할
		this.color = color;
		maxSpeed = max; //this 키워드가 생략된 상태
	}
	//static키가 없으면 인스턴스 메소드(객체화를 꼭 해야함) / 있으면 static 메소드
	void work() {				//메소드(인스턴스 메소드) : Heap 영역의 메소드 명과 포인터를 저장.
		System.out.println(company); //메소드의 전체 구문은 클래스 영역에 메스드영역에 저장.
		System.out.println(color);
		System.out.println(model);
		System.out.println(maxSpeed);
		
	}
}

public class Q1 {

	public static void main(String[] args) {
		//생성자를 통해서 기본 값을 할당 후 메모리의 내용을 work()메소드를 사용해서 출력.
	Car a = new Car("현대","그랜져","검은색",250.0);
	a.work();
	}

}
