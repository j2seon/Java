package Chap13.Ex10;

class Button{
	//OnClickListener : 객체타입, ocl: 참조변수
	OnclickListener ocl;   //ocl 기본 값으로 null
	
	
	//setter를 통해서 OnclickListener의 참조변수 ocl에 객체 주소를 담는다. 
	void setonClickListener(OnclickListener ocl) {
		this.ocl=ocl;
	}
	//구현한 자식클래스가 없다.
	//호출하는 곳에서 인터페이스의 onClick()메소드를 재정의해서 호출
	interface OnclickListener { //InnerInterface, static이 생략, Button.OnclickListener :
		void onClick(); 	//메소드 선언만 됨, 하위에서 오버라이딩 해서 재정의 
	}
	void click() {		//실행했을 때 ocl.onClick()를 호출 
		ocl.onClick();	//ocl : 참조변수 :null ===>set
		System.out.println(ocl);
	}
}
public class ButtonAPIExample {

	public static void main(String[] args) {
		//개발자 1 : 클릭 시 음악 재생
		Button button1=new Button(); // button1 객체 생성,
		
		//A.B ab = new A.B(){이너인터페이스B의 메소드를 구현한 코드};
		//OnClickListener 객체 타입으로 객체 생성해서 매개변수로 전달
		button1.setonClickListener(new Button.OnclickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자1. 음악재생");
			}
		});	
		
		button1.click();
		System.out.println("==========================");
		
		//개발자 2 : 클릭 시 네이버 접속 
		Button button2=new Button();
		//setonClickListener 메소드에 매개변수로 OnClickListener의 하위 익명객체를 생성후 OnClickListener
		button2.setonClickListener(new Button.OnclickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자 2. 네이버 접속");
			}
		} );
		button2.click();
	}

}
