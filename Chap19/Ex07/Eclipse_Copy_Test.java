package Chap19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Eclipse_Copy_Test {

	public static void main(String[] args) {
		//�������� ���� , buffered�� ������� �ʰ� ó���ϴ� ���, Buffered�� ����ϴ� ��� �ӵ�����
		
			File orgfile = new File("C:\\temp\\copy_test\\eclipse_origin.exe"); //���� ����.
			File copyfile1 = new File("C:\\temp\\copy_test\\eclipse_copy1.exe"); //buffered�� ������� �ʰ� ó���ϴ� ���
			File copyfile2 = new File("C:\\temp\\copy_test\\eclipse_copy2.exe"); //Buffered�� ����ϴ� ���  
			
			//���� ������ �ϱ� ���� ���� ����
			long start, end, time1, time2; //time1 : Buffered�� ��� x , time2 : Buffered�� ��� o
			
			//1. Buffered�� ������� �ʰ� ó���ϴ� ���(BufferedInputStream, BufferedOutStream)
			start = System.nanoTime();	//���۽ð�
			
			try (InputStream is = new FileInputStream(orgfile); //auto close()
					OutputStream os = new FileOutputStream(copyfile1);) //auto close()
			{
				//������ ���� �ڵ� ����
				int data;
				while((data=is.read())!=-1) {  //is ���� 1byte �о os���� �� ��� , -1�� ����������,
					os.write(data);
				}
				
				
			} catch (IOException e) {
				}
			end =System.nanoTime();
			time1 = end -start;
			System.out.println("Without BufferedXXXStream : "+ time1); //���۸� ������� �ʰ� ���� 
			
			//2.
			
			//buffered�� ����ϸ鼭 ó���ϴ� ��� ()
			start =System.nanoTime();
			try (InputStream is = new FileInputStream(orgfile); //��ݽ�Ʈ��
					BufferedInputStream bis =new BufferedInputStream(is); //�߰� ����� �����ϴ� ��Ʈ��. ������ ������ ó��(Buffer �����.)
					OutputStream os = new FileOutputStream(copyfile2); //��ݽ�Ʈ��
					BufferedOutputStream bos = new BufferedOutputStream(os); //�߰������ ���� (����)
					){
						//������ �ڵ� ����
						 int data ; 
						 while((data=bis.read())!=-1) { //���۸� ����ؼ� �б� 
							 bos.write(data);			//���۸� ����ؼ� ����
						 }
			} catch (IOException e) {
			}

			end =System.nanoTime();
			time2 = end -start;
			System.out.println("BufferedXXXStream : "+time2 );
			
			// ����� ��� (rime2), ������� ���� ��� (time1)�� ����
			System.out.println("Buffered�� ����� ��� �ӵ� ���� �� �� "+time1/time2);


	}
}