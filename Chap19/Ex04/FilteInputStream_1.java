package Chap19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilteInputStream_1 {

	public static void main(String[] args) throws IOException {
		
		//���� �۾� ���丮 ��ġ Ȯ��
		System.out.println(System.getProperty("user.dir"));
		//1. �Է����� ����
			//���� ��η� ����
		File inFile1 = new File("J:\\js\\JAVA\\src\\Chap19\\files\\FileInputStream_1.txt");
			//����η� ���� : ���� �۾�����󿡼� ����
		File inFile = new File("src\\Chap19\\files\\FileInputStream_1.txt");
		
			//InputStream�� ��ü�� �����ؾ� ������ ������ ���� �� �Ҵ�.
		InputStream is = new FileInputStream(inFile) ;
			//InputStream�� �߻�Ŭ����, ���� ��ü ������ �� �� ����, Ÿ�������� ����
		//������ ������ ���.
		
//		int data;
		//UTf-8 : ����(1byte), �ѱ�(3byte)
		//UTF- 16 : ����, �ѱ�: 2byte, ù��° BOM 2byte<= �ĺ���
		//MS949 : ����(1byte), �ѱ�(2byte)
		//EUC-KR : ����(1byte), �ѱ�(2byte)
		
		//JAVA���� �ٹٲ�ó�� 
		// - UNIX : \n
		// - Windows : \r\n    <==\r�� �����ص���.  <=�ܼ��̳� �޸��忡�� enter : \r\n
		// - MAC : \r
		
		//�ѹ���Ʈ �����͸� �о char�� ��ȯ �� ���
//		System.out.print(is.read());  //read() �� ����Ʈ�� �о���δ�.
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//		System.out.print((char)is.read());
//	
		System.out.println();
		System.out.println();
		System.out.println("=======================================");

		//��Ʈ���� ���� ������ �޸𸮿��� �����ȴ�. ������ �б� ���ؼ��� ���ο� ��Ʈ���� �����ؾ��Ѵ�!!
		
		//int read() : �� ����Ʈ�� �о ���� ������ ��� ����� ����, ���� �����Ͱ� �������� ���� ��� ������ ����
		//while ���� ����ؼ� �ѹ��� ���
		
		
	
		int data;
		while((data=is.read())!=-1) { // -1�� �ƴҶ������� ������ ����, ������������ ��� ��ȯ (-1�� ���� ������ ���´�)
			System.out.print((char)data);
		} 
			//�߿� : is.read() : 1byte�� �о� ����. ��ȯŸ���� int �̴�.
			// 
		    //FileInputStram�� �ݵ�� index 0�� ���� �о� ����. �߰� ������ ������ ���� �� �� ����.
			//FileRandomAccess�� ����ؼ� ������ index���� �о� ����.
			
		System.out.println();
		System.out.println();
		
		System.out.println("======================================");
		
		//available() : ��Ʈ���� ���� ����Ʈ���� ���.
		
		InputStream is2 = new FileInputStream(inFile) ;
		
		while((data=is2.read())!=-1) { // -1�� �ƴҶ������� ������ ����, ������������ ��� ��ȯ (-1�� ���� ������ ���´�)
			System.out.println("���� ������ : "+(char)data+ "  ���� ����Ʈ �� : "+ is2.available());
		} 
		is.close();
		is2.close();
		
		
	}

}
