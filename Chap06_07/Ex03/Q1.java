package Chap06_07.Ex03;

class Car{
	String company; //�ʵ�(�ν��Ͻ��ʵ�)�� company�� �˷��ִ� this,heap�޸𸮿� ����
	String model;	//�ν��Ͻ� : ��üȭ�� ���� �� ��� ������ �ʵ�
	String color;	//[�ʵ��: �ʵ� ��]�� Heap������ ����
	double maxSpeed;
	
	Car(){}
	Car(String company, String model, String color, double max ){
		this.company=company; //this Ű�� ��ü�� �ʵ��� ������ ���Ѵ�.
		this.model= model;	  //3�� ���� ��ΰ� ������ ��� ��ü �ʵ��� ������ �˷��ִ� ����
		this.color = color;
		maxSpeed = max; //this Ű���尡 ������ ����
	}
	//staticŰ�� ������ �ν��Ͻ� �޼ҵ�(��üȭ�� �� �ؾ���) / ������ static �޼ҵ�
	void work() {				//�޼ҵ�(�ν��Ͻ� �޼ҵ�) : Heap ������ �޼ҵ� ��� �����͸� ����.
		System.out.println(company); //�޼ҵ��� ��ü ������ Ŭ���� ������ �޽��念���� ����.
		System.out.println(color);
		System.out.println(model);
		System.out.println(maxSpeed);
		
	}
}

public class Q1 {

	public static void main(String[] args) {
		//�����ڸ� ���ؼ� �⺻ ���� �Ҵ� �� �޸��� ������ work()�޼ҵ带 ����ؼ� ���.
	Car a = new Car("����","�׷���","������",250.0);
	a.work();
	}

}
