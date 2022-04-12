package Chap19.Ex01;

public class System_getProperty {

	public static void main(String[] args) {
		// System.getProperty() 메소드의 유용한 정보들.
		System.out.println(System.getProperty("user.dir")); //현재 작업 디렉토리를 출력
		System.out.println(System.getProperty("java.version")); //JAVA버전
		System.out.println(System.getProperty("java.vendor")); 
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.home"));  //java설치 홈폴더
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("java.class.version"));
		System.out.println("user.name");	//로그온한 계정
		System.out.println("user.home");	//홈폴더
		System.out.println("os.name");		//os정보
		System.out.println("os.arch");		//os 아키텍쳐
		System.out.println("os.version");	
		System.out.println("file.separator"); 	//파일구분자
		System.out.println("path.separator");	
		System.out.println("line.separator");
	}

}
