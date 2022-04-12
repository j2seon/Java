package Chap10.Ex04;

class Animal3{	//�θ�Ŭ����, ���Ŭ������ ObjectŬ������ ����Ѵ�.(extends Object)
	String name;
	int age;
	void cry() {
		System.out.println("������ ��ϴ�.");
	}
	
	@Override //Object.toString �޼ҵ�� ��  ü��ü�� ����Ҷ� ȣ���� �ȴ�/
	public String toString() { //��ü�� �ּҸ� ����մϴ�. [��Ű����.Ŭ������@��ü�� �޸��� �콬�ڵ�]
		return "�̸��� : "+name+", ���̴� : "+age+"�Դϴ�.";		
	}
}

class Tiger3 extends Animal3{
	Tiger3(){} //�⺻������ : ������ �ʱ�ȭ ���� �Ҵ����� �ʰ� �ʱ�ȭ.
			  // �ٸ������ڰ� ��ü���� ������ ��� �⺻ �����ڸ� �ܺο��� ȣ�� �� �����Ǹ� �ȵȴ�.
	
	Tiger3(String a, int b){ //������ : ��ü�� �����Ҷ� �޸𸮿� �ʱ� ���� �Ҵ��Ҷ� ���. 
		super.name =a;	//super : �θ� Ŭ����, this: �ڱ��ڽ��� ��ü 
		super.age =b;
	}
	@Override
	void cry() {
		//super.cry(); 	//super Ű����� �θ�Ŭ������ ����, super:��Ӱ����϶� �θ�Ŭ����
						//this Ű����� �ڱ��ڽ��� ��ü
		System.out.println("ȣ���̴� '����' �ϰ� ��ϴ�.");
	}
}

class cat3 extends Animal3{
	cat3(){} //�⺻ ������
	cat3(String a, int b){ //������ 
		super.name=a;
		super.age=b;
	}
	@Override
	void cry() {
		//super.cry();
		System.out.println("����̴� �߿��ϰ� ��ϴ�.");
	}	
}

class Dog3 extends Animal3{
	Dog3(){}
	Dog3(String a, int b){ //������
		super.name=a;
		super.age=b;
	}
	@Override
	void cry() {
		//super.cry();
		System.out.println("���� �۸��ϰ� ��ϴ�");
	}
}


public class Test02 {

	public static void main(String[] args) {
		
		Animal3 a3 =new Animal3();
		System.out.println(a3); //��ü��ü�� ����� ��� ObjectŬ������ toString �޼ҵ尡 ȣ��
							//Object.toString(): ��ü�� �޸� �ּ��� �ؽ��ڵ带 ���
							//Chap10.Ex04.Animal3@32d2fa64 <== ��Ű����.��ü��@�ؽ��ڵ�
		System.out.println(a3.toString());
		//��ü ��ü�� ����ϸ� Object Ŭ������ toString �޼ҵ带 ȣ��
		System.out.println("=============");
		
		Animal3 t3 = new Tiger3(); //tiger3�� animal3�� ��ĳ���� 
		Animal3 c3 =new cat3(); //cat3�� animal3�� ��ĳ����
		Animal3 d3 =new Dog3(); // animal3�� ��ĳ����

		t3.cry(); //�θ��� cry()�� ȣ���Ұ�� �������̵� �� tiger3�� cry()�� ȣ��
		c3.cry(); //�θ��� cry()
		
		System.out.println("=================");
		
		Animal3[] arr = {t3,c3,d3}; 	//Animal3�� �迭�� ����.
		for(int i=1; i<arr.length; i++ ) {
			arr[i].cry();
		}
		System.out.println("=================");
		for(Animal3 k : arr) {
			k.cry();
		}
		System.out.println("================");
		
		Animal3 aa3 = new Tiger3("ȣ����", 5); 
		Animal3 cc3 = new cat3("�����",3);
		Animal3 dd3 = new Dog3("��", 10);
		
		System.out.println(aa3); //��ü ��ü�� ��� �� �⺻������ ��ü�� �޸��ؽ��ڵ尡 ���
		System.out.println(cc3); //Object�� toSrting()�żҵ带 ������
		System.out.println(dd3);
		
		Animal3[] arr2= {aa3,cc3,dd3};
		
		System.out.println("===============");
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("===============");
		for(Animal3 k: arr2) {
			System.out.println(k);
		}
	}

}
