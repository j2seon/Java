package Chap16.Ex07;

class AA{
	public <T> T meth1(T t) {
		return t;
	}
	public <T> String meth2(T t1, T t2) {
		return "t1:"+t1+", "+t2;
	}
	public <K,V> void meth3(K k, V v) {
		System.out.println(k+", "+v);
	}
	public<K,V> void meth4() {
		System.out.println("�Ű����� ����");
	}
}



public class Exer {

	public static void main(String[] args) {
		AA a= new AA();
		String str=a.<String>meth1("�������");
		System.out.println(str);
	
		String str11=a.<Integer>meth2(11,22);

		a.<String,Integer>meth3("�ȳ�",2022);
		a.meth4();
	}
	
}
