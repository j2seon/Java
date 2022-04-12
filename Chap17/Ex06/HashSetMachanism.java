package Chap17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Set : �ߺ��� ���� ���� �� ����. 
	// equals() �޼ҵ�, hashCode()�޼ҵ尡 ���� �Ǿ� �־���Ѵ�.
	// String, Integer Ŭ������ equals()�޼ҵ�� hashCode()�� ������ �Ǿ��ִ�.
	// Ư�� ��ü(���� ����ų�)�� Set�� ������ ��� �ߺ������� ���� ���ϵ��� �ϱ� ���ؼ��� equals()�� hashCode() �޼ҵ带 ������ �ؾ��Ѵ�.
	//  Object Ŭ������ equals() �޼ҵ�, hashCode()�޼ҵ尡 �ִ�.
		//Object Ŭ������ equals()�� == �� ����.
		//==�� Stack �޸��� ���� ��.
 
//equals() hashCode() ������ ���� ���� ���� 
class A{
	int data; 
	public A(int data) {
		this.data=data;
	}
}
//equals()�� ������, hashCode()�� ������ ���� ���� ���� 

class B{
	int data; 		//�ΰ��� ��ü�� data �ʵ��� ���� ������, �����ϴٶ�� �ĺ��ڸ� �־�����Ѵ�.
					//equals(), hashCode() �ΰ��� �������ؾ��Ѵ�.
	public B(int data) {
		this.data=data;
	}
	@Override
	public boolean equals(Object obj) { //��ü�� �ּҸ� ���ϴ� ���� �ƴ϶� ��ü ������ Ư�� �ʵ��� ���� ���ϵ��� ����.
		if(obj instanceof B) { 	//obj�� BŸ���� ���ϰ� ���� ���� �ٿ�ĳ����
			if(this.data==((B)obj).data)		//���� : �߸� �ٿ�ĳ������ �� ���: ���ܰ� �߻���.
				return true;
		}
		return false;
	}
}
//1.equals() hashCode() ������

class C{
	int data; 		//�ΰ��� ��ü�� data �ʵ��� ���� ������, �����ϴٶ�� �ĺ��ڸ� �־�����Ѵ�.
					//equals(), hashCode() �ΰ��� �������ؾ��Ѵ�.
	public C(int data) {
		this.data=data;
	}
	@Override
	public boolean equals(Object obj) { //��ü�� �ּҸ� ���ϴ� ���� �ƴ϶� ��ü ������ Ư�� �ʵ��� ���� ���ϵ��� ����.
		if(obj instanceof C) { 	//obj�� BŸ���� ���ϰ� ���� ���� �ٿ�ĳ����
			if(this.data==((C)obj).data)		//���� : �߸� �ٿ�ĳ������ �� ���: ���ܰ� �߻���.
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {			//Objects.hash(�ʵ��, �ʵ��,�ʵ��)   <== �������� �ʵ��� �ؽ��ڵ带 ���� ������ ���ִ�.
		return Objects.hash(data);
		
		//return data;	//data�ʵ��� ���� ������  hashCode�� �����ϰ� ����.
	}
}


public class HashSetMachanism {

	public static void main(String[] args) {
		
		//1.equals() hashCode() ������ ���� ���� ���� 
		Set<A> hashset1= new HashSet<>();
		A a1 =new A(3);
		A a2 =new A(3);
		System.out.println(a1==a2);  //false
				// == : ���ø޸��� ���� ���Ѵ�. (�ּҸ� ���Ѵ�.)
		System.out.println(a1); 	//��ü���� ��� : ��Ű����.Ŭ������@���޸��ּ��� �ؽ��ڵ�(16������) / Set�� �ߺ��� ���� ���� ���Ѵ�.
		System.out.println(a2);
		
		System.out.println(a1.equals(a2)); //�����ǰ� �ȵǾ� �ִ�. false, (Object equals()�� == �� ����.)
		
		System.out.println(a1.hashCode()+","+a2.hashCode()); //10������ ǥ���Ǿ���.
		
		hashset1.add(a1); hashset1.add(a2);
		System.out.println(hashset1.size());   //2 < = equals()�� hashCode()�޼ҵ尡 ������ �Ǿ� ���� �ʴ�.
		
		//1.equals()�� ������)(��ü�� data�ʵ��� ���� ��), hashCode() ������ ���� ���� ���� 
		Set<B> hashset2 = new HashSet<>();
		B b1 =new B(3);
		B b2 =new B(3);
		
		System.out.println(b1 == b2); //Stack �޸��� ���� ��. //false
		System.out.println(b1.equals(b2)); // equals�� �������߱⶧���� true
		
		hashset2.add(b1); hashset2.add(b2);
		System.out.println(hashset2.size()); //2   //equals()�� ������, hashCode�� ���������� ����.
		System.out.println(b1.hashCode()+" , "+ b2.hashCode()); //�ٸ���!!!!
		
		
		//1.equals() hashCode() ������
		Set<C> hashset3= new HashSet<>();
		C c1 =new C(3);
		C c2 =new C(3);
		System.out.println(c1==c2)  ;		//false, ������ �ּ�
		System.out.println(c1.equals(c2)); // equals�� �������߱⶧���� true
		System.out.println(c1.hashCode()+","+c2.hashCode()); //data �ʵ带 ������� hashCode�� ����
				//�� ��ü�� ������ ��ü�̴�.
		hashset3.add(c1);
		hashset3.add(c2);
		System.out.println(hashset3.size()); //1 equals()hashCode()�� ������ �Ǿ��ִ�. data�ʵ忡 ���ؼ�.
	}

}
