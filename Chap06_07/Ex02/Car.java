package Chap06_07.Ex02;

public class Car {

	String company;
	String model;
	String color;
	int maxSpeed;
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company; //this�� ��ü �ڽ�
	}				//�޼ҵ忡 ��ǲ�Ǵ� ������,��ǲ�Ǵ� ������ �޴� ������, �޸𸮿� �ε��� ������(this.)
	public String getModel() {
		return model;
	}
	public void setModel(String mo) { //��ǲ, ��ǲ�� �޴� ����, �޸𸮿� �ε��� ������ �ٸ����
		model = mo; //this ��������
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
