package Chap17.Ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 1. �л� �� : 5 ������ ���� �Է����� �� ArrayList�� capacity ũ������
 * 2. �����Է� : �Է¹��� �л����� ���� �����Է�. ArrayList�� ��ü�� ����
 * 3. ��������Ʈ : ArrayList�� ����� Student��ü�� �����ͼ� score ���
 * 4. �м� : �ְ��� : , ������� : 
 * 5. ����
 * */

class Student{
	int score;		//������ �Է� , �ʱ��� �� �Ҵ�(1. ��ü���� �� ����, 2. private(������, Setter,Getter�� ���ؼ�)

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
        Scanner scanner = new Scanner(System.in); 	//System.in: �ܼ��� ���ؼ� ���� �ްڴ�.
        boolean run = true;
        int studentNum = 0;		//while ��� �ۿ��� ����, �������� 
        while(run) {			
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();		//���� //if���ǹ� �ۿ���
            
            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                studentNum=scanner.nextInt();
                arr= new ArrayList<Student>(studentNum);
                System.out.println("�Է¿Ϸ�");
            } else if(selectNo == 2) {
//            	System.out.println("�л��� ��ŭ ������ �Է��Ͻÿ� ");
//            	for(int i=0; i<studentNum; i++) {
//            		int put=scanner.nextInt();
//            		Student st=new Student(put);
//            		System.out.println((i+1)+"�� �л� ������ �Է��ϼ��� : "+st.getScore());
//            		arr.add(st);
//            		System.out.println("�Է¿Ϸ�");
//            	}
            	
            	if(studentNum==0) { 	//studentNum�� �Ҵ�޾ƾ� for���� ������ ������ �� �ִ�.
            		System.out.println("�л� ���� ���� �Է��ϼ���");
            	}else {
            		//for ���� ���ؼ� ��ǲ���� �л� �� ��ŭ ����'
            		for(int i=0; i<studentNum; i++) {
            			//��ǲ�� �޾Ƽ� ��ǲ���� ���� Student ��ü�� score������ �Ҵ�.
            			//��ü�� �����ؼ� 
            			 Student student= new Student();
            			 System.out.print((i+1)+"��° �л� ������ �Է��ϼ���");
            			 student.score=scanner.nextInt();  //�л������� �Է� �޾Ƽ� �ʵ忡 �� �Ҵ�.
            			 arr.add(student); 		//ArrayList�� �ʵ忡 ���� �Ҵ��� ��ü�� ArrayList�� ����
            			 System.out.println("�Է¿Ϸ�"); //�Է¿Ϸ��� ����ϰ� ����
            		}
            		
            	} 
            } else if(selectNo == 3) {
//            		for(int i=0; i<arr.size(); i++) { // ArrayList �� ������ �Ҵ�� ��ü�� ����, ��ü ���� ��, �ʵ��� ���� �������
//            			System.out.println(arr.get(i).getScore());
//            		}
            		if(studentNum==0) { 	//studentNum�� �Ҵ�޾ƾ� for���� ������ ������ �� �ִ�.
                		System.out.println("�л� ���� ���� �Է��ϼ���");
                	}else {
                		for(int i=0; i<studentNum; i++) { //ArrayList ��ü�� �����ͼ� Student.socre �ʵ� ���� �Ҵ�
                			Student student =arr.get(i); //�ʵ��� ���� ��ü�� ���� ���
                			System.out.println(student.getScore()); //�ʵ��� ���� getter�� ���
                		}
                	}
            		
            } else if(selectNo == 4) {
            	//�ڵ��ۼ�
            	if(studentNum==0) { 	//studentNum�� �Ҵ�޾ƾ� for���� ������ ������ �� �ִ�.
            		System.out.println("�л� ���� ���� �Է��ϼ���");
            	}else {
            		int maxScore=0;		//�ִ� ������ �޴� �������� ���� <�ʱⰪ �Ҵ�>
            		int sum=0;			// �հ踦 �����ϴ� ���� ���� <�ʱⰪ �Ҵ�>
            		//1. ArrayLIst�� ��ü�� ������ �´�. 2. Student ��ü�� score �ʵ��� ���� �����ͼ� ó��
            		for(int i=0; i<studentNum; i++) {
            			Student student=arr.get(i);
            			//�ִ� ���� ������ �Ҵ�.
            			maxScore=(student.score>maxScore)? student.score:maxScore; //���׿����ڸ� ����ؼ� �ִ� ���� ������ �Ҵ�.
            			sum+= student.score; 
            		} //maxScore ������ �������� ���� �� ,sum: ��� score ���� ���� ������ ��Ƽ�
            		System.out.println("�ְ����� : " + maxScore);
            		System.out.println("������� : " + (float) sum / studentNum);
            	}
//            	int maxScore=0;
//            	int sum=0;
//            	for(int i=0; i<arr.size(); i++) {
//            		sum+=arr.get(i).getScore();
//            		if(arr.get(i).getScore()>maxScore) {
//            			maxScore=arr.get(i).getScore();
//            		}
//            	}
//            	System.out.println("�ְ����� : " + maxScore);
//        		System.out.println("������� : " + (float) sum / studentNum);
            	
            } else if(selectNo == 5) {
            	break ;
            	//run = false; run�� false�϶� while���� �������´�.
              }
        }
        System.out.println ("���α׷� ����");
	}
}
