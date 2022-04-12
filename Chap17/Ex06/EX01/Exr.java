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
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int inputnum=sc.nextInt();
            
            if(inputnum==1) {
            	System.out.println("�л� ���� �Է��ϼ���");
            	ar1=new ArrayList<Student>(num);
            	num=sc.nextInt();
            	System.out.println("�Է¿Ϸ�");
            }else if(inputnum==2) {
            	if(num==0) {
            		System.out.println("���� �л� ���� �Է��ϼ���");
            	}else {
            		for(int i=0; i<num; i++) {
            			System.out.println((i+1)+"��° �л� ������ �Է��ϼ���");
            			Student st =new Student();
            			st.Score=sc.nextInt();
            			ar1.add(st);
            			System.out.println("�Է¿Ϸ�");
            		}
            	}
            }else if(inputnum==3) {
            	if(num==0) {
            		System.out.println("���� �л� ���� �Է��ϼ���");
            	}else {
            		for(int i=0; i<num; i++) {
            			Student st = ar1.get(i);
            			System.out.println(st.getScore());
            		}
            	}
            }else if(inputnum==4) {
            	if(num==0) {
            		System.out.println("���� �л� ���� �Է��ϼ���");
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
            		System.out.println("�հ� : "+sum);
            		System.out.println("���: "+(double)sum/num);
            		System.out.println("�ְ����� : "+ maxscore);
            	}
            }
		
		
		
		}

	}

}
