package Chap19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
	Reader / Writer : char ���� �����. ���ڸ� ó���ϵ���  Ưȭ�� �߻� Ŭ����
		���ڵ��� �Ű��� �� �ᵵ �ȴ�.
		byte : 1 byte
		char:2byte,UTf-16(�����ڵ�)�� ó��, ���� 2byte �ѱ�2byte ,��������, ������ ��� �� ó��
		
		FileReader : charset �����ɼ��� ����. default charset ��� 
		FileWriter : charset �����ɼ��� ����. default charset ���

	 */
public class File_Reader_Writer {

	public static void main(String[] args) {
		
		// 1. ���� ��ü ����
		File rwfile = new File("src\\Chap19\\Ex08\\BufferedFild.txt");
		
		try (Writer writer = new FileWriter(rwfile);){ //Writer : �߻�Ŭ����, FileWriter : Writer�� ������ �ڽ� Ŭ����
			//OutputStream : byte ���� ���, �߻�Ŭ����, FileOuputStream ,���� ,������ mp3, jp ... ���ó��
			//writer	   : char ���� ���, �߻�Ŭ����, fileWriter, ���� Ưȭ�ؼ� ó��
			
			writer.write("�ȳ��ϼ���\n".toCharArray()); //String ==> Char �迭�� ����.
			writer.write("hell");
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("�ݰ����ϴ�",2,3);
			writer.flush();
			
		} catch (IOException e) {}
		
		
		//2. FileReader�� �̿��� �����б�(Default Ms949) <===CharacterSet ���� �ɼ��� ����.)
		
		try (Reader reader = new FileReader(rwfile);){
			
			int data;
			while ((data = reader.read())!=-1) {
				System.out.print((char)data);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
