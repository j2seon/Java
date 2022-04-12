package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

/*
 * System.in : Consol���� ��ǲ�� �޴� �ڹٿ��� �������ִ� ��ü , InputStream �ؿ� ����.
 * 		Windows : �ֿܼ��� Enter : \r\n
 *  	MAC : �ֿܼ��� Enter : \n
 * Sysout.out : Consol�� ����� �ϴ� ��ü 
 * 
 * 
 * */


public class ConsoleInputObject_1 {

	public static void main(String[] args) throws IOException {
		// 1.Consol���� ��ǲ �ޱ� ���� ��ü ����.
		InputStream is1 = System.in;	//is1�� �ֿܼ��� ��ǲ�޾Ƽ� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ���. >>>");
		
		int data;
		
		while((data=is1.read())!='\r' ) {  //1 byte �о int data ������ �Ҵ�.
			System.out.println("���� ������ : "+ (char)data + "��������Ʈ �� : "+ is1.available());
		}
		System.out.println(data);			//13 <==\r
		System.out.println(is1.read());		//10 <==\n
		
		System.out.println("================================================");
		while((data=is1.read())!='\r' ) {  //1 byte �о int data ������ �Ҵ�.
			System.out.println((char)data);
		}
	}

}
