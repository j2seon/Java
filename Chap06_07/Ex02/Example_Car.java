package Chap06_07.Ex02;

import javax.annotation.processing.SupportedSourceVersion;

public class Example_Car {

	public static void main(String[] args) {
		//Car Class를 객체화 해서 5개의 객체를 생성해서 값을 할당해서 출력하시오.
		//메모리 직접이용 , settor를 통해서 값을 할당.
		//1개
		Car sonata =new Car();
		
		//변수의 값을 직접 할당.(권장사항이 아님)
		//private 변수명 : 캡슐화(직접 변수의 값을 대입하지 못하도록 함.)
		//setter를 통해서 값을 부여 : 변수의 입력되는 값을 제어할 수 있다.
		sonata.company ="현대";
		sonata.color="red";
		sonata.maxSpeed=200; //-,700 값 이상을 넣을 수 없도록 제어
		sonata.model="2020년 형";
		
		System.out.println(sonata.company);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		System.out.println(sonata.model);
		
		sonata.setCompany("현대");
		sonata.setColor("red");
		sonata.setMaxSpeed(200);
		sonata.setModel("2020형");
		
		System.out.println("===gettor==");
		//getter
		System.out.print(sonata.getCompany()+" ");
		System.out.print(sonata.getColor()+" ");
		System.out.print(sonata.getMaxSpeed()+" ");
		System.out.print(sonata.getModel()+" ");
		System.out.println();
		
		//2개
		Car venue = new Car();
		//직접 값을 넣는 방법
		venue.company="현대";
		venue.color="blue";
		venue.maxSpeed=200;
		venue.model="2022형";
		//settor이용
		venue.setCompany("현대");
		venue.setColor("blue");
		venue.setMaxSpeed(200);
		venue.setModel("2022형");
		//gettor 출력
		System.out.println("===venu getter 출력===");
		System.out.print(venue.getCompany());
		System.out.print(venue.getColor());
		System.out.print(venue.getMaxSpeed());
		System.out.print(venue.getModel());
		System.out.println();
		//3개
		Car ray =new Car();
		ray.setCompany("기아");
		ray.setColor("white");
		ray.setMaxSpeed(200);
		ray.setModel("2021형");
		//gettor로 출력
		System.out.println("=====ray gettor로 출력=======");
		System.out.println(ray.getCompany());
		System.out.println(ray.getColor());
		System.out.println(ray.getMaxSpeed());
		System.out.println(ray.getModel());
		
		Car grandeur = new Car();
		grandeur.setCompany("dd");
		grandeur.setColor("blue");
		grandeur.setMaxSpeed(250);
		grandeur.setModel("2022형");
		System.out.println(grandeur.getCompany());
		
		
		
	}

}
