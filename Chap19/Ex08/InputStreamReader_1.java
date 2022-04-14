package Chap19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader : byte �����͸� char �������� ��ȯ�ϴ� ��ü. <==	���ڵ��� ������ �� �ִ�.  
	//byte ������ ���ڵ��� �� �����ؾ��Ѵ�.  <=encoding : ms949, utf
	//char �������� �ٲٸ� ���ڵ� Ÿ���� �Ű� �� �ʿ䰡 ����. 
	//��� ���� filReader : default charset�� ��� �����ؼ� InputStreamReader�� �̿��ϸ� charset�� �ٲܼ� �ִ�. ���� default charset������ �ܺ������� UTF-8�ΰ�� 
	// ��Ʈ��ũ�� ���۵Ǵ� ��Ʈ���� utf8,ms949 ==>char�� ��ȯó��


public class InputStreamReader_1 {
	public static void main(String[] args) {
		
		//1. ���� ��ü ����
		File isr =new File("src\\Chap19\\Ex08\\isr.txt"); //����isr.txt UTF-8�� ����Ǿ��ִ�.
		
		try(Reader reader  = new FileReader(isr);) {  //FileReader�� ���ڵ� ������ �ȵ�. default Encoding �� ���.
			int data;  
			while((data=reader.read())!=-1) {	//MS949
				System.out.print((char)data);
			}
		} catch (Exception e) {}
		
		System.out.println();
		System.out.println("================================================");
		
		//2. fileInputStrea + inpuStreamReader�� �̿��� ���� �б�
		//InputStreamReader(is,"UTF-8") : byte ==>Char�� ��ȯ
		
		try (InputStream is = new FileInputStream(isr);
			InputStreamReader isr1 = new InputStreamReader(is,"UTF-8");){ //isr1 : char ��ȯ�� 
			
			int data; 
			while((data=isr1.read())!=1) {
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println(isr1.getEncoding());
			
		} catch (IOException e) {
		}
		
		
		
		
	}

}
