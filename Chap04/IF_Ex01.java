package Chap04;

public class IF_Ex01 {

	public static void main(String[] args) {
		/*if �� :
		 * if (����) {
		 * 	������ ���϶� ����� �ڵ�;
		 * }
		 */
		
		int value1 =5;
		if(value1 > 3) {
			System.out.println("���� : ������ ���� �� ����");
		}
		
		/*
		 * if(����) {
		 * 		������ ���� �� ������ ����;
		 * } else{
		 * 		������ ������ �� ������ ����;
		 * }
		 */
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool1) {
			System.out.println("����1"); //������ True�� �� 
		}else {
			System.out.println("����2"); //������ false�� ��
		}
		
	
		if (bool2) {
			System.out.println("����3"); //������ True�� �� 
		}else {
			System.out.println("����4"); //������ false�� ��
		}
		System.out.println("=========");
		
		//if ~else�� ���׿����ڷ� ��ȯ�� ����
		
		System.out.println((bool1)? "����5":"����6"); //���̹Ƿ� ���� 5 ���
		System.out.println((bool2)? "����7":"����8"); //�����̹Ƿ� ���� 8
		
		/*
		 * if�� ������ �������϶�? 
		 * 
		 * if (����1){
		 * 		����1�� ���϶� �����ڵ�;
		 * }else if (����2){
		 * 		����2�� ���϶� ���� �����ڵ�;
		 * }else if(����3){
		 * 		���� 3�� ���� �� �Ƿ�;
		 * }else {
		 * 		���� ������ ��� �������� ���� �� ������ �ڵ�;
		 * }	 
		 */
		
		int value3 = 64;
		if (value3>=90) {
			System.out.println("A ����, ���� : " + value3);
		}else if(value3>= 80) {
			System.out.println("B ����, ���� : " + value3); //���� �Ŀ� if���� �������´�.
		}else if(value3 >=70) {
			System.out.println("C ����, ���� : " + value3);
		}else {
			System.out.println("F ����, ���� : " + value3);
		}
		
		/*
		 * IF������ ������ ������ �ٲ�� ���� ���
		 */
		
		value3 = 85;
		if (value3>=90) {
			System.out.println("A ����, ���� : " + value3);
		}else if(value3>= 70) {
			System.out.println("C ����, ���� : " + value3); //���� �Ŀ� if���� �������´�.
		}else if(value3 >=80) {
			System.out.println("B ����, ���� : " + value3);
		}else {
			System.out.println("F ����, ���� : " + value3);
		}
		System.out.println("=============");
		// ������ �ο��Ҷ� �����ϰ� �����ؾ��Ѵ�. 
		
		value3 = 85;
		if(value3<=100 && value3>=90){
			System.out.println("A�����Դϴ�.");
		}else if (value3 < 80 && value3>= 70){
			System.out.println("C�����Դϴ�.");
		}else if ( value3 <90 && value3 >=80) {
			System.out.println("B�����Դϴ�");
		}
		
		System.out.println("======{}��������1=========");
		
		/*
		 * if������ ���๮�� �ϳ��� �� {}�� ������ �� �ִ�.
		 */
		
		if(3<5)
			System.out.println("�ȳ��ϼ���");  // true�̸鼭 ���๮ 1�� {}����
		
		System.out.println("======={}���� ����2========");
		

	if (3 > 5)  //���������� ��������� �ƴϴ�.
			System.out.println("�ȳ��ϼ���2");
			System.out.println("�ݰ����ϴ�.");
		
	}
	}

