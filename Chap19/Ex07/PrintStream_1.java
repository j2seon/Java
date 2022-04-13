package Chap19.Ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//Printstream : filter Stream(�߰������ �����ϴ� stream, ��ݽ�Ʈ���� �ʿ�.)
		//�پ��� ������� ��¿� Ưȭ�� ��Ʈ���̴�. flush()�� ȣ������ �ʾƵ� �ڵ����� flush()
		//println(),print(), printf()

public class PrintStream_1 {
	public static void main(String[] args) {
		//1. File ��ü ����
		File outfile1 = new File("src\\Chap19\\Ex07\\PrintStream_1.txt");
		File outfile2 = new File("src\\Chap19\\Ex07\\PrintStream_2.txt");

		
		//2. ptrintStream(FileOutputStream(File))
		
		try (OutputStream os1 = new FileOutputStream(outfile1);
			 PrintStream ps = new PrintStream(os1);){		//Filter ��Ʈ��(�߰� ����� ����), ��� ��Ʈ���� �ʿ��ϴ�.
			ps.println(5.8);					//<=��� �� ���ΰ���
			ps.print(3+"�ȳ�"+12345+"\n");		//<==��� �� ���� ���� x 
			ps.printf("%d �� ȣ��Ǿ����ϴ�.",7);	// "%d" : int ���� ȣ�� 	
			ps.printf("%s %f", "�ȳ�",5.8);		// %s : "String ȣ��,%f : double ȣ��
			
			//ps.flush() <== �ڵ����� ȣ��
			} catch (Exception e) {}
		
		
		try (PrintStream ps =new PrintStream(outfile2);){
			ps.println(5.8);					//<=��� �� ���ΰ���
			ps.print(3+"�ȳ�"+12345+"\n");		//<==��� �� ���� ���� x 
			ps.printf("%d �� ȣ��Ǿ����ϴ�.",7);	// "%d" : int ���� ȣ�� 	
			ps.printf("%s %f", "�ȳ�",5.8);		// %s : "String ȣ��,%f : double ȣ��
		} catch (FileNotFoundException e) {}
		
		
		//4. PrintStream ps  = System.out; <==�ֿܼ� ���
		try(
			OutputStream os2 =System.out;
			PrintStream ps = new PrintStream(os2);){
			ps.println(5.8);					//<=��� �� ���ΰ���
			ps.print(3+"�ȳ�"+12345+"\n");		//<==��� �� ���� ���� x 
			ps.printf("%d �� ȣ��Ǿ����ϴ�.",7);	// "%d" : int ���� ȣ�� 	
			ps.printf("%s %f", "�ȳ�",5.8);
		}catch (Exception e) {}
		
		
		
		
	}

}
