package Chap06_07.Ex05;


import Chap06_07.Ex06.Bcd;
//import Chap06_07.Ex06.Abc; //Abc class�� ���������ڰ� default���� �ܺ���Ű������ ������ �� ����.

public class External_Abc extends Bcd {  //External_Abc Ŭ������ Bcd Ŭ������ ����ϰڴ�. 
			//�θ� Ŭ���� : Bcd, �ڽ�Ŭ���� : External_Abc
	public static void main(String[] args) {

		//Abc abc2=new Abc(); class ���� �����ڰ� default���� ���� �Ұ�.
		Bcd bcd1=new Bcd();
		External_Abc ext=new External_Abc();// �θ�Ŭ���� ��ü
		ext.b= 2000; //External_Abc��� '�ڽ�'Ŭ�������� Bcd'�θ�'Ŭ������ protrcted�� ����!!(��Ӱ���)

		//�ٸ���Ű������ �ʵ�ȣ�� 1.import(public:Ŭ���� �����������϶� ����)
						// 2. ��ü ����, 3. ���������� Ȯ�� �� ����(�ʵ�, �޼ҵ�)
		bcd1.a=1000; //public : �ٸ� ��Ű������ ���� ����
		//bcd1.b=2000; //protected
		
	}

}
