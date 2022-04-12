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
		//1.��ǲ
		System.out.println("�ѱ��� �Է��ϼ���");
		InputStream is1 =System.in;   
		byte[] b1 =new byte[100];
		int count1=is1.read(b1);
		String str1 = new String(b1,0,count1,Charset.defaultCharset());
		
		
		
		// ���Ͽ� �ش� ���� ���� 
		File outFile = new File("src/Chap19/Ex06/input.txt");
		FileOutputStream os = new FileOutputStream(outFile,false);
		os.write(b1);
		os.flush();
		
		//����� ���� ���� ���� �б�
		byte b2[]=new byte[100];
		int count2;
		String str2=null;
		try (InputStream is2= new FileInputStream(outFile)){
			while((count2=is2.read(b2))!=-1) {
				str2= new String(b2, 0, count2, Charset.defaultCharset());
			}
		}catch (IOException e) {
			System.out.println("�����Դϴ�.");
		}
		
		//�ֿܼ� ����ϱ�
		System.out.println(str2);
		System.out.println("��°�� >> ");
		OutputStream out = System.out;
		byte[] b3 = str2.getBytes(Charset.defaultCharset());
//		out.write(b3);
		out.flush();
		is1.close();
		out.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
