package Chap19.Ex07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class PrintStream_2 {

	public static void main(String[] args) {

		
		File outfile1 = new File("src\\Chap19\\Ex07\\PrintStream_3.txt");
		File outfile2 = new File("src\\Chap19\\Ex07\\PrintStream_4.txt");
		/*
		try (PrintStream ps =new PrintStream(outfile1);
				){
			ps.println(5.8);					//<=출력 후 라인개행
			ps.print(3+"안녕"+12345+"\n");		//<==출력 후 라인 개행 x 
			ps.printf("%d 이 호출되었습니다.",7);	// "%d" : int 값을 호출 	
			ps.printf("%s %f", "안녕",5.8);		// %s : "String 호출,%f : double 호출
				
		} catch (Exception e) {
		}*/
		try(InputStream is = new FileInputStream(outfile1);){
			int count ;
			byte[] by1 =new byte[100];
			count = is.read(by1);
			System.out.println(new String(by1,0,count, "Utf-8"));
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
