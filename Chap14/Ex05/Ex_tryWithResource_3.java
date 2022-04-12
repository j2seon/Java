package Chap14.Ex05;

//�ڵ� ���ҽ�(��ü) ���� : 
	//1. AutoCloseable �������̽� ����
	//2. close() �޼ҵ� ������


//�ʵ忡 �� �Ҵ�. �����ڸ� ȣ�� �� �ʵ忡 ���� �ο� , 
class Abc implements AutoCloseable{
	String name ;
	int StudentID ;
	int kor;
	int eng;
	int math;
	double avg;  //��հ��
	
	Abc(String name, int StudentID, int kor, int eng, int math){
		this.name=name;
		this.StudentID=StudentID;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		this.avg=(double)(kor+eng+math)/3;
		
	}

	@Override
	public void close() throws Exception {
		//�ʱ�ȭ ���� �޸� ���� ���( �ؿ� ���ص� ����ٰ��ϸ�ȴ�)
		System.out.println(name+StudentID+kor+eng+math+avg);
		if(name!=null || StudentID !=0 || kor!=0|| eng!=0|| math !=0 || avg!=0.0)
			name=null;
			StudentID=0; kor=0; eng=0; math=0; avg=0.0;
			System.out.println("���ҽ� �����Ǿ����ϴ�");
		//�ʱ�ȭ �� �޸� �� ���
//���� �Ѱ�		
//		if(math != 0) {
//			math = 0;
//			System.out.println("���ҽ� �����Ǿ����ϴ�");
//		}
	}
	
}

public class Ex_tryWithResource_3 {

	public static void main(String[] args) {
		//1. ��ü�� ��� �ʵ带 �ʱ�ȭ �ϰ� �ڵ� close
		try(Abc a=new Abc("������",1,80,90,80);){
		System.out.println("�̸� : "+a.name+" �й� : "+a.StudentID+" �������� : "+a.kor+" �������� : "+a.eng+" �������� "+a.math+" ��� : "+a.avg);
		}catch (Exception e) {
			System.out.println("�����Ǿ����ϴ�.");
		}
		//2. ����close(), finally ������� close()ȣ��
		Abc a2=null;
		try {
			a2=new Abc("�̹���",1,80,90,80);
			System.out.println("�̸� : "+a2.name+" �й� : "+a2.StudentID+" �������� : "+a2.kor+" �������� : "+a2.eng+" �������� "+a2.math+" ��� : "+a2.avg);
		}catch (Exception e) {

		}finally {
			if(a2.name !=null) {
				try {
					a2.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
		
		
	}	
}


