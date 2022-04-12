package Chap14.Ex05;

//자동 리소스(객체) 제거 : 
	//1. AutoCloseable 인터페이스 구현
	//2. close() 메소드 재정의


//필드에 값 할당. 생성자를 호출 시 필드에 값을 부여 , 
class Abc implements AutoCloseable{
	String name ;
	int StudentID ;
	int kor;
	int eng;
	int math;
	double avg;  //평균계산
	
	Abc(String name, int StudentID, int kor, int eng, int math){
		this.name=name;
		this.StudentID=StudentID;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.avg=(double)(kor+eng+math)/3;
		
	}

	@Override
	public void close() throws Exception {
		//초기화 전에 메모리 값을 출력( 밑에 안해도 여기다가하면된다)
		System.out.println(name+StudentID+kor+eng+math+avg);
		if(name!=null || StudentID !=0 || kor!=0|| eng!=0|| math !=0 || avg!=0.0)
			name=null;
			StudentID=0; kor=0; eng=0; math=0; avg=0.0;
			System.out.println("리소스 해제되었습니다");
		//초기화 후 메모리 값 출력
//내가 한거		
//		if(math != 0) {
//			math = 0;
//			System.out.println("리소스 해제되었습니다");
//		}
	}
	
}

public class Ex_tryWithResource_3 {

	public static void main(String[] args) {
		//1. 객체의 모든 필드를 초기화 하고 자동 close
		try(Abc a=new Abc("주진선",1,80,90,80);){
		System.out.println("이름 : "+a.name+" 학번 : "+a.StudentID+" 국어점수 : "+a.kor+" 영어점수 : "+a.eng+" 수학점수 "+a.math+" 평균 : "+a.avg);
		}catch (Exception e) {
			System.out.println("해제되었습니다.");
		}
		//2. 수동close(), finally 블락에서 close()호출
		Abc a2=null;
		try {
			a2=new Abc("이무개",1,80,90,80);
			System.out.println("이름 : "+a2.name+" 학번 : "+a2.StudentID+" 국어점수 : "+a2.kor+" 영어점수 : "+a2.eng+" 수학점수 "+a2.math+" 평균 : "+a2.avg);
		}catch (Exception e) {

		}finally {
			if(a2.name !=null) {
				try {
					a2.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
		
		
	}	
}


