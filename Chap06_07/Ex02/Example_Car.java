package Chap06_07.Ex02;

import javax.annotation.processing.SupportedSourceVersion;

public class Example_Car {

	public static void main(String[] args) {
		//Car Class�� ��üȭ �ؼ� 5���� ��ü�� �����ؼ� ���� �Ҵ��ؼ� ����Ͻÿ�.
		//�޸� �����̿� , settor�� ���ؼ� ���� �Ҵ�.
		//1��
		Car sonata =new Car();
		
		//������ ���� ���� �Ҵ�.(��������� �ƴ�)
		//private ������ : ĸ��ȭ(���� ������ ���� �������� ���ϵ��� ��.)
		//setter�� ���ؼ� ���� �ο� : ������ �ԷµǴ� ���� ������ �� �ִ�.
		sonata.company ="����";
		sonata.color="red";
		sonata.maxSpeed=200; //-,700 �� �̻��� ���� �� ������ ����
		sonata.model="2020�� ��";
		
		System.out.println(sonata.company);
		System.out.println(sonata.color);
		System.out.println(sonata.maxSpeed);
		System.out.println(sonata.model);
		
		sonata.setCompany("����");
		sonata.setColor("red");
		sonata.setMaxSpeed(200);
		sonata.setModel("2020��");
		
		System.out.println("===gettor==");
		//getter
		System.out.print(sonata.getCompany()+" ");
		System.out.print(sonata.getColor()+" ");
		System.out.print(sonata.getMaxSpeed()+" ");
		System.out.print(sonata.getModel()+" ");
		System.out.println();
		
		//2��
		Car venue = new Car();
		//���� ���� �ִ� ���
		venue.company="����";
		venue.color="blue";
		venue.maxSpeed=200;
		venue.model="2022��";
		//settor�̿�
		venue.setCompany("����");
		venue.setColor("blue");
		venue.setMaxSpeed(200);
		venue.setModel("2022��");
		//gettor ���
		System.out.println("===venu getter ���===");
		System.out.print(venue.getCompany());
		System.out.print(venue.getColor());
		System.out.print(venue.getMaxSpeed());
		System.out.print(venue.getModel());
		System.out.println();
		//3��
		Car ray =new Car();
		ray.setCompany("���");
		ray.setColor("white");
		ray.setMaxSpeed(200);
		ray.setModel("2021��");
		//gettor�� ���
		System.out.println("=====ray gettor�� ���=======");
		System.out.println(ray.getCompany());
		System.out.println(ray.getColor());
		System.out.println(ray.getMaxSpeed());
		System.out.println(ray.getModel());
		
		Car grandeur = new Car();
		grandeur.setCompany("dd");
		grandeur.setColor("blue");
		grandeur.setMaxSpeed(250);
		grandeur.setModel("2022��");
		System.out.println(grandeur.getCompany());
		
		
		
	}

}
