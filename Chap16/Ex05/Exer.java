package Chap16.Ex05;

class Cake{
	String name;
	String data;
	int price;
	Cake(String name, String data, int price){
		this.name=name;
		this.data=data;
		this.price=price;
	}
	
}
class Coffee{
	String name;
	String data;
	int price;
	Coffee(String name, String data, int price){
		this.name=name;
		this.data=data;
		this.price=price;
	}
}

class Sale<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}


public class Exer {

	public static void main(String[] args) {
		Sale<Cake> sale1=new Sale();
		sale1.setT(new Cake("ÃÊÄÚ","1°³",6000));
		
	}

}
