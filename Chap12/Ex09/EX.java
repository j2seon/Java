package Chap12.Ex09;

public class EX {
 public static void main(String[] args) {
	//1. SamSungPhoneŸ������ ����
	 SamSungPhone s1 = new SamSungPhone();
	 s1.printLogo(); 	//interface���� default �޼ҵ尡 ��ӵǾ� ������ ���
	 s1.sendCall();		//
	 s1.receiveCall();
	 s1.flash();
	 
	 System.out.println("=================================");
	 
	 //2. phoneInterface�� ��ĳ����
	 PhoneInterface s2 = new SamSungPhone();
	 s2.printLogo();
	 s2.sendCall();
	 s2.receiveCall();
	 SamSungPhone ss = (SamSungPhone)s2; //s2 : phone Interface ===> Samsungphone�� Ÿ�Ժ�ȯ
	 
	 ss.flash(); //flash �ٿ� ĳ���� �� ���
	 
 }
}
