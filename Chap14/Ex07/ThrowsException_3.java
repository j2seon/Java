package Chap14.Ex07;

//Exception - Checked Exception -������ ���� , �ݵ�� ���� ó��
//			unchecked Exception, Runtime Exception -����ÿ� ����
//���� ó�� ��� - try catch : �ڽ��� �������ܸ� ó��
//			 - throws : ����ó���� �̷�� ��(����) , �޼ҵ� ��� ���� ���ܸ� �޼ҵ� ȣ�� �� ȣ���ϴ� ������ �̷�� ��.
// 			 - throw : ���ܸ� ���� �߻� .

//1.Exception�� �߻��Ǵ� �޼ҵ� ���ο��� �ڽ��� ���� ���ܸ� ó���� ���

class A{
	void abc() {
		bcd(); 		//bcd(); ȣ��
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");//�Ϲ� ����
			Thread.sleep(1000); 	//ms : 1000, 1��		  //�Ϲ� ����
		} catch (ClassNotFoundException | InterruptedException e) {
		}  //�Ϲ� ����
			// Class.forName : �����ε� - ������ �ÿ� üũ���� �ʰ� ������ �� ��ü�� �����ϴ��� Ȯ��.
				//���� �� Ŭ���� ������ ������ �� �� �ְ� �������� ���� ���� �ֱ� ������ ���� ó���� �ؾ��Ѵ�.
	}
} 

//2. Throws�� ����ؼ� Exception�� �̷�� ��� 
class B{
	void abc() {
		
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
			
		}
	}
	
	//bcd �޼ҵ带 ȣ���ϴ� ������ ���ܸ� �̷絵�� �Ѵ�.
	void bcd() throws ClassNotFoundException, InterruptedException {
		Class cls = Class.forName("java.lang.Object");//�Ϲ� ����
		Thread.sleep(1000); 	//ms : 1000, 1��		  //�Ϲ� ����
	}
}


public class ThrowsException_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
