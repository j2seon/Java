package Chap12.Ex04;

//�������̽� ��� �� �ڽ�Ŭ���� ���������� ����  <<�߿�>>
	//�������̽��� �޼ҵ带 ���� �ҋ� �ݵ�� public�� ����ؾ��Ѵ�.
interface A{
	public abstract void abc();
}
class F implements A{  //FŬ������ �ϼ��� �޼ҵ尡 �����Ǿ� �־����. //�̿ϼ��Ȱ� �ϼ����Ѿ��Ѵ�.

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	} 
	
}

interface B{
	void abc(); //Public abstract�� �����Ǿ�����.
}
class C implements A{
	public void abc() {	 //A�������̽��� abc()�� �������̵� �ؼ� ������ �޼ҵ� 
					 // �ڽ��� �θ𺸴� ���������ڰ� ũ�ų� ���ƾ��Ѵ�.
	}
}
class D implements B{
	public void abc() { //�������̽��� �޼ҵ带 �����ҋ��� �ݵ�� public ���������ڸ� ����ؾ��Ѵ�.
		
	}
}

class E implements B{
	@Override
	public void abc() {
		
	}
}

public class Interface_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


