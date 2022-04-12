package Chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

//TreeSet�� ����: 1. �ߺ�������� �ʴ´�.(Set�� Ư¡) 2. �������� ���ĵǾ� �Է�, 3. ���ĵǾ� ���(��������), �˻���� ���
				//5. Ư�������� ���� ���� 6. asc(������������), desc(������������)

//TreeSet�� �Ϲ� ��ü�� ������ ���, Ư�� �ʵ带 ũ��� ���� �ʵ尡 �����ؾ��Ѵ�.
	//1. Comparable<E> �������̽��� compareTo()�޼ҵ� ������ : TreeSet�� �Ϲ� ��ü�� ������ �� �������ؾ��Ѵ�.
		//����Ŭ������ �����ؼ� ���.   comparable<E> �������̽��� ��� �� compareTo()�޼ҵ� ������

	//2. Comparator<E> �������̽� compare()�޼ҵ带 ������ ��. <<�͸� ���ΰ�ü�� ���.
		//������ ��ü�� �������� �ʰ� ����Ҷ�.
		//TreeSet<E> ��ä�� �����Ҷ� �����ڿ� Comparator<E>�������̽��� ������ �͸�ü�� ����.

	//3. �͸� ���ΰ�ü�� ����ؼ� ó���ϴ� ���.

class MyClass{
	int data1;
	int data2;
	public MyClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return data1+" "+data2;
	}
}


//Comparable<E> �������̽��� ������ Ŭ���� ����
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;		//<<==�ʵ带 �񱳱������� ����, CompareTo()�� ������ 
	int data2;
	public MyComparableClass(int data1, int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public int compareTo(MyComparableClass o) { //��ü�� ũ��� ������ �����ϴ� �޼ҵ�, <<TreeSet���� ���>> (����, 0, ���)
			/*									// �������� ó�� ��� ! ���������� ���ڸ� �ݴ�� �����ϸ�ȴ�.
		if(this.data1 < o.data1) { 			//this.data1 ����
			return -1; 		//this.data1 ���� ���� ���� ��� : -1(����)
		}else if(this.data1 == o.data1) {	//this.data1 ���� ���� ���� ��� : 0
			return 0;
		}else {								//this.data1 ���ذ��� Ŭ ��� : 1 (���)
			return 1;
		}*/
		if(this.data1 < o.data1) { 			//this.data1 ����
			return 1; 						//this.data1 ���� ���� ���� ��� : 1(���)
		}else if(this.data1 == o.data1) {	//this.data1 ���� ���� ���� ��� : 0
			return 0;
		}else {								//this.data1 ���ذ��� Ŭ ��� : -1 (����)
			return -1;
		}
	}
	@Override
	public String toString() {
		return data1 + "  " + data2;
	}
}


public class TreeSetMethod_2 {

	public static void main(String[] args) {
		//Wrapper Ŭ������ comparable<E> �������̽��� compareTo()�޼ҵ带 �������ϰ� �ִ�.
			//Wrapper Ŭ������ ���� treeSet�� ������ ���ĵǾ� ����ȴ�.
		
		//1. Integer Wrapper Ŭ������ ũ�� ��.
		TreeSet<Integer> treeset1 = new TreeSet<Integer>();
		Integer intvalue1 = new Integer(20); 	//ū��	
		//Integer intValue3 = 3; �� ����
		Integer intvalue2 =new Integer(10);		//���� ��
		
		treeset1.add(intvalue1); treeset1.add(intvalue2);
		System.out.println(treeset1); 		// �������� ���� ���.
		
		//2. String Wrapper Ŭ������ ũ�� ��.
		TreeSet<String> treeset2 =new TreeSet<String>();
		String str1 = new String("����"); 	//������
		//String str1="����"; �� ����
		String str2=new String("�ٶ�");		//ū��
		
		treeset2.add(str1);			//treeset2.add()�� ����ؼ� ��ü�� ������ ��� ���� ũ�⸦ ���ϴ� �ʵ尡 ���ǰ� �Ǿ��־���Ѵ�.
		treeset2.add(str2); 		//Comparable<E> �������̽��� compareTo()�޼ҵ尡 ������ �Ǿ�� �Ѵ�.
		System.out.println(treeset2);
		
		
		//3. Myclass(�Ϲ� Ŭ����)�� TreeSet�� ������ �ɱ�? ������ xxxxxxxxx (Comparable<E> �������̽��� compareTo()�޼ҵ尡 ������ �Ǿ�� TreeSet�÷��ǿ� ���尡��)
//		TreeSet<MyClass> treeset3 =new TreeSet<MyClass>();
//		MyClass myclass1 = new MyClass(2, 5);
//		MyClass myclass2 = new MyClass(3, 3);
//		
//		treeset3.add(myclass2); 	// TreeSet���� Comparable<E> �������̽��� comparTo() �޼ҵ带 �������� Ŭ������ ���� �� �ִ�.
//		treeset3.add(myclass1);		//���� �� ���� �߻� ��Ÿ�� ����
//		
//		System.out.println(treeset3);	//����� ����

		//TreeSet�� �Ϲݰ�ü�� ������ ���
		//4.��� 1. MyComparableClass ��ü ũ�� ��. :Comparable<E> �������̽��� compareTo()������
				//������ü�� ������ �ʿ�. �ٽ� ������
		TreeSet<MyComparableClass> treeset4 = new TreeSet<MyComparableClass>();
		
		MyComparableClass m1 =new MyComparableClass(2, 5);  	//TreeSet�� ����ɶ� Comparable<E> �������̽��� compareTo()������
		MyComparableClass m2 =new MyComparableClass(5, 3);
		MyComparableClass m3 =new MyComparableClass(4, 3);
		treeset4.add(m1); 
		treeset4.add(m2);
		treeset4.add(m3);
		System.out.println(treeset4);
		System.out.println("=========================");
		
		//5. ��� 2. ������ ��ü�� �������� �ʰ� TreeSet�� �����Ұ��. 
		//TreeSet ������ ���ο� comparator<E>�������̽��� �����ؼ� �͸�ü�� ����.
		TreeSet<MyClass> treeset5 =new TreeSet<>(new Comparator<MyClass>() {
			//Comparator<MyClass>�� ������ �͸� �ڽ�Ŭ���� ���
			@Override
			public int compare(MyClass o1, MyClass o2) { //������������!! data1 
				if(o1.data1<o2.data1) {
					return -1;
				}else if(o1.data1==o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		MyClass myclass1 = new MyClass(2,5);
		MyClass myclass2 = new MyClass(3,3);
		
		treeset5.add(myclass1);
		treeset5.add(myclass2);
		
		System.out.println(treeset5);
	
		}
	}


