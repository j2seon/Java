package Chap19.Ex06;

import java.io.IOException;
import java.io.InputStream;

public class ConsoleInputStream1_1 {

	public static void main(String[] args) throws IOException {
		InputStream is1 = System.in;	//is1�� �ֿܼ��� ��ǲ�޾Ƽ� ó���ϴ� ��ü
		
		System.out.println("������ �Է��ϼ���. >>>");
		
		int data;
		
		while((data=is1.read())!=-1 ) {  //1 byte �о int data ������ �Ҵ�.
			System.out.print((char)data);
		}									//-1�ϸ� ���� ����! 
		System.out.println(data);			//13 <==\n
		System.out.println(is1.read());		//���̻� read�� ����.
		
	}

}
