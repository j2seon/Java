package Chap16.Ex06;

//GenericPrinter에 사용될 객체 [재료]


public class Plastic {

	public void doPrinting() {
		System.out.println("플라스틱재료로 출력합니다.");
	}
	@Override
	public String toString() {
		return "재료는 플라스틱입니다";
	}
}
