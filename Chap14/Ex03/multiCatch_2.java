package Chap14.Ex03;

public class multiCatch_2 {

	public static void main(String[] args) {
		//1. Exception에서 모든 예외를 처리 할 수 있다.
			//모든 예외는 Exception
		
		try {
			
		}catch(Exception e){
			//try{} 블락에서 발생하는 모든 예외는 Exception 클래스가 모두처리
			 System.out.println("에외처리 (Exception)");
		}
		
		
		//2. catch 블락의 순서가 잘못된 경우 : Exception은 catch의 마지막에 위치해야한다.
		/*try {
			
		}catch(Exception e){
			//try{} 블락에서 발생하는 모든 예외는 Exception 클래스가 모두처리
			 System.out.println("에외처리 (Exception)");
		}catch (ArithmeticException e) {
		}
		catch (NumberFormatException e) {
			
		}*/
		
		//3. catch 블락의 올바른 순서 : 최상의 Exception은 catch 블락의 마지막에 위치
		try {
			System.out.println(10/0);
			int num =Integer.parseInt("10A");
		}catch (ArithmeticException e) { //최하위 Exception
		
		}catch (NumberFormatException e) {
			
		}catch (Exception e) {
		
		}
		//4. 여러개의 exception을 통합해서 적용.
		
		try {
			
		}catch (ArithmeticException | NumberFormatException e) { //최하위 Exception
	
		}catch (Exception e) {
		
		}
		
		
	}

}
