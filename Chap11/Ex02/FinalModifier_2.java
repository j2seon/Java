package Chap11.Ex02;

//final �޼ҵ�� final class�� Ư¡
  /*final�ż��� : �������̵��� �Ұ� : ���� �߿��� �޼���� �ڽĿ��� ���������� ���ϵ��� ����
   * - �ڽ�Ŭ������ �θ�Ŭ������ �������ؼ� ����ϸ� �θ�Ŭ������ ����� �������Եȴ�. ���� ���� �߿��� �޼ҵ�� �������� ���ϰ� �Ѵ�.
   *  final Ŭ���� : ����� �Ұ��� Ŭ����
   */

class A {
	void abc() {}
	final void bcd() {} //final�� �Ҵ�� �޼ҵ�� �ڽ�Ŭ�������� �������̵� �� �� ����
}
class B extends A {
	void abc() {} 		//�޼ҵ� �������̵� �� : �θ��� �޼ҵ� ����� �ڽĿ��� ���Ӱ� ��� ���� ����
	//void bcd() {}		//�޼ҵ� �������̵� �Ұ���.
}
final class C{}  	//final class�� ����� �Ұ��� Ŭ���� 

//class D extends C{}

public class FinalModifier_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
