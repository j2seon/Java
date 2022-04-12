package Chap17.Ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 1. 학생 수 : 5 임의의 값을 입력했을 때 ArrayList의 capacity 크기지정
 * 2. 점수입력 : 입력받은 학생수에 따라서 점수입력. ArrayList에 객체를 저장
 * 3. 점수리스트 : ArrayList에 저장된 Student객체를 가져와서 score 출력
 * 4. 분석 : 최고정 : , 평균점수 : 
 * 5. 종료
 * */

class Student{
	int score;		//점수를 입력 , 필귿의 값 할당(1. 객체생성 후 직접, 2. private(생성자, Setter,Getter을 통해서)

	public int getScore() {
		return score;
	}
	public Student(int score) {
		this.score=score;
	}
	public Student() {
		
	}

}

public class ScoreStudent_1 {

	public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in); 	//System.in: 콘솔을 통해서 값을 받겠다.
        boolean run = true;
        int studentNum = 0;		//while 블락 밖에서 선언, 전역변수 
        while(run) {			
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();		//선택 //if조건문 밖에서
            
            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                studentNum=scanner.nextInt();
                arr= new ArrayList<Student>(studentNum);
                System.out.println("입력완료");
            } else if(selectNo == 2) {
//            	System.out.println("학생수 만큼 점수를 입력하시오 ");
//            	for(int i=0; i<studentNum; i++) {
//            		int put=scanner.nextInt();
//            		Student st=new Student(put);
//            		System.out.println((i+1)+"번 학생 점수를 입력하세요 : "+st.getScore());
//            		arr.add(st);
//            		System.out.println("입력완료");
//            	}
            	
            	if(studentNum==0) { 	//studentNum을 할당받아야 for문의 범위를 지정할 수 있다.
            		System.out.println("학생 수를 먼저 입력하세요");
            	}else {
            		//for 문을 통해서 인풋받은 학생 수 만큼 점수'
            		for(int i=0; i<studentNum; i++) {
            			//인풋을 받아서 인풋받은 값을 Student 객체의 score변수에 할당.
            			//객체를 생성해서 
            			 Student student= new Student();
            			 System.out.print((i+1)+"번째 학생 점수를 입력하세요");
            			 student.score=scanner.nextInt();  //학생점수를 입력 받아서 필드에 값 할당.
            			 arr.add(student); 		//ArrayList에 필드에 값을 할당한 객체를 ArrayList에 저장
            			 System.out.println("입력완료"); //입력완료라고 출력하고 개행
            		}
            		
            	} 
            } else if(selectNo == 3) {
//            		for(int i=0; i<arr.size(); i++) { // ArrayList 각 점수가 할당된 객체가 저장, 객체 생성 후, 필드의 값을 직접출력
//            			System.out.println(arr.get(i).getScore());
//            		}
            		if(studentNum==0) { 	//studentNum을 할당받아야 for뮨의 범위를 지정할 수 있다.
                		System.out.println("학생 수를 먼저 입력하세요");
                	}else {
                		for(int i=0; i<studentNum; i++) { //ArrayList 객체를 가져와서 Student.socre 필드 값을 할당
                			Student student =arr.get(i); //필드의 값을 객체로 직접 출력
                			System.out.println(student.getScore()); //필드의 값을 getter로 출력
                		}
                	}
            		
            } else if(selectNo == 4) {
            	//코드작성
            	if(studentNum==0) { 	//studentNum을 할당받아야 for뮨의 범위를 지정할 수 있다.
            		System.out.println("학생 수를 먼저 입력하세요");
            	}else {
            		int maxScore=0;		//최대 점수를 받는 지역변수 선언 <초기값 할당>
            		int sum=0;			// 합계를 저장하는 지역 변수 <초기값 할당>
            		//1. ArrayLIst의 객체를 가지고 온다. 2. Student 객체의 score 필드의 값을 가져와서 처리
            		for(int i=0; i<studentNum; i++) {
            			Student student=arr.get(i);
            			//최대 값을 변수에 할당.
            			maxScore=(student.score>maxScore)? student.score:maxScore; //삼항연산자를 사용해서 최대 값을 변수에 할당.
            			sum+= student.score; 
            		} //maxScore 변수의 최종값을 적용 후 ,sum: 모든 score 더한 값을 변수에 담아서
            		System.out.println("최고점수 : " + maxScore);
            		System.out.println("평균점수 : " + (float) sum / studentNum);
            	}
//            	int maxScore=0;
//            	int sum=0;
//            	for(int i=0; i<arr.size(); i++) {
//            		sum+=arr.get(i).getScore();
//            		if(arr.get(i).getScore()>maxScore) {
//            			maxScore=arr.get(i).getScore();
//            		}
//            	}
//            	System.out.println("최고점수 : " + maxScore);
//        		System.out.println("평균점수 : " + (float) sum / studentNum);
            	
            } else if(selectNo == 5) {
            	break ;
            	//run = false; run이 false일때 while문을 빠져나온다.
              }
        }
        System.out.println ("프로그램 종료");
	}
}
