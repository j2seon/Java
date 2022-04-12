package Chap01;
public class Ex01_ConsolOut {
	public static void main(String[] args) {
		System.out.println("출력을 처리하고 엔터가 들어감");
		System.out.println("==============");
		System.out.print("화면"); //print만 있는 경우 엔터가 들어가지 않는다.
		System.out.print("출력");
		System.out.println("==============");
		System.out.print("화면\n"); //\n도 엔터역할이다. 
		System.out.print("출력");
	}

}
