package Chap14.Ex08;

//ID�� ���� null �� �� ��� Exception �߻�
//userID�� : 8���̻� 20�ڰ� �ƴѰ�� Exception

// �Ϲݿ��� ���� -
class IDFormatException extends Exception{ //�ΰ� �����ڸ� ����
	public IDFormatException() {
		super();
	}
	public IDFormatException(String message) { //���� �߻� �� ���� �޼��� ���!! e.getMessage();
		super(message);
	}
	
}


public class IDFormatTest {
	private String userID;		//üũ : null, 8���̻� 20�ڰ� �ƴѰ�� Exception
		//userID ĸ��ȭ ��. private : �ܺγ� �ٸ� Ŭ�������� ���� ����.
			//������, Settor�� ����ؼ� ���� �Ҵ�. 
		//private���� ������ ��� : getter�� setter ����Ѵ�.
	
	
	public String getUserID() { //getter �޼ҵ� ȣ�� �� �޸��� userID�� ������.
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException { //setter
		if(userID ==null) {
			throw new IDFormatException("���̵��  NUll �� �� �����ϴ�.");
		}else if(userID.length()<8||userID.length()>20) {
			throw new IDFormatException("���̵�� 8���̻� 20�����Ϸ� ��밡���մϴ�.");
		}else {
			System.out.println("���������� �� �ԷµǾ����ϴ�.");
		}
		this.userID=userID;
	}
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		//userID�� null�� ���
		String userID = null;		//setter ȣ��� null �Է� �� ȣ��
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("========================");
		
		//2. userID�� 7�� ���� ���
		
		userID ="1234567";
		try {
		test.setUserID(userID);
		}catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("======================");
		
		//3. null�� �ƴϰ� 8���̻� 20�� �̸��� ��� : ����
		userID = "1234567890";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage()); //�޼��� ���
		}
		System.out.println(test.getUserID());
	}

}
