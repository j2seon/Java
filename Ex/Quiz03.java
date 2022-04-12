package Ex;

class Student{
				//자바는 다중상속이 불가, 자바의 모든 클래스는 Object클래스의 자식클래스이다.
				//Object클래스에서 정의한 필드나 메소드를 재사용할 수 있다.
	String name;	//학생이름
	int studentID;	//학번
	int Kor; // 국어점수
	int eng; // 영어점수
	int math; //수학점수
	
	int sum; //점수합계
	double avg;  //평균
	
	void hobby () {
		System.out.println("각 학생의 취미입니다. ");
	}

	@Override
	public String toString() { //Object 클래스의 메소드 객체자체를 출력할때,[패키지명.클래스명@해쉬코드]
		return "이름 : "+name+ ", 학번 : "+ studentID+" , 국어"+ Kor+", 영어 "+eng+", 수학 : "+math+
				", 합계 : "+sum+", 평균 : "+ avg;
	}
	
}

class S_철수 extends Student{
	S_철수(){} //생성자 : 1 클래스명과 동일, 2.리턴타입이 없어야한다.
	S_철수(String a,int b,int c,int d,int e){
		super.name=a;		//super 부모 클래스, this :자신의 객채
		super.studentID=b;
		super.Kor=c;
		super.eng=d;
		super.math=e;
		super.sum=c+d+e;
		super.avg=(double)sum/3;
	}
	
	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시입니다.");
	}
	
}
class S_영희 extends Student{
	S_영희() {}
	
	S_영희(String a,int b,int c,int d,int e){
		super.name=a;
		super.studentID=b;
		super.Kor=c;
		super.eng=d;
		super.math=e;
		
		super.sum=c+d+e;
		super.avg=(double)sum/3;//or 뒤는 3.0으로 적으면된다.
	}
	@Override
	void hobby() {
		System.out.println("영희의 취미는 영화보기입니다.");  
	}
	
}
class S_영식 extends Student{
	S_영식() {}
	S_영식(String a,int b,int c,int d,int e){
		super.name=a;
		super.studentID=b;
		super.Kor=c;
		super.eng=d;
		super.math=e;
		super.sum=c+d+e;
		super.avg=(double)sum/3;
	}
	@Override
	void hobby() {
		System.out.println("영식의 취미는 노래부르기입니다.");
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		Student pp1 = new S_철수("철수", 20210303,80,70,80); //업캐스팅
		Student pp2 = new S_영희("영희", 20210301,90,100,90); //업캐스팅
		Student pp3 = new S_영식("영식", 20210302,70,60,50); //업캐스팅
		Student[] array= {pp1,pp2,pp3};
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]); 
			array[i].hobby(); //취미 메소드 출력
			}
		System.out.println("==========================");
		for(Student k : array) {
			System.out.println(k);
			k.hobby();
		}
	}
		
		
		

	}

