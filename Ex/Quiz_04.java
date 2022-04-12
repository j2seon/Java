package Ex;

class E{
	String name;
	E(){} //기본생성자 : 클래스내의 다른 생성자가 존재할 때 외부에서 기본생성자를 호출할때 생략되면 안된다.
	E(String name){
		this.name =name;	//매개변수 이름, 구현부에서 매개변수를 받는 변수명, 필드의 변수명이 모두 동일할 경우
							//this : 자신의 객체 
	}
	@Override
	public String toString() {	//객체 자체를 출력 시 toString()가 호출

		return "이름 : "+ name; 		//this.name, 
	}
	@Override
	public boolean equals(Object obj) {	//e2.equals(e3); e3가 Object타입으로 업캐스팅되어서 들어감
		if(this.name ==((E)obj).name) {	//두객체의 name 필드의 값을 비교
			return true;
		}else {
			return false;
		}
	}
	
}

class Student1{
	int studentID;
	String name;
	int kor;
	int eng;
	
	Student1(int studentID, String name, int kor,int eng){
		this.studentID=studentID;
		this.name=name;
		this.kor=kor;
		this.eng =eng;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.studentID == ((Student1)obj).studentID){
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentID+", "+name+","+kor+", "+eng;
	}
	
}

public class Quiz_04 {

	public static void main(String[] args) {
		Student1 s1 =new Student1(1111, "홍길동 ", 90,80);
		Student1 s2 =new Student1(2223, "주진선",90,90);
		Student1 s3 =new Student1(3333,"김모씨",80,80);
		Student1 s4 =new Student1(1111,"갈동",70,80);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		/*studentID가 같은 경우 같은 학생이다라고 출력
		//객체의 StudentID 컬럼을 비교해서 같을 경우 '같은 학생이다'라고 출력
			// == : 기본타입 : boolean, byte , shot , int, long, double, float, char :8개
							값을 비교.
				 참조 타입인 경우 : 객체의 주소를 비교. 배열, 객체, String(특수하게 사용 됨),
				 	String : toString() : 재정의 되어 있다. equals(재정의)
			Object 의 toString() - 객체 자체를 println(a), 패키지이름.클래스이름@해쉬코드
						//오버라이딩 해서 객체의 필드의 정보를 출력.
					   equals() : == 과 같다., 객체의 주소를 비교 
					  			 재정의해서 사용. 객체 내의 특정 필드의 값을 비교. 
		*/
		
		if(s1.equals(s4)) {
			System.out.println("같은학생입니다.");
		}else {
			System.out.println("다른학생입니다.");
		}
		
		 System.out.println(s1.equals(s4));  //true;
		 
		 E e1 = new E();		//기본 생성자 호출: heap의 필드의 값은 강제초기화 됨
		 System.out.println(e1.name); //null
		 E e2 = new E("고양이"); 
		 System.out.println(e2.name);
		 
		 E e3 =new E ("고양이");
		 System.out.println(e2==e3); 	//참조 타입 (==): 객체의 주소를 비교 
		 System.out.println(e2);
		 System.out.println(e3);
		 System.out.println(e2.equals(e3)); //Object의 equals():(==) : 객체의 주소를 비교
		 //Object의 toString(), equals()는 재정의 해서 사용.

	}
	

}
