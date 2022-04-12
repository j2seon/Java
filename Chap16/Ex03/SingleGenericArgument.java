package Chap16.Ex03;

//Object : 모든 객체를 저장할 수 있지만 다운캐스팅이 필요 , 캐스팅시 예외가 발생 될 수 있다 (약한 타입 체크)
//제너릭 클래스 : 하나의 클래스에서 다양한 데이터 타입을 처리할 수 있다.
		//제너릭 타입 변수: T(타입),K(key),V(Value),N(Number, 숫자),E(Element, 원소)
		// - A ~ Z 임의로 넣을 수 있다.
		//wrapper 클래스 : 기본타입을 객체화 시켜놓은 클래스 
			//int(기본타입) ==>Integer(객체),boolean ==>Boolean, char==>Charter
			//double ==>Double, float ==>Float
			//Byte , Short, Long

//제너릭 클래스
class MyClass<T>{
	private T t;
	public T get() { //getter 필드의 값을 가져오기 
		return t;
	}
	public void set(T t) {  //Setter 필드의 값을 할당 
		this.t=t;
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		//1.제너릭 클래스 객체 생성<String>을 입력
		MyClass<String> mc1= new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
		
		//2. 제너릭 클래스 생성 <integer> 
		MyClass<Integer> mc2=new MyClass<Integer>();  //Wrapper 클래스를 할당 해야한다.
		mc2.set(100);
		System.out.println(mc2.get());
		
		//3.제너릭 클래스 객체 생성 <integer>을 입력
		MyClass<Double> mc3 = new MyClass();
		mc3.set(333.33);
		System.out.println(mc3.get());
		
		//4. 강한 타입체크(컴파일 단계에서 오류를 출력)
		MyClass <Boolean> mc4 =new MyClass<Boolean>();
		//mc4.set("안녕");  // 강한 타입 체크, 실행시에 오류를 방지 시켜줌.
		
		
		
	}

}
