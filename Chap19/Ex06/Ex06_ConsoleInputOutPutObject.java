package Chap19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

//�ֿܼ��� �ѱ��� ��ǲ���� ���� input.txt�� ���� �� ,
//input.txt���Ͽ��� ���� �о �ֿܼ� ���(System.out)�� �̿��ؼ� �ֿܼ� ���.
//��ü�� 4���� �������Ѵ�.
 	//		1.System.in : �ֿܼ��� ��ǲ 
	// 		2.fileOutputStream : ��ǲ���� ���� ���Ͽ� ����
	//		3. fileinputStream : ����� ������ ������ �о�´�.
	//		4. System.out : �ֿܼ� ���


public class Ex06_ConsoleInputOutPutObject {

	public static void main(String[] args) throws IOException {
		//1.�ֿܼ��� �ѱ��� ��ǲ�޴´�. < byte[]�迭�� �����ؼ� ó�� : �ѱ��� ó��
		InputStream is1 =System.in;   //new�� �������� �ʰ� ���Ḹ ����, �ֿܼ��� ��ǲ���� �޴´�.
		System.out.println("�ѱ��� �Է��ϼ���");
		byte[] b1 =new byte[100];
		int count1=is1.read(b1); //b1�� byte�� \r\n ,count1 �迭�� ���� ���� ����!.
		//int data = re.read() �ѱ�ó���� ���Ѵ�. data���� 1bye
//		String str1 = new String(b1,0,count1,Charset.defaultCharset());
		
		// ���Ͽ� �ش� ���� ���� 
		File outFile = new File("src/Chap19/Ex06/input.txt");
		FileOutputStream os = new FileOutputStream(outFile); //�����
		os.write(b1);		//����(Ram)���� ������.
		os.flush();//���ۿ� ���γ����� ���Ͽ� ����
		
		//����� ���� ���� ���� �б�
		InputStream fis =new FileInputStream(outFile);
		
		byte[] b2= new byte[100];
	
		int count2=fis.read(b2);
		
		
		//�ֿܼ� ����ϱ�
		OutputStream os2 =System.out;
		os.write(b2);
		os.flush();
		
		is1.close();
		os.close();
		os2.close();
		fis.close();
		
		
		
		
		
		
		
		
		
		
	}

}
