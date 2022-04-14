package Chap19.Ex08;

import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/*
 * Reader / Writer : �߻�Ŭ���� , char �� ó�� , ����(o) �̹���(x) mp3(x) >���ڿ� Ưȭ
 * FileReader / FileWriter : �ϼ��� Ŭ���� Default charset
 *  
 * InputStreamReader/OutputStreamWriter : ���� �� ���ڵ� �����ؼ� �б�,���� ���� (ms949,utf-8)
 * 
 * ���� : System.in : �ֿܼ��� �Է� ,System.out : �ֿܼ� ��� <==Application���� �ѹ� close()�Ǹ� ���� �Ұ�.
 * 		System.in/System.out <=====byte �б�,����
 * 
 * */

public class OutputStreamWriter_2 {

	public static void main(String[] args) {
	
	//�ܼ���� (default ms 949)	
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "MS949");
			
			osw.write("OuputStreamWriter1 ���� �����Դϴ��� \n".toCharArray());  //String�� char �迭�� ����.
			osw.write("�ѱ۰� ������ ��� ���ԵǾ��ֽ��ϴ�"); //String
			osw.write('\n'); //char ����
			osw.write("Good Bye!!!!\n\n");
			osw.flush(); //���ۿ� ����� ���� �ֿܼ� ���
			
		} catch (Exception e) {}
		
		
		
	//�ܼ���� (default utf-8)	
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
			
			osw.write("OuputStreamWriter1 ���� �����Դϴ��� \n".toCharArray());  //String�� char �迭�� ����.
			osw.write("�ѱ۰� ������ ��� ���ԵǾ��ֽ��ϴ�"); //String
			osw.write('\n'); //char ����
			osw.write("Good Bye!!!!\n\n");
			osw.flush(); //���ۿ� ����� ���� �ֿܼ� ���
			
		} catch (Exception e) {}
		
	}

}
