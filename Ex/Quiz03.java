package Ex;

class Student{
				//�ڹٴ� ���߻���� �Ұ�, �ڹ��� ��� Ŭ������ ObjectŬ������ �ڽ�Ŭ�����̴�.
				//ObjectŬ�������� ������ �ʵ峪 �޼ҵ带 ������ �� �ִ�.
	String name;	//�л��̸�
	int studentID;	//�й�
	int Kor; // ��������
	int eng; // ��������
	int math; //��������
	
	int sum; //�����հ�
	double avg;  //���
	
	void hobby () {
		System.out.println("�� �л��� ����Դϴ�. ");
	}

	@Override
	public String toString() { //Object Ŭ������ �޼ҵ� ��ü��ü�� ����Ҷ�,[��Ű����.Ŭ������@�ؽ��ڵ�]
		return "�̸� : "+name+ ", �й� : "+ studentID+" , ����"+ Kor+", ���� "+eng+", ���� : "+math+
				", �հ� : "+sum+", ��� : "+ avg;
	}
	
}

class S_ö�� extends Student{
	S_ö��(){} //������ : 1 Ŭ������� ����, 2.����Ÿ���� ������Ѵ�.
	S_ö��(String a,int b,int c,int d,int e){
		super.name=a;		//super �θ� Ŭ����, this :�ڽ��� ��ä
		super.studentID=b;
		super.Kor=c;
		super.eng=d;
		super.math=e;
		super.sum=c+d+e;
		super.avg=(double)sum/3;
	}
	
	@Override
	void hobby() {
		System.out.println("ö���� ��̴� �����Դϴ�.");
	}
	
}
class S_���� extends Student{
	S_����() {}
	
	S_����(String a,int b,int c,int d,int e){
		super.name=a;
		super.studentID=b;
		super.Kor=c;
		super.eng=d;
		super.math=e;
		
		super.sum=c+d+e;
		super.avg=(double)sum/3;//or �ڴ� 3.0���� ������ȴ�.
	}
	@Override
	void hobby() {
		System.out.println("������ ��̴� ��ȭ�����Դϴ�.");  
	}
	
}
class S_���� extends Student{
	S_����() {}
	S_����(String a,int b,int c,int d,int e){
		super.name=a;
		super.studentID=b;
		super.Kor=c;
		super.eng=d;
		super.math=e;
		super.sum=c+d+e;
		super.avg=(double)sum/3;
	}
	@Override
	void hobby() {
		System.out.println("������ ��̴� �뷡�θ����Դϴ�.");
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		Student pp1 = new S_ö��("ö��", 20210303,80,70,80); //��ĳ����
		Student pp2 = new S_����("����", 20210301,90,100,90); //��ĳ����
		Student pp3 = new S_����("����", 20210302,70,60,50); //��ĳ����
		Student[] array= {pp1,pp2,pp3};
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]); 
			array[i].hobby(); //��� �޼ҵ� ���
			}
		System.out.println("==========================");
		for(Student k : array) {
			System.out.println(k);
			k.hobby();
		}
	}
		
		
		

	}

