package Chap19.Ex07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


//InputStream : ��ݽ�Ʈ��.
	//int ==>5555(����) ===> 555(����) ==> int
//DataInputStream : �߰������ �����ϴ� ��Ʈ���� ��� ��Ʈ���� �ݵ�� ���� �ܵ����� ����� �� ����.
	//�پ��� ������ �����͸� ������ ������ �� ����Ѵ�.
	//int ==> int, double ==>double �� ������!

public class DataInputStream_1 {

	public static void main(String[] args) {
		//���� ����
		File datafile = new File("src\\Chap19\\Ex07\\file1.data"); //Ȯ���� ����: 
		
		//������ ���� (DataOutPutSteam) 
		try (OutputStream os = new FileOutputStream(datafile); 
			 DataOutputStream dos = new DataOutputStream(os);){
			
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("�ȳ��ϼ���");
			dos.flush();
			
			
		} catch (Exception e) {  //���� �ֻ����� exception ��� ������ �ֻ��� Ŭ����! 
			//������ �б�(DataInputStream)
		}
			
			try (InputStream is1 = new FileInputStream(datafile);
				DataInputStream dis = new DataInputStream(is1);
					){
				System.out.println(dis.readInt());
				System.out.println(dis.readDouble());
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
			} catch (Exception e1) {
			}
			
			
			
			

	}

}
