package Chap14.Ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {

	public static void main(String[] args) {
		//1. 수동 리소스 해제(기존프로그램이 사용)
		System.out.println("문자를 입력하세요!");
		
		//자동메모리 해제
		try(InputStreamReader isr1= new InputStreamReader(System.in);){
			char input =(char)isr1.read();
			System.out.println("입력글자 = " + input);
		}catch(IOException e) {
			e.printStackTrace();
		}//finally블락을 생략하더라도 객체를 자동으로 .close()
		
		
		
		
		InputStreamReader isr2 = null;  //사용 후 반드시 메모리 해제 필요
		//System.in : 콘솔에서 입력을 받도록하자!(한번만 인풋을 받을 수 있다 / 객체가 종료되면 두번 인풋을 못받는다.)
		try {
		isr2= new InputStreamReader(System.in);
		char input = (char) isr2.read(); //일반예외(checked 예외):IOException : 입력출시 예외
		System.out.println("입력글자 = "+ input);
		
		}catch (IOException e) {
			e.printStackTrace();//try 블락에서 예외가 발생될 경우 자세한 정보를 출력해라
		}finally { //객체를 사용 후 메모리 영역에서 삭제 시킴
			//리소스 해제 : isr2.close()
			if(isr2!=null) {
				try {
					isr2.close(); //일반예외 :IOException
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
			}
		}
		//2. 자동 리소스 해체(java 1.7자동으로 리소스를 해제)
			//1. 사용하는 객체가 AutoCloseable 인터페이스를 구현한 객체여야한다.
			//2. 반드시 객체에 close()가 반드시 존재해야한다.
			//위의 두가지 조건을 만족할때 자동 리소스 해제
			//try(자동으로 리소스를 헤제할 객체 선언){} catch{} finally{}
		
		
			//InputStreamReader는 autoCloseable 인터페이스를 구현하고 있다. close() 가지고 있다.
			//try with Resource : try(with resource: 객체 메모리 로드){리소스정보}
			try(InputStreamReader isr1= new InputStreamReader(System.in);){
				char input =(char)isr1.read();
				System.out.println("입력글자 = " + input);
			}catch(IOException e) {
				e.printStackTrace();
			}//finally블락을 생략하더라도 객체를 자동으로 .close()
	}

}
