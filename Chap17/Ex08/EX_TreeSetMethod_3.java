package Chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

import Chap06_07.Ex02.A;

//�̸��� ���̸� �Է½� �̸��� ������������ ����ϵ��� �����Ѵ�.
//1.Comparable<E>�� comparTo()�޼ҵ� ������
	//������ ��ü ���� �ʿ�
//2. Comparator compare
	//������ ��ü�� ���� ���� ����

class Abc{
	String name; 	//<���� �ķ�. �����ٶ�....��, �̸� 3�� �ֱ�
				// ȫ�浿, �̼���, ������ ===> ������, �̼���, ȫ�浿
	int age;		//����
	Abc(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return name+ " ";
	}
}

class Abc_T implements Comparable<Abc_T>{
	String name;
	int age;
	public Abc_T(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Abc_T o) {
		return(this.name.compareTo(o.name));

	}
	
	
}


public class EX_TreeSetMethod_3 {

	public static void main(String[] args) {
		TreeSet<Abc_T> treeset1= new TreeSet<>();
		
		Abc_T a1= new Abc_T("ȫ�浿", 20);
		Abc_T a2= new Abc_T("�̼���", 30);
		Abc_T a3= new Abc_T("������", 40);
		
		treeset1.add(a1);
		treeset1.add(a2);
		treeset1.add(a3);
		System.out.println(treeset1);
		
		TreeSet<Abc> treeset2= new TreeSet<>(new Comparator<Abc>() {

			@Override
			public int compare(Abc o1, Abc o2) {
				return(o1.name.compareTo(o2.name));

			}
		});
		Abc abc1 = new Abc("ȫ�浿", 20);
		Abc abc2 = new Abc("�̼���", 30);
		Abc abc3 = new Abc("������", 40);
		
		treeset2.add(abc1);
		treeset2.add(abc2);
		treeset2.add(abc3);
		System.out.println(treeset2);
	}
}
