package Chap19.Ex08;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		
		
		// 1. �ܼ� �Է�(MS949) : default charset, �ֿܼ��� �Է�, ����� byte��Ʈ��!
		
		try {
			InputStreamReader isr =new InputStreamReader(System.in,"Ms949");
			//InputStreamReader : ����Ʈ�� ===> char�� ��ȯ!!!!  ����Ʈ�� ������ ms949�� ��ȯ��Ű�� ��
			//System.in : �ܼ� �Է� , byte     
			//isr�� ��ȯ�� char�� ������ �ִ�.
			
			
			System.out.println("�ѱ��� ���ϴ� ��� �Է��ϼ��� >>> ");
			
			int data;
			while((data= isr.read())!='\r') { //�ܼ��Է��� �����. //enter�� ���������� 1����Ʈ�� ����
				System.out.println((char)data);
			}
			System.out.println();
			System.out.print(isr.getEncoding());
			
		} catch (Exception e) {}
		
		
		System.out.println();
		
		//2. �ܼ� �Է� (UTF-8)
		try (InputStreamReader isr2 =new InputStreamReader(System.in,"UTF-8");){
			
			
			System.out.println("�ѱ��� ���ϴ� ��� �Է��ϼ���2 >>> ");
			
			int data;
			while((data= isr2.read())!='\r') { //�ܼ��Է��� �����. //enter�� ���������� 1����Ʈ�� ����
				System.out.println((char)data);
			}
			System.out.println();
			System.out.print(isr2.getEncoding());
			
		} catch (Exception e) {}
		
		
		
		

	}

}
