package Chap16.Ex02;

//4���� ��ü�� Object�� ����ؼ� ����غ���

class Student{
	String name;
	String id;
	int pass;
	public Student(String name, String id, int pass) {
		this.name=name;
		this.id=id;
		this.pass=pass;
	}
	@Override
	public String toString() {
		return "�̸� : "+name+", id :"+id+", ��й�ȣ : "+pass;
	}
	
}
class professor{
	String name;
	int year;
	String email;
	public professor(String name,int year, String email) {
		this.name=name;
		this.year=year;
		this.email=email;
	}
	@Override
	public String toString() {
		return "�̸� : "+ name+" , ���� :"+year+" , �̸��� : "+ email;
	}
}

class Tiger{
	String name;
	String run;
	public Tiger(String name, String run) {
		this.name=name;
		this.run=run;
	}
	@Override
	public String toString() {
		return "�̸� : "+name+ " , run : "+ run;
	}
	
}
class Banana{
	String name;
	String color;
	int price;
	public Banana(String name, String color,int price) {
		this.name=name;
		this.color=color;
		this.price = price;		
	}
	@Override
	public String toString() {
		return "�̸� : "+ name + ", ���� : "+ color+ ", ���� : "+ price+"��";
	}
}

class Use{
	private Object obj =new Object();

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}	
} 

public class Ex_UsingObject {

	public static void main(String[] args) {
		Use use1=new Use();
		use1.setObj(new Student("����", "1111", 1212));
		System.out.println((Student)use1.getObj());
		
		Use use2=new Use();
		use2.setObj(new professor("�̱���", 2, "kkk@gamil.com"));
		System.out.println((professor)use2.getObj());
		
		Use use3=new Use();
		use3.setObj(new Tiger("ȣ����", "������ �޸�"));
		System.out.println((Tiger)use3.getObj());
		
		Use use4=new Use();
		use4.setObj(new Banana("Ķ�����Ͼ� �ٳ���", "�����", 5000));
		System.out.println((Banana)use4.getObj());


	}

}
