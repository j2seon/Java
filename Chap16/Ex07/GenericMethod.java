package Chap16.Ex07;

//���ʸ� Ŭ���� : Ŭ������ �����Ҷ� Ÿ�� ������ ���� <T>, ��ü�� ������ T�� ������ Ÿ���� ����
//���ʸ� �޼ҵ� : �Ϲ�Ŭ���� ������ �޼ҵ� ���� �� ���ʸ� Ÿ�Ժ����� ���

class Genericmethod11{ //�Ϲ� Ŭ���� 
	public <T> T method1(T t) { //���ʸ� �޼ҵ� : 1��
		return t;
	}
	
	
	public <T> boolean method2(T t1, T t2) { //���ʸ� �޼ҵ� : 1��
		return t1.equals(t2); //�ΰ��� �� true, false ����
							  //�⺻�ڷ����϶��� ���� ��. �����ڷ����϶��� ��ü�� �ּҸ� ��
							  // String�� ��� ���� �� (�������̵� �Ǿ��ֱ⶧��) INteger,Double�� equals�� ������ �Ǿ�����.
	}
	public<K,V> void method3(K k,V v) { //���ʸ� �޼ҵ� : 2��
		System.out.println(k + " : "+ v);
	}
	
	public <K, V> void method4() {
		System.out.println("�Ű������� ��ǲ ������ ���� ��� ������ ����");
	}
	
	
}

public class GenericMethod {
	public static void main(String[] args) {
		//1.�Ϲ�Ŭ���� ��ü�� ���� �� ���ʸ� �޼ҵ� ȣ��
		Genericmethod11 gm =new Genericmethod11();
		String str1 = gm.<String>method1("�ȳ�");
		String str2 = gm.method1("�ȳ�");  //Ÿ���� �˼� �ִ� ��� ȣ��� ��������(�Ű������� ���� ���� ��������)
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("===========================");
		
		Integer i = gm.<Integer>method1(100);
		Integer i2=gm.<Integer>method1(200);
		System.out.println(i);
		System.out.println(i2);
		
		System.out.println("===========================");
		
		Boolean b1=gm.<Boolean>method1(true);
		Boolean b2 = gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		
		Boolean d1 =gm.<Double> method2(2.55,2.55); //���Ϲ��� Ÿ���� Boolean
		Boolean d2 =gm.<Double> method2(2.55,2.45); //���Ϲ��� Ÿ���� Boolean
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("===========================");
		
		gm.<String,Integer>method3("����", 90);
		gm.method3("����", 80); 		//�Ű������� ��ǲ�Ǵ� ������Ÿ���� ������ �� �ִ� ��� ��������

		gm.<Integer,String>method3(500, "���������Դϴ�");
		gm.method3(404, "�����Դϴ�."); 
		
		gm.method4();
	}

}
