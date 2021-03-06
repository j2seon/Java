package Chap14.Ex01;

public class CheckExcption1_1 {

	public static void main(String[] args) {
		
		try {
			System.out.println(10/0); //프로그램이 비정상 종료된다.// 예외에 대한 처리
		}catch(ArithmeticException e) {
			//try{}에서 오류가 발생할 경우에 작동.
			e.printStackTrace(); //오류에 대한 자세한 정보를 출력
			//System.out.println("0을 넣을 수 없습니다.");
			
			//catch 블락의 설정을 하지 않아도 예외 처리가 된것이다.
		}finally {
			//try{} 오류가 없어도 작동 (0), 오류가 있어도 (0)
			//try{}가 작동되면 항상 작동
			//객체를 사용 후 객체의 메모리를 제거할 때 , 예) sc.close();
			System.out.println("Finally 블럭은 항상 호출된다");
		}
		
		System.out.println("프로그램을 정상 종료합니다."); //정상종료
	}

}


