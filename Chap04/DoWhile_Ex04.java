package Chap04;

public class DoWhile_Ex04 {

	public static void main(String[] args) {
		
		//1. while문과 do while문의 비교
		System.out.println("======반복횟수가 0인 경우======");
		int a=0;
		while(a<3) {
			System.out.print(a+ " "); //조건이 true일때만 실행됨. false면 실행x
			a++;
		}
		System.out.println();
		System.out.println("========do while===========");
		
		a=0;
		do{
			System.out.println(a+" "); //do while에서 무조건 1번은 실행됨
			a++;
		} while(a<0); //조건이 false
		
		System.out.println("========반복횟수가 1인 경우========");
		//2. 반복 횟수가 1인 경우
		a=0;
		while( a < 1) {
			System.out.println(a+" ");
			a++;
		}
		System.out.println("========반복횟수 1인 경우 dowhile=========");
		a=0;
		do {
			System.out.println( a + " ");
			a++;
		} while(a<2);
		
		System.out.println("========반복 10번=========");
		
		//3. 반복 횟수가 10인 경우
		a=0;
		while(a<10){
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<10);
		
	}
}
