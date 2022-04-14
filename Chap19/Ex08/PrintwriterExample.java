package Chap19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//PrintWriter : �ڵ� flush() ����� ������ �����־ Ȱ��ȭ ���Ѿ��Ѵ�.
//close()�� ȣ��ɶ� flush()�� ȣ��ǰ� ���� close�ȴ�.
public class PrintwriterExample {

	public static void main(String[] args) {

		//1. ���� ��ü ����.
		File pw1 = new File("src\\Chap19\\Ex08\\pw1.txt");
		File pw2 = new File("src\\Chap19\\Ex08\\pw2.txt");
		File pw3 = new File("src\\Chap19\\Ex08\\pw3.txt");
		
		//2. Printwirter(File file)
		try (PrintWriter pw = new PrintWriter(pw1);){
			
			pw.println("PrintWriter ����#1");
			pw.println(13);
			pw.println(5.8);
			pw.print("�ȳ��ϼ���.");
			pw.println("�ݰ����ϴ�");
			pw.printf("%d","%S",7,"�ȳ�").printf("%S","%f","����",3.7);//%d�� ������ %s�� ���ڿ�! 
			
		} catch (Exception e) {
		}
		
		//3. PrintWriter(Outpustream os)
		try(PrintWriter pw = new PrintWriter(new FileOutputStream(pw2));) {
			
			pw.println("PrintWriter ����#1");
			pw.println(13);
			pw.println(5.8);
			pw.print("�ȳ��ϼ���.");
			pw.println("�ݰ����ϴ�");
			pw.printf("%s %f", "�ȳ�",5.8);//%d�� ������ %s�� ���ڿ�! 
			
			
		} catch (Exception e) {
		}
		
		//4. �ܼ� ���
		PrintWriter pw = new PrintWriter(System.out,true); //
			pw.println("PrintWriter ����#1");
			pw.println(13);
			pw.println(5.8);
			pw.print("�ȳ��ϼ���.");
			pw.println("�ݰ����ϴ�");
			pw.printf("%s %f", "�ȳ�",5.8).printf("%s %f", "�ȳ�",5.8);//%d�� ������ %s�� ���ڿ�! 
			
			//pw.close();
			
	
		
		
		
	}

}
