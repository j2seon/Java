package Chap19.Ex08;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class eeee {

	public static void main(String[] args) {
		
		File isr =new File("src\\Chap19\\Ex08\\isr.txt"); //현재isr.txt UTF-8로 저장되어있다.
		
		try (Writer w = new FileWriter(isr);){
			
			w.write(3);
		} catch (IOException e) {
		}
		
		
		
		
		
		
	}

}
