package Chap16.Ex05;


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
		return "이름 : "+name+", id :"+id+", 비밀번호 : "+pass;
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
		return "이름 : "+ name+" , 연도 :"+year+" , 이메일 : "+ email;
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
		return "이름 : "+name+ " , run : "+ run;
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
		return "이름 : "+ name + ", 색깔 : "+ color+ ", 가격 : "+ price+"원";
	}
}

class Use<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}


public class Ex_Genetic {

	public static void main(String[] args) {
		Use<Student> use1 = new Use();
		use1.setT(new Student("주진선", "1번", 1234));
		System.out.println(use1.getT());
		
		Use<professor> use2 = new Use();
		use2.setT(new professor("김모씨", 44,"dd@dd.ㅇㅇㅇ"));
		System.out.println(use2.getT());
		
		Use<Tiger> use3 = new Use();
		use3.setT(new Tiger("호호랭", "빠름"));
		System.out.println(use3.getT());

		Use<Banana> use4 = new Use();
		use4.setT(new Banana("바나나","노랑초록",6000));
		System.out.println(use4.getT());
		
		
	}

}
