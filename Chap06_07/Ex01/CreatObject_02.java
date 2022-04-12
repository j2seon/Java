package Chap06_07.Ex01;

//외부 클래스
class Aaa{  
	String name;  //필드 : 객체화 시켜야 사용가능, 클래스블럭에서 선언
	int age;		//필드의 값은 Heap영역 안에 저장, Heap영역의 변수들은 강제초기화가됌.
	double weight;
	boolean man ;	//참조변수 : NULL, int:0,double :0.0, boolean :false
	String email;   //필드는 선언만되고 값이 할당이 안 되어있음:
				
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public String getName() { //메소드 호출
		return name;
	}
	public void setName(String name) { //인풋되는 변수, 받는 변수이름, 메모리 이름모두 동일할경우
		this.name = name;  //메모리 이름에 this:자기자신의 클래스의 변수
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


public class CreatObject_02 {

	public static void main(String[] args) {
		
		Aaa aaa = new Aaa(); //객체생성 (aa)
		
		//필드의 초기 값을 출력(Heap 영역은 강제 초기화)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		System.out.println("=============");
		
		//변수의 값을 직접 대입 보안 상 메모리에 직접 값을 할당하지 않는다. 캡슐화
		aaa.name="주진선";
		aaa.age=27;
		aaa.weight=53.6;
		aaa.man=false;
		aaa.email = "aaa@aaa.com";
		
		
		//setter를 통해서 값을 대입
		aaa.setName("세종대왕");
		aaa.setAge(60);
		aaa.setEmail("2222@ssss");
		aaa.setMan(true);
		aaa.setWeight(60);
		
		System.out.println("=====================");
		
		
		//getter를 통해서 메모리의 값을 출력
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getMan());
		System.out.println(aaa.getWeight());
		
		//하나의 클래스에서 여러개의 객체를 생성 및 사용.
		
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa();
		
	}

}
