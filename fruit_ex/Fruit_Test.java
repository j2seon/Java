package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 상속을 다루는 문제 하위의 생성자에 super() 값을 넣으면된다.
 * 
 * 
 * 
 * 
 * 
*/

class Fruit {
	String fruitName; //과일 이름
	String color;		//과일의 색깔
	int large;  		//과일의 크기
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
	
	public String showInfo() { //과일의 정보를 출력하는 메소드
		
		
		return "";
	}

	@Override
	public String toString() {
		return "과일의 이름 : <"+fruitName+">이고, 색깔은 <"+color+">이고, 크기는 <"+large+">입니다."  ;
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
		 * 1. 코드작성 : 스캐너를 인풋받는 코드 작성
		 * 선택 >> 1
		 * ===============================================
		 * 1.사과		|	2.오렌지		| 3. 바나나  | 4. 정보 출력 | 5. 프로그램 종료
		 * ===============================================
		 * 
		 * 선택 >> 1 
		 * 과일명:
		 * 색깔 : 
		 * 크기 :
		 * 
		 * */
		
		//2. 코드 작성 : 스캐너로 인풋받은 값으로 각각의 객체를 생성해서 ArrayList에 저장.
		
		/*
		3. 선택 >> 4 객체를 가져와서 객체를 출력했을 때  ArrayListr의 모든 객체를 출력
			출력결과 : 
				과일의 이름 : <사과>이고, 색깔은 <빨간색이고>, 크기는 <10>입니다.
		*/
		
		
		
		ArrayList<Fruit> fruitlist = new ArrayList<Fruit>();
		Scanner scanner = new Scanner(System.in);
		boolean run= true;
		while(run) {
			System.out.println("===========================================================");
			System.out.println("1. 사과  |  2.오렌지  |  3.바나나  |  4.정보출력  |  5.프로그램 종료");
			System.out.println("===========================================================");
			System.out.println("선택 >>");
			
			
			int choice = scanner.nextInt();
			
			if(choice==1) {
				Fruit apple = new Apple("사과", "빨간색", 35);
				System.out.println("과일명 : "+ apple.getFruitName());
				System.out.println("색깔 : "+ apple.getColor());
				System.out.println("크기 : "+ apple.getLarge());
				fruitlist.add(apple);
			}else if(choice==2) {
				Fruit orange = new Orange("오렌지", "주황색", 5);
				System.out.println("과일명 : "+ orange.getFruitName());
				System.out.println("색깔 : "+ orange.getColor());
				System.out.println("크기 : "+ orange.getLarge());
				fruitlist.add(orange);
			}else if(choice==3) {
				Fruit banana = new Apple("바나나", "노랑색", 3);
				System.out.println("과일명 : "+ banana.getFruitName());
				System.out.println("색깔 : "+ banana.getColor());
				System.out.println("크기 : "+ banana.getLarge());
				fruitlist.add(banana);
			}else if(choice==4) {
				System.out.println("출력 결과 : ");
				for(Fruit a : fruitlist) {
					System.out.println(a);
				}
			}else if(choice==5) {
				break;
			}	
		}
		scanner.close();
		System.out.println("프로그램 종료");
		
	}

}
