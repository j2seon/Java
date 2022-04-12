package Chap17.Ex06.EX01;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int Score;

	public Student() {}
	public Student(int Score) {
		this.Score=Score;
	}
	
	public int getScore() {
		return Score;
	}
}

public class Exr {

	public static void main(String[] args) {
		ArrayList<Student> ar1 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int num=0;
		while(run) {
			System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int inputnum=sc.nextInt();
            
            if(inputnum==1) {
            	System.out.println("학생 수를 입력하세용");
            	ar1=new ArrayList<Student>(num);
            	num=sc.nextInt();
            	System.out.println("입력완료");
            }else if(inputnum==2) {
            	if(num==0) {
            		System.out.println("먼저 학생 수를 입력하세요");
            	}else {
            		for(int i=0; i<num; i++) {
            			System.out.println((i+1)+"번째 학생 점수를 입력하세요");
            			Student st =new Student();
            			st.Score=sc.nextInt();
            			ar1.add(st);
            			System.out.println("입력완료");
            		}
            	}
            }else if(inputnum==3) {
            	if(num==0) {
            		System.out.println("먼저 학생 수를 입력하세요");
            	}else {
            		for(int i=0; i<num; i++) {
            			Student st = ar1.get(i);
            			System.out.println(st.getScore());
            		}
            	}
            }else if(inputnum==4) {
            	if(num==0) {
            		System.out.println("먼저 학생 수를 입력하세요");
            	}else {
            		int sum=0;
            		int maxscore=0;
            		for(int i=0; i<num; i++) {
            			Student st = ar1.get(i);
            			sum+=st.getScore();
            			if(st.Score>maxscore) {
            				maxscore=st.Score;
            			}
            		}
            		System.out.println("합계 : "+sum);
            		System.out.println("평균: "+(double)sum/num);
            		System.out.println("최고점수 : "+ maxscore);
            	}
            }
		
		
		
		}

	}

}
