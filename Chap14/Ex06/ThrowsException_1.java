package Chap14.Ex06;

/*����ó��  2���� ���
 * 
 *		 1. ���� ó���ϴ� ��� : try catch
 * 
 *		 2. ���� ����(�̷��) : throws, �޼ҵ带 ȣ���ϴ� �ʿ��� ���ܸ� ó���ϵ��� ����(�̷��)
 *				throws : ������ ���ܸ� �߻���Ų��.		
 * */

class A { 	//�޼ҵ� ���ο��� ����ó���� ��������
	void abc() {
		bcd();
	}
	void bcd() { //�Ϲ� ���� : interruptedException
		try {	
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("���� �߻� 1 ");
		}  
	}
}
class B{
	void abc() {		//bcd()�޼ҵ��� ���ܸ� ó���� �ǹ��� ������.
		try {		//����ó��
			bcd();
		} catch (InterruptedException e) {
			System.out.println("���� �߻� 2");
			//e.printStackTrace();
		}			
	}
	void bcd() throws InterruptedException  { //bcd �޼ҵ带 ȣ���ϴ� ������ ���ܸ� ó���ϵ��� �̷�� ��
		Thread.sleep(1000); //�Ϲݿ��� : InterruptedException
	}
}


public class ThrowsException_1 {

	public static void main(String[] args) {
		A a1 =new A();
		a1.abc();

	}

}
