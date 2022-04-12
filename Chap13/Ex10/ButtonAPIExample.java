package Chap13.Ex10;

class Button{
	//OnClickListener : ��üŸ��, ocl: ��������
	OnclickListener ocl;   //ocl �⺻ ������ null
	
	
	//setter�� ���ؼ� OnclickListener�� �������� ocl�� ��ü �ּҸ� ��´�. 
	void setonClickListener(OnclickListener ocl) {
		this.ocl=ocl;
	}
	//������ �ڽ�Ŭ������ ����.
	//ȣ���ϴ� ������ �������̽��� onClick()�޼ҵ带 �������ؼ� ȣ��
	interface OnclickListener { //InnerInterface, static�� ����, Button.OnclickListener :
		void onClick(); 	//�޼ҵ� ���� ��, �������� �������̵� �ؼ� ������ 
	}
	void click() {		//�������� �� ocl.onClick()�� ȣ�� 
		ocl.onClick();	//ocl : �������� :null ===>set
		System.out.println(ocl);
	}
}
public class ButtonAPIExample {

	public static void main(String[] args) {
		//������ 1 : Ŭ�� �� ���� ���
		Button button1=new Button(); // button1 ��ü ����,
		
		//A.B ab = new A.B(){�̳��������̽�B�� �޼ҵ带 ������ �ڵ�};
		//OnClickListener ��ü Ÿ������ ��ü �����ؼ� �Ű������� ����
		button1.setonClickListener(new Button.OnclickListener() {
			@Override
			public void onClick() {
				System.out.println("������1. �������");
			}
		});	
		
		button1.click();
		System.out.println("==========================");
		
		//������ 2 : Ŭ�� �� ���̹� ���� 
		Button button2=new Button();
		//setonClickListener �޼ҵ忡 �Ű������� OnClickListener�� ���� �͸�ü�� ������ OnClickListener
		button2.setonClickListener(new Button.OnclickListener() {
			@Override
			public void onClick() {
				System.out.println("������ 2. ���̹� ����");
			}
		} );
		button2.click();
	}

}
