package Chap16.Ex07;

//���ʸ� �޼ҵ� ���ο��� ��� ������ �޼ҵ� : ObjectŬ������ �޼ҵ常 ��� �����ϴ�.

class A{
	public <T> void method (T t) {
		//System.out.println(t.length());  		//t,length() :String Ŭ�������� ���ڼ��� ���� ���� //��� �Ұ�
		System.out.println(t.equals("�ȳ�"));  	//t.equals�� ObjectŬ������ �޼ҵ�� ��밡��
	}
	public <T extends Object> void method2(T t){	//<T extends Object>�� �����Ǿ��ִ�
		System.out.println(t.equals("�ݰ����ϴ�."));   //ObjectŬ������ �޼ҵ常 ��밡���ϴ�. � Ÿ���� ������ �𸣱⶧���� Object�� �޼ҵ带 ���ذ�!!!!
	//	System.out.println(t.); Ȯ���غ��� Object ���� ����!
	}
	public <T extends String> void method3(T t) {
		System.out.println(t.length()); 
		//System.out.println(t.); �̰� Strnig!!
	}
}


public class AvailableInGenericMethod {
	
	public static void main(String[] args) {
		A a =new A();
		a.<String>method("�ȳ�"); 
		a.<String>method2("dndd");
		a.<String> method3("������");
	}

}
