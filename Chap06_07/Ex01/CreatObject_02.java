package Chap06_07.Ex01;

//�ܺ� Ŭ����
class Aaa{  
	String name;  //�ʵ� : ��üȭ ���Ѿ� ��밡��, Ŭ���������� ����
	int age;		//�ʵ��� ���� Heap���� �ȿ� ����, Heap������ �������� �����ʱ�ȭ����.
	double weight;
	boolean man ;	//�������� : NULL, int:0,double :0.0, boolean :false
	String email;   //�ʵ�� ���𸸵ǰ� ���� �Ҵ��� �� �Ǿ�����:
				
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public String getName() { //�޼ҵ� ȣ��
		return name;
	}
	public void setName(String name) { //��ǲ�Ǵ� ����, �޴� �����̸�, �޸� �̸���� �����Ұ��
		this.name = name;  //�޸� �̸��� this:�ڱ��ڽ��� Ŭ������ ����
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


public class CreatObject_02 {

	public static void main(String[] args) {
		
		Aaa aaa = new Aaa(); //��ü���� (aa)
		
		//�ʵ��� �ʱ� ���� ���(Heap ������ ���� �ʱ�ȭ)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		System.out.println("=============");
		
		//������ ���� ���� ���� ���� �� �޸𸮿� ���� ���� �Ҵ����� �ʴ´�. ĸ��ȭ
		aaa.name="������";
		aaa.age=27;
		aaa.weight=53.6;
		aaa.man=false;
		aaa.email = "aaa@aaa.com";
		
		
		//setter�� ���ؼ� ���� ����
		aaa.setName("�������");
		aaa.setAge(60);
		aaa.setEmail("2222@ssss");
		aaa.setMan(true);
		aaa.setWeight(60);
		
		System.out.println("=====================");
		
		
		//getter�� ���ؼ� �޸��� ���� ���
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getMan());
		System.out.println(aaa.getWeight());
		
		//�ϳ��� Ŭ�������� �������� ��ü�� ���� �� ���.
		
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa();
		
	}

}
