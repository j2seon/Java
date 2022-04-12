package Chap10.Ex04;

import java.lang.reflect.Array;
import java.util.Arrays;

class Animal2{
	void run() {}	
}
class Tiger extends Animal2{
	@Override
	void run() {
		System.out.println("ȣ���̴� �׹߷� �޸��ϴ�.");
	}
	void tigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}

class Egle extends Animal2 { //�������� �ϴ��� ���ϴ�.
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	void EgleEat() {
		System.out.println("�������� �ٸ� ���� ��ƸԽ��ϴ�.");
	}
}
class Snake extends Animal2{ //���� ���ٴմϴ�.
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�.");
	}
}

public class MethodOverriding_2 {
	
	public static void main(String[] args) {
		//1. ��� ��ü�� Animal2Ÿ������ ��ĳ�����ؼ� ����
		//2. Animal2 �迭�� �� ��ü�� ����.
		//3. for ������ �迭�� ��ü�� ��� .run
		//4. ���� for ���� ����ؼ� ��ü�� run ()�żҵ� ���
		//5. �ٿ� ĳ���� (intstansof)���
	
		Animal2 aa= new Tiger();
		Animal2 bb= new Egle();
		Animal2 cc= new Snake();
		//�� ��ü ��ĳ���� ����
		
		Animal2[] ani= {aa,bb,cc};
		//Animal2��� ������Ÿ�Կ� ani��� ������ ���� �迭�� ��ü�� ����.
	
		
		for(int i=0; i<ani.length; i++) {
			ani[i].run();
		}
		// for������ ani�迭�� �޼ҵ��� run���� ����Ѵ�.
		
		for(Animal2 a: ani) {
			a.run();
		}
		//���� for���� Animal2��� ������Ÿ���� ���� ���� a�� ani�迭�� �����ϰ� a�迭�� ���� ������ �޼ҵ� run ���
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
