package Chap06_07.Ex01;

class AA{
	String name; //�ʵ�(���) : �ν��Ͻ�ȭ ���Ѿ� ����� �����ϴ�. (Heap ������ ���� ����)
	int age;
	String email;
	
	AA(){ //�⺻������: ��������, �ٸ������ڰ� ������ ��� �⺻�����ڸ� �����ϸ� ����.
		
	}
	
	public String getName() { //�޼ҵ�(���): �ν��Ͻ�ȭ ���Ѿ� ��밡��
		return name;	//Heap ������ �ּҸ� ����, Ŭ�������� ���� �޼ҵ念���� ����
	}					//return: �޼ҵ带 ȣ���ϴ� ������ ������ ���� �����ش�.
	public void setName(String name) { //void : ���ϰ��� ���ٸ� �˷��ִ� �ĺ���
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

public class CreateObject {

	public static void main(String[] args) {
		AA aa = new AA(); //AA Ŭ����(���赵)�� aa(��ü)�� ����.
		//AA�� Ŭ�����̸�, aa: ��ü��(�ν��Ͻ���), new : Heap������ �ʵ�� �޼ҵ带 �����ض�
		//AA() : ������ ��ü�� �ʵ尪�� �ʱ�ȭ �Ҷ� ���, �����ڵ� �ϳ��� �޼ҵ��̴�
				//1. ������ �̸��� Ŭ���� �̸��� ���� �޼ҵ�.
				//2. ����Ÿ���� ����.
				//3. �������� �Ű������� ���� �����ڸ� �⺻�����ڶ�� ��.
				//4. �⺻�����ڴ� ������ ����.
				//5. ��ü�� ������ �� �ݵ�� �����ڸ� ȣ��
		//��ü�� �޼ҵ� ȣ��
		System.out.println(aa.getName()); 
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("==============");
		
		
		//��ü�� �ʵ� ȣ��
		System.out.println(aa.name); 
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		//=========================
		
		//�޼ҵ� ȣ�� 
		System.out.println("===============");
		//setters : ��ü�� �޸𸮿� ���� �Ҵ��� ��
		aa.setName("ȫ�浿"); //��ü�� ������ ���� �Ҵ�
		aa.setAge(29);  //
		aa.setEmail("aaa@aaa.com");
		
		//getters : ��ü�� �޸��� ���� ������ �� �� 
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println("==================");
		
		AA bb =new AA();
		bb.setName("������");
		bb.setAge(27);
		bb.setEmail("ddj04323@naver.com");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		System.out.println("====================");
		
		AA cc = new AA();
		cc.setName("û����");
		cc.setAge(12);
		cc.setEmail("grape@gmail.com");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
	}

}
