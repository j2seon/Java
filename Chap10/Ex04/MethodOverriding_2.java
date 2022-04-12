package Chap10.Ex04;

import java.lang.reflect.Array;
import java.util.Arrays;

class Animal2{
	void run() {}	
}
class Tiger extends Animal2{
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void tigerEat() {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}

class Egle extends Animal2 { //독수리는 하늘을 납니다.
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void EgleEat() {
		System.out.println("독수리는 다른 새를 잡아먹습니다.");
	}
}
class Snake extends Animal2{ //뱀은 기어다닙니다.
	@Override
	void run() {
		System.out.println("뱀은 기어다닙니다.");
	}
}

public class MethodOverriding_2 {
	
	public static void main(String[] args) {
		//1. 모든 객체는 Animal2타입으로 업캐스팅해서 생성
		//2. Animal2 배열에 각 객체를 저장.
		//3. for 문으로 배열의 객체를 출력 .run
		//4. 향상된 for 문을 사용해서 각체의 run ()매소드 출력
		//5. 다운 캐스팅 (intstansof)출력
	
		Animal2 aa= new Tiger();
		Animal2 bb= new Egle();
		Animal2 cc= new Snake();
		//각 객체 업캐스팅 생성
		
		Animal2[] ani= {aa,bb,cc};
		//Animal2라는 데이터타입에 ani라는 변수를 가진 배열로 객체들 저장.
	
		
		for(int i=0; i<ani.length; i++) {
			ani[i].run();
		}
		// for문으로 ani배열의 메소드인 run들을 출력한다.
		
		for(Animal2 a: ani) {
			a.run();
		}
		//향상된 for으로 Animal2라는 데이터타입을 가진 변수 a에 ani배열을 대입하고 a배열에 속한 값들의 메소드 run 출력
		System.out.println();
		System.out.println("=================");
		
	
		if(aa instanceof Tiger) {  //
			Tiger aadown=(Tiger)aa;
			if(true) {
				aadown.tigerEat();
			}
		}
		
		
		
		
		if(bb instanceof Egle) {
			Egle bbdown=(Egle)bb;
			if(true) {
				bbdown.EgleEat();
			}
		}
		
		
	
	}

}
