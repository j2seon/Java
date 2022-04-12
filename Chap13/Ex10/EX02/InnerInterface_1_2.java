package Chap13.Ex10.EX02;

class Abc{ 
	//1. ��ü ���� �� �ʵ忡 ���� ���� �Ҵ�.(d1)
	//2. �����ڸ� ���ؼ� ���Ҵ� (d2)
	//3. setter�� ���ؼ� �� �Ҵ�(d3)
	Def d; 		//�ʵ� 
	Abc(){} 	//�⺻������
	Abc(Def d){
		this.d=d;
	}    
	void set(Def d) { //setter�� ���ؼ� �ʵ��� �⺻�� �Ҵ�.
		this.d=d;
	}
	interface Def{ //Abc.Def
		void run();
		void fly();
	}
	void ghi() {
		d.run();
		d.fly();
	}
}

public class InnerInterface_1_2 {

	public static void main(String[] args) {
		Abc d1= new Abc();
		d1.d = new Abc.Def() {
			@Override
			public void run() {
				System.out.println("�޸�1");
				}
			@Override
			public void fly() {
				System.out.println("���ƿö�1");
			}
		};
		d1.ghi();	
		System.out.println("==================");
		
		Abc d2 =new Abc(new Abc.Def() {
			@Override
			public void run() {
				System.out.println("�޸�2");
			}
			@Override
			public void fly() {
			System.out.println("���ƿö�2");	
			}
		});
		d2.ghi();
		System.out.println("=========================");
		
		Abc d3=new Abc();
		d3.set(new Abc.Def() {
			@Override
			public void run() {
				System.out.println("�޸�3");
			}
			@Override
			public void fly() {
				System.out.println("���ƿö�3");
			}
		});
		d3.ghi();
		
	}
}


