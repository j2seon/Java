package Chap06_07.Ex06;

// 객체의 필드에 값을 할당하는 방식 : 3가지 	<== 객체를 생성 후
	//1. 필드에 직접 값을 부여하는 방식 	<== 객체를 생성 후
	//2. setter를 통해서 객체에 필드에 값을 부여.(컨트롤이 된다.)	<==객체를 생성할 때 초기 값으로 필드에 값을 할당.
	//3. 생성자를 통해서 객체의 필드 값을 부여.

class Aa {//1. 객체 생성 후 직접 필드에 값 할당
	String name;  //이름
	int age;	 //나이
	String mail;//메일 주소
	
	void print() {
		System.out.println("name : "+ name +" age : "+ age +" mail : "+mail);
	}
}
class Bb{ 	//2. setter를 통해서 객체의 필드의 값을 할당
	String name;//이름
	int age;//나이
	String mail;//메일 주소
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	
	void print() {
		System.out.println("name : "+ name +" age : "+ age +" mail : "+mail);
	}
}
class Cc{//3. 생성자를 통해서 객체의 필드의 값 할당
	String name;//이름
	int age;//나이
	String mail;//메일 주소
	
	Cc(String a, int b, String c){  //생성자에서 매개변수 3개를 받음!!!
		name=a;
		age=b;
		mail=c;
	}
	
	void print() {
		System.out.println("name : "+ name +" age : "+ age +" mail : "+mail);
	}
}

public class FieldOfValue {

	public static void main(String[] args) {
		//1. 객체의 필드에 직접 값을 할당.
		Aa aa=new Aa();	//객체를 생성 후
		aa.name="진선";
		aa.age=27;
		aa.mail="aaa@aaa.com";
		aa.print();
		
		//2. 객체의 setter를 사용해서 필드의 값을 부여
		Bb bb=new Bb();		//객체를 생성 후 
		bb.setName("주진선");
		bb.setAge(27);
		bb.setMail("ddd@ddd.com");
		bb.print();
		
		
		//3. 생성자를 사용해서 필드의 값을 부여.(객체를 생성할 때 필드의 값을 초기화)
		Cc cc =new Cc("진선",34,"ㅈㅈㅈ.ㅈㅈㅈㅈ");  //객체를 생성할때 필드의 값을 부여
		cc.print();
		
	}

}
