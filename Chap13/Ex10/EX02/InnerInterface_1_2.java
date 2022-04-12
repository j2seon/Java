package Chap13.Ex10.EX02;

class Abc{ 
	//1. 객체 생성 후 필드에 직접 값을 할당.(d1)
	//2. 생성자를 통해서 값할당 (d2)
	//3. setter를 통해서 값 할당(d3)
	Def d; 		//필드 
	Abc(){} 	//기본생성자
	Abc(Def d){
		this.d=d;
	}    
	void set(Def d) { //setter를 통해서 필드의 기본값 할당.
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
				System.out.println("달림1");
				}
			@Override
			public void fly() {
				System.out.println("날아올라1");
			}
		};
		d1.ghi();	
		System.out.println("==================");
		
		Abc d2 =new Abc(new Abc.Def() {
			@Override
			public void run() {
				System.out.println("달림2");
			}
			@Override
			public void fly() {
			System.out.println("날아올라2");	
			}
		});
		d2.ghi();
		System.out.println("=========================");
		
		Abc d3=new Abc();
		d3.set(new Abc.Def() {
			@Override
			public void run() {
				System.out.println("달림3");
			}
			@Override
			public void fly() {
				System.out.println("날아올라3");
			}
		});
		d3.ghi();
		
	}
}


