package Chap19.Ex06.Ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// �ֿܼ��� �迭 100byte ���� �ѱ��� ��ǲ ���� ���� input.txt �� ���� �� , Characterset : Default
// input.txt ���Ͽ��� ���� �о �ܼ�(System.out)�� ����ؼ� �ֿܼ� ���.
//��Ʈ : 
	//1. System.in   		: �ֿܼ��� ��ǲ 
	//2. FileOutputStream 	: ��ǲ ���� ���� ���Ͽ� ���� 
	//3. FileInputStream 	: ����� ������ ������ �о�´�. 
	//4. System.out  		: �ֿܼ� ��� 

//�Ϸ�ð� : 6:20�б��� throws�� ó�� . 


public class EX06_ConsoleInputOutPutObject {
	public static void main(String[] args) throws IOException  {
		
		//1. �ֿܼ��� �ѱ��� ��ǲ �޴´�. (System.in)  <== byte[] �迭�� �����ؼ� ó�� : �ѱ��� ó�� 
		InputStream is = System.in;    //new�� �������� �ʰ� ���Ḹ ����, �ֿܼ��� ��ǲ ���� �޴´�. 
		
		System.out.println("�ѱ��� �Է� �ϼ��� >>>");
		
		byte[]	byteArray1 = new byte[100]; 
		int count1 = is.read(byteArray1);     // byteArray1 �� byte�� \r\n  , count1 �迭�� ���� ���� ����, 
		// int data = is.read(); //�ѱ��� ó������ ���Ѵ�. , data���� 1byte read�� ���� ����.  
			
		//2. ��ǲ ���� �ѱ��� ���Ͽ� �����Ѵ�. (FileOutputStream)
		File f1 = new File("src\\Chap19\\EX06\\input.txt"); 
		OutputStream fos = new FileOutputStream(f1);   // ���� ����. 
		
		fos.write(byteArray1);	//���� (RAM)���� ������. 
		fos.flush(); 			//������ ���� ������ ���Ͽ� ����. 
		
				
		//3. ����� ���� ���� ���� �о� �´�. (FileInputStream)
		InputStream fis = new FileInputStream(f1); // read() : �ѱ��� ó�� ���Ѵ�. read(byte[]) : �ѱ� ó��. 
		byte[] byteArray2 = new byte[100];
		
		int count2 = fis.read(byteArray2); //read(byte[]) : �ѱ�ó�� 
		//int data2 = fis.read();          //read() :  1byte �� �о� �´�. 
		
		
		System.out.println();
		System.out.println("���Ͽ��� ���� ������ �ֿܼ� ��� �մϴ�. >>>>" );
				System.out.println();
	
		//4. �о�� �迭�� �ֿܼ� ��� �Ѵ�. (System.out)
		OutputStream os = System.out;        // �ֿܼ� ��� : byte[] 
		
		os.write(byteArray2);
		os.flush();
		
		
		is.close();
		fos.close();
		fis.close();
		os.close();
		
		
		
		
		
		
		
		
		
		

	}

}
