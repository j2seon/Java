package Chap14.Ex03;

public class multiCatch_2 {

	public static void main(String[] args) {
		//1. Exception���� ��� ���ܸ� ó�� �� �� �ִ�.
			//��� ���ܴ� Exception
		
		try {
			
		}catch(Exception e){
			//try{} ������� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ���ó��
			 System.out.println("����ó�� (Exception)");
		}
		
		
		//2. catch ����� ������ �߸��� ��� : Exception�� catch�� �������� ��ġ�ؾ��Ѵ�.
		/*try {
			
		}catch(Exception e){
			//try{} ������� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ���ó��
			 System.out.println("����ó�� (Exception)");
		}catch (ArithmeticException e) {
		}
		catch (NumberFormatException e) {
			
		}*/
		
		//3. catch ����� �ùٸ� ���� : �ֻ��� Exception�� catch ����� �������� ��ġ
		try {
			System.out.println(10/0);
			int num =Integer.parseInt("10A");
		}catch (ArithmeticException e) { //������ Exception
		
		}catch (NumberFormatException e) {
			
		}catch (Exception e) {
		
		}
		//4. �������� exception�� �����ؼ� ����.
		
		try {
			
		}catch (ArithmeticException | NumberFormatException e) { //������ Exception
	
		}catch (Exception e) {
		
		}
		
		
	}

}
