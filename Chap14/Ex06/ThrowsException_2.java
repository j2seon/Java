package Chap14.Ex06;

//�Ϲ� ����(checked Exception) : ������ �ܰ迡�� ����, 
	//1. ����ó���ϴ� ��� 
	//2. throws�� ���� (�̷��.)

	//main �޼ҵ忡 throw�� ���� ��Ű�� ��� , ������ ������ְ� ����
public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException{

		//���������� ������ �����մϴ�. ClassNotFoundException�� �߻����� ����.
		Class cls = Class.forName("java.lang.Object");
		
		//���������� ������ �������� �ʴ´�. ClassNotFoundException�� �߻�.   
		//Class cls2 = Class.forName("java.lang.Object00");
		
	}

}
