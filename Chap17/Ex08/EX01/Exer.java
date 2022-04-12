package Chap17.Ex08.EX01;

import java.util.Comparator;
import java.util.TreeSet;

class MyClass{
	String name;
	int age;
	public MyClass(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name+ " ";
	}
}

class Myclasscom implements Comparable<Myclasscom>{
	String name;
	int age;
	public Myclasscom(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Myclasscom o) {
		return(this.name.compareTo(o.name));
	}
	@Override
	public String toString() {
		return name+ " ";
	}
}


public class Exer {

	public static void main(String[] args) {
		
		TreeSet<Myclasscom> tree1= new TreeSet();
		
		Myclasscom m1 = new Myclasscom("김유빈", 30);
		Myclasscom m2 = new Myclasscom("주진선", 20);
		Myclasscom m3 = new Myclasscom("이하은", 10);
		
		tree1.add(m3);tree1.add(m2);tree1.add(m1);
		System.out.println(tree1);
		
		TreeSet<MyClass> tree2 = new TreeSet<>(new Comparator<MyClass>() {

			@Override
			public int compare(MyClass o1, MyClass o2) {
				
				return o1.name.compareTo(o2.name);
			}
		});
		MyClass mm1 = new MyClass("노경화", 50);
		MyClass mm2 = new MyClass("주진기", 20);
		MyClass mm3 = new MyClass("주정도", 60);
		
		tree2.add(mm3);tree2.add(mm1);tree2.add(mm2);
		System.out.println(tree2);
	}

}
