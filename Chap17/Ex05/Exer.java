package Chap17.Ex05;

import java.util.ArrayList;

class Mem {
	private int id;
	private String name;
	public Mem(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "이름 :" + name+" , "+ " id  :" + id;
	}
	
}

class Lista{
	private ArrayList<Mem> ar;
	public Lista() {
		ar= new ArrayList<>();
	} 
	public void add(Mem mem) {
		ar.add(mem);
	}
	
	public void remover(int id) {
		for(int i = 0; i<ar.size(); i++) {
			Mem m = ar.get(i);
			int putid=m.getId();
			if(putid==id) {
				ar.remove(i);
			}
		}
	}
	public void print() {
		System.out.println(ar);
	}
	
}
public class Exer {

	public static void main(String[] args) {
		Lista li = new Lista();
	
		Mem m1 = new Mem(1, "진선");
		Mem m2 = new Mem(2, "강은");
		Mem m3 = new Mem(3, "현아");
		Mem m4 = new Mem(4, "지은");
		
		li.add(m1);li.add(m2);li.add(m3);li.add(m4);
		li.print();
		
		li.remover(1);
		li.print();
		
 		
		
	}

}
