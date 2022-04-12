package Ex;

import java.util.Scanner;

public class Ex_teacher_11 {

	public static void main(String[] args) {
		/*
		 * String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
			int score[] = {95, 88, 76, 62, 55};
			그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하라. 
			"그만"을 입력받으면 종료한다. (Java 는 인덱스 0 에 있으므로 score[0]
			을 출력)
			과목 이름 >> Jaba
			없는 과목입니다.
			과목 이름 >> Java
			Java 의 점수는 95
			과목 이름 >> 안드로이드
			안드로이드의 점수는 55
			과목 이름 >> 그만
			[Hint] 문자열을 비교하기 위해서는 String 클래스의 equals()메소드를 이용해야
			한다.
			String name;
			if(course[i].equals(name)) {
			 	int n = score[i];
			 ...
			}
			*/
		Scanner sc =new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		
		String name = null; //스캐너로 과목의 문자열을 받는 변수
		int i=0;  //인덱스번호 출력하는 변수
		System.out.println("프로그램을 종료하려면 \"그만\"을 입력하세요");
		// ""를 출력하기 위해서 \를 입력한다.
		while(true) { // 특정조건을 만족할 때까지 계속 루프
			System.out.print("과목 이름 >> ");
			name=sc.next(); //스캐너로 과목이름을 받아서 변수에 name에 할당.
			if(name.equals("그만")) { //주의 : name은 참조변수 이므로 ==를 사용하지 않고 equals를 사용
				break;
			}
			//course의 각방을 돌면서 스캐너로 받은 name 변수의 값이 같을때
			for (i = 0; i < course.length; i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i]+" 점수는 : "+score[i]);
					break;
				}
				if (i == course.length-1) {  	//i 변수가 마지막 방까지 왔을 때 검색이 안된 경우
				System.out.println("없는 과목입니다.");
				}
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
		
	}

}
