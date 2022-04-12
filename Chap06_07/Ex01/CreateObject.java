package Chap06_07.Ex01;

class AA{
	String name; //필드(멤버) : 인스턴스화 시켜야 사용이 가능하다. (Heap 공간에 값이 저장)
	int age;
	String email;
	
	AA(){ //기본생성자: 생략가능, 다른생성자가 존재할 경우 기본생성자를 생략하면 오류.
		
	}
	
	public String getName() { //메소드(멤버): 인스턴스화 시켜야 사용가능
		return name;	//Heap 공간에 주소만 저장, 클래서영역 내의 메소드영역에 저장
	}					//return: 메소드를 호출하는 곳으로 변수의 값을 던져준다.
	public void setName(String name) { //void : 리턴값이 없다를 알려주는 식별자
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

public class CreateObject {

	public static void main(String[] args) {
		AA aa = new AA(); //AA 클래스(설계도)를 aa(객체)를 생성.
		//AA는 클래스이름, aa: 객체명(인스턴스명), new : Heap영역에 필드와 메소드를 저장해라
		//AA() : 생성자 객체의 필드값을 초기화 할때 사용, 생성자도 하나의 메소드이다
				//1. 생성자 이름이 클래스 이름과 동일 메소드.
				//2. 리턴타입이 없다.
				//3. 생성자중 매개변수가 없는 생성자를 기본생성자라고 함.
				//4. 기본생성자는 생략이 가능.
				//5. 객체를 생성할 때 반드시 생성자를 호출
		//객체의 메소드 호출
		System.out.println(aa.getName()); 
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("==============");
		
		
		//객체의 필드 호출
		System.out.println(aa.name); 
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		//=========================
		
		//메소드 호출 
		System.out.println("===============");
		//setters : 객체의 메모리에 값을 할당할 때
		aa.setName("홍길동"); //객체의 변수에 값을 할당
		aa.setAge(29);  //
		aa.setEmail("aaa@aaa.com");
		
		//getters : 객체의 메모리의 값을 가지고 올 때 
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("==================");
		
		AA bb =new AA();
		bb.setName("주진선");
		bb.setAge(27);
		bb.setEmail("ddj04323@naver.com");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		System.out.println("====================");
		
		AA cc = new AA();
		cc.setName("청포도");
		cc.setAge(12);
		cc.setEmail("grape@gmail.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
	}

}
