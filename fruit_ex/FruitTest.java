package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;



/*
 * ����� �ٷ�� ���� ������ �����ڿ� super() ���� ������ȴ�.
 * 
 * 
 * 
 * 
 * 
*/

class Fruit {
	String name;
	String color;
	int large;

	public Fruit(String name,String color,int large) {
		this.name = name;
		this.color=color;
		this.large=large;			
		
	}

	@Override
	public String toString() {
		return "������ �̸� : <"+name+">�̰�, ������ <"+color+">�̰�, ũ��� <"+large+"> �Դϴ�.";
	}
	
	
}

class apple extends Fruit{

	public apple(String name, String color, int large) {
		super(name, color, large);
	
	}
}
class Orange extends Fruit{

	public Orange(String name, String color, int large) {
		super(name, color, large);
	}
}

class bananan extends Fruit{

	public bananan(String name, String color, int large) {
		super(name, color, large);
	}
}



public class FruitTest {
	
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<Fruit> arr = new ArrayList<Fruit>();
	
	public static void addApple() {
		System.out.print("���ϸ� : ");
		String name=scanner.next();
		System.out.print("���� : ");
		String color=scanner.next();
		System.out.print("ũ�� : ");
		int size=scanner.nextInt();
		apple apple1 = new apple(name, color, size);
		arr.add(apple1);
	}
	public static void addOrange() {
		System.out.print("���ϸ� : ");
		String name=scanner.next();
		System.out.print("���� : ");
		String color=scanner.next();
		System.out.print("ũ�� :");	
		int size=scanner.nextInt();
		Orange orange = new Orange(name, color, size);
		arr.add(orange);
		
		
	}
	public static void addBanana() {
		System.out.print("���ϸ� :");
		String name=scanner.next();
		System.out.print("���� : ");
		String color=scanner.next();
		System.out.print("ũ�� : ");
		int size=scanner.nextInt();
		bananan bananana = new bananan(name, color, size);
		arr.add(bananana);
	}
	
	public static void showInfo() {
		for(Fruit fruit : arr) {
			System.out.println(fruit);
		}
		
	}
	

	public static void main(String[] args) {
		boolean run= true;
		while(run) {
			System.out.println("===========================================================");
			System.out.println("1. ���  |  2.������  |  3.�ٳ���  |  4.�������  |  5.���α׷� ����");
			System.out.println("===========================================================");
			System.out.println("���� >>");
			
				int choice = scanner.nextInt();
				switch(choice) {
				case 1:
					addApple();					
					break;
				case 2:addOrange();
					break;
				case 3:addBanana();
					break;
				case 4:
					showInfo();
					break;
				case 5:
					run=false;
					break;
				}
			}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
		}
	}

