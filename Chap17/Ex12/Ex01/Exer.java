package Chap17.Ex12.Ex01;

import java.util.Comparator;
import java.util.TreeMap;

class My{
	int data1; 
	int data2;
	public My(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return data1 +" "+ data2;
	}
}
class Mycom implements Comparable<Mycom>{
	int data1; 
	int data2;
	public Mycom(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return data1 +" "+ data2;
	}
	@Override
	public int compareTo(Mycom o) {
		if(this.data1< o.data1) {
			return -1;
		}else if(this.data1==o.data1){
			return 0;
		}else {
			return 1;
		}
	}
}



public class Exer {

	public static void main(String[] args) {

		TreeMap<Mycom, String> treemap = new TreeMap<Mycom, String>();
		
		Mycom mm1 = new Mycom(3, 3);
		Mycom mm2 = new Mycom(5, 3);
		Mycom mm3 = new Mycom(1, 3);
		
		treemap.put(mm1,"첫번");
		treemap.put(mm2,"두번");
		treemap.put(mm3,"세번");
		
		System.out.println(treemap.size());
		System.out.println(treemap);
		
		TreeMap<My, String> treemap1= new TreeMap<>(new Comparator<My>() {

			@Override
			public int compare(My o1, My o2) {
				if(o1.data1 < o2.data1) {
					return 1;
				}else if(o1.data1 == o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		My m1= new My(2, 2);
		My m2= new My(4, 2);
		My m3= new My(3, 2);
		My m4= new My(7, 2);
		
		treemap1.put(m1, "dd");
		treemap1.put(m2, "dd");
		treemap1.put(m3, "dd");
		treemap1.put(m4, "dd");
		
		System.out.println(treemap1.size());
		System.out.println(treemap1);
	}

}
