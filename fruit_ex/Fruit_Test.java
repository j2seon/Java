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
	String fruitName; //���� �̸�
	String color;		//������ ����
	int large;  		//������ ũ��
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	
	public Fruit(String fruitName,String color,int large ) {
		this.fruitName=fruitName;
		this.color=color;
		this.large=large;
	}
	
	public String showInfo() { //������ ������ ����ϴ� �޼ҵ�
		
		
		return "";
	}

	@Override
	public String toString() {
		return "������ �̸� : <"+fruitName+">�̰�, ������ <"+color+">�̰�, ũ��� <"+large+">�Դϴ�."  ;
	}

}

class Apple extends Fruit{

	public Apple(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
}

class Orange extends Fruit{

	public Orange(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
}

class bananan extends Fruit{

	public bananan(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
}


public class Fruit_Test {

	public static void main(String[] args) {
		/*
		 * 1. �ڵ��ۼ� : ��ĳ�ʸ� ��ǲ�޴� �ڵ� �ۼ�
		 * ���� >> 1
		 * ===============================================
		 * 1.���		|	2.������		| 3. �ٳ���  | 4. ���� ��� | 5. ���α׷� ����
		 * ===============================================
		 * 
		 * ���� >> 1 
		 * ���ϸ�:
		 * ���� : 
		 * ũ�� :
		 * 
		 * */
		
		//2. �ڵ� �ۼ� : ��ĳ�ʷ� ��ǲ���� ������ ������ ��ü�� �����ؼ� ArrayList�� ����.
		
		/*
		3. ���� >> 4 ��ü�� �����ͼ� ��ü�� ������� ��  ArrayListr�� ��� ��ü�� ���
			��°�� : 
				������ �̸� : <���>�̰�, ������ <�������̰�>, ũ��� <10>�Դϴ�.
		*/
		
		
		
		ArrayList<Fruit> fruitlist = new ArrayList<Fruit>();
		Scanner scanner = new Scanner(System.in);
		boolean run= true;
		while(run) {
			System.out.println("===========================================================");
			System.out.println("1. ���  |  2.������  |  3.�ٳ���  |  4.�������  |  5.���α׷� ����");
			System.out.println("===========================================================");
			System.out.println("���� >>");
			
			
			int choice = scanner.nextInt();
			
			if(choice==1) {
				Fruit apple = new Apple("���", "������", 35);
				System.out.println("���ϸ� : "+ apple.getFruitName());
				System.out.println("���� : "+ apple.getColor());
				System.out.println("ũ�� : "+ apple.getLarge());
				fruitlist.add(apple);
			}else if(choice==2) {
				Fruit orange = new Orange("������", "��Ȳ��", 5);
				System.out.println("���ϸ� : "+ orange.getFruitName());
				System.out.println("���� : "+ orange.getColor());
				System.out.println("ũ�� : "+ orange.getLarge());
				fruitlist.add(orange);
			}else if(choice==3) {
				Fruit banana = new Apple("�ٳ���", "�����", 3);
				System.out.println("���ϸ� : "+ banana.getFruitName());
				System.out.println("���� : "+ banana.getColor());
				System.out.println("ũ�� : "+ banana.getLarge());
				fruitlist.add(banana);
			}else if(choice==4) {
				System.out.println("��� ��� : ");
				for(Fruit a : fruitlist) {
					System.out.println(a);
				}
			}else if(choice==5) {
				break;
			}	
		}
		scanner.close();
		System.out.println("���α׷� ����");
		
	}

}
