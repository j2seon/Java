package Chap10.Ex04;

//�޼ҵ� �����ε� : ������ �޼ҵ� �̸����� (�Ű����� Ÿ��, �Ű����� ���� ���� �ش� �޼ҵ尡 ȣ��)
/*��Ӱ��� ���� ����. �����ڿ��� ���� ����Ѵ�.
 * 
 * �޼ҵ� �������̵� : �ݵ�� ��Ӱ��迡�� ���.
 * �θ��� �޼ҵ带 �ڽĿ��� ���Ӱ� �����ؼ� ���.
 * 1.��Ӱ��� 2. �޼ҵ��� �ñ״��İ� ���ƾ��Ѵ�(�޼ҵ��, �Ű����� ���� �Ű����� Ÿ��)
 * �ڽĿ��� �θ��� ���������ڰ� ���ų� �� ���� ���������Ѵ�.	*/


class Ab{
	void print1() {
		System.out.println("AbŬ������ print1()");
	}
	void print2() {
		System.out.println("AbŬ������ print2()"); 
	}
}
class Bc extends Ab{
	@Override
	void print1() {
		System.out.println("BcŬ������ print1");
	}
	void print2(int a) { //�����ε�
		System.out.println("BcŬ������ print2");
	}
}
public class Overloading_vs_Overriding {

	public static void main(String[] args) {
		// 1. AbŸ�� ���� 
		Ab aa = new Ab(); 
		aa.print1(); // AbŬ������ print1 ȣ�� 
		aa.print2(); // AbŬ������ print2 ȣ��
		System.out.println("================");
		
		//2. Bc Ÿ�� ����, ������ ȣ�� Bc
		Bc bb=new Bc();
		bb.print1(); //BcŬ������ print1()
		bb.print2(); //AbŬ������ print2()ȣ�� : �θ�Ŭ������ �޼ҵ� ȣ��
		bb.print2(3);//BcŬ������ print2(3) ȣ��: �ڽ�Ŭ������ �޼ҵ� �Ǥ���
		System.out.println("================");

		//3. AbŸ������ ���� + Bc Ÿ�� ������ ȣ��
		Ab cc= new Bc();
		cc.print1(); // �޼ҵ� �������̵��� �Ǿ� �����Ƿ� ���� ���ε��� ���ؼ� Bc�� print1 ȣ��
		cc.print2(); // AbŬ������ �޼ҵ常 ȣ���� ����
		
		
		
		
		
	}

}
