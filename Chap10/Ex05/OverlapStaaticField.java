package Chap10.Ex05;

class AAA{
	static int m=3;		//Static �ʵ�� �������̵� �����ʴ´�.
}

class BBB extends AAA{
	static int m=4;
}

public class OverlapStaaticField {
	public static void main(String[] args) {
		//1.��ü���� ���� ȣ�� ���� (Ŭ���������� ȣ��)		< === �������
		System.out.println(AAA.m);
		System.out.println(BBB.m);
		
		//2. ��ü �����Ŀ��� ȣ���̰���
		AAA aaa=new AAA();
		BBB bbb=new BBB();
		AAA abb=new BBB();
		System.out.println("-=================");
		System.out.println(aaa.m); //3
		System.out.println(bbb.m); //4
		System.out.println(abb.m); //3 static �ʵ� : �������̵� �ȵȴ�.
	}

}