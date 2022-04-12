package Chap01;
	import java.util.Scanner;
public class Scanner02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 성별 , 나이를 입력해주세요");
		
		String name = sc.next();
		System.out.println("이름 : " + name + " , ");
		String gender = sc.next();
		System.out.println("성별 : " + gender + " , ");
		int age = sc.nextInt();
		System.out.println("나이 : " + age + " .");
		sc.close();

		
	}

}
