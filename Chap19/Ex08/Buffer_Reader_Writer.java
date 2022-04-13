package Chap19.Ex08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Buffer_Reader_Writer {

	public static void main(String[] args) {
		
		
		//1.���� ��ü ���� 
		File rwfile = new File("src\\Chap19\\Ex08\\BufferedFile.txt");

		
		//2. FileWriter�� �̿��� ���Ͼ��� (Ms949 ���)
		
		try (Writer writer = new FileWriter(rwfile);
				BufferedWriter bw= new BufferedWriter(writer);
				){
			bw.write("안녕".toCharArray()); //String ==> Char �迭�� ����.
			bw.write("hell");
			bw.write('A');
			bw.write('\r');
			bw.write('\n');
			bw.write("안녀여여영",2,3);
			bw.flush();
			
		} catch (IOException e) {}
		
		//3. FileReader�� �̿��� ���� �б� (MS-949���)
		try (Reader reader =new FileReader(rwfile);
			BufferedReader br = new BufferedReader(reader);){
			
			//BufferedReader�� �߰��� �޼ҵ� : String readLine(),������ �� : null, �� ���ξ� �д´�. 
			//int read() : �� ����Ʈ�� �д´�. ������ ��,-1 
			
			String data;
			while((data =br.readLine())!=null) {
				System.out.println(data);
			}
		} catch (Exception e) {}
		
		
	}

}
