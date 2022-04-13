package Chap19.Ex07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

//Printstream : filter Stream(추가기능을 제공하는 stream, 기반스트림이 필요.)
		//다양한 방법으로 출력에 특화된 스트림이다. flush()를 호출하지 않아도 자동으로 flush()
		//println(),print(), printf()

public class PrintStream_1 {
	public static void main(String[] args) {
		//1. File 객체 생성
		File outfile1 = new File("src\\Chap19\\Ex07\\PrintStream_1.txt");
		File outfile2 = new File("src\\Chap19\\Ex07\\PrintStream_2.txt");

		
		//2. ptrintStream(FileOutputStream(File))
		
		try (OutputStream os1 = new FileOutputStream(outfile1);
			 PrintStream ps = new PrintStream(os1);){		//Filter 스트림(추가 기능을 제공), 기반 스트림이 필요하다.
			ps.println(5.8);					//<=출력 후 라인개행
			ps.print(3+"안녕"+12345+"\n");		//<==출력 후 라인 개행 x 
			ps.printf("%d 이 호출되었습니다.",7);	// "%d" : int 값을 호출 	
			ps.printf("%s %f", "안녕",5.8);		// %s : "String 호출,%f : double 호출
			
			//ps.flush() <== 자동으로 호출
			} catch (Exception e) {}
		
		
		try (PrintStream ps =new PrintStream(outfile2);){
			ps.println(5.8);					//<=출력 후 라인개행
			ps.print(3+"안녕"+12345+"\n");		//<==출력 후 라인 개행 x 
			ps.printf("%d 이 호출되었습니다.",7);	// "%d" : int 값을 호출 	
			ps.printf("%s %f", "안녕",5.8);		// %s : "String 호출,%f : double 호출
		} catch (FileNotFoundException e) {}
		
		
		//4. PrintStream ps  = System.out; <==콘솔에 출력
		try(
			OutputStream os2 =System.out;
			PrintStream ps = new PrintStream(os2);){
			ps.println(5.8);					//<=출력 후 라인개행
			ps.print(3+"안녕"+12345+"\n");		//<==출력 후 라인 개행 x 
			ps.printf("%d 이 호출되었습니다.",7);	// "%d" : int 값을 호출 	
			ps.printf("%s %f", "안녕",5.8);
		}catch (Exception e) {}
		
		
		
		
	}

}
