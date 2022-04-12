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
		this.company = company; //this는 객체 자신
	}				//메소드에 인풋되는 변수명,인풋되는 변수를 받는 변수명, 메모리에 로드할 변수명(this.)
	public String getModel() {
		return model;
	}
	public void setModel(String mo) { //인풋, 인풋을 받는 변수, 메모리에 로드할 변수가 다를경우
		model = mo; //this 생략가능
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
