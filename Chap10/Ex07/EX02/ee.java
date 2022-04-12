package Chap10.Ex07.EX02;

import java.io.IOException;
import java.io.InputStreamReader;

public class ee {
	public static void main(String[] args) {
		try (InputStreamReader a =new InputStreamReader(System.in)){
			char ii= (char)a.read();
			System.out.println("ii ; " + ii);
		} catch (IOException e) {
			System.out.println("¿À·ù");
		}
	
	
	}
}