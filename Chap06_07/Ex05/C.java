package Chap06_07.Ex05;

public class C {
	//필드에 부여되는 접근 제어자
		private String company ="현대자동차";
		String model ;//모델 default
		protected String color; //색깔
		public int maxSpeed;	// 최대속도
		
		public void setModel(String model) { //public 외부 패키지의 클래스에서 접근가능
			this.model = model;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		
		public void print() {
			System.out.println("company :"+company+"model : "+model+"color :"+color+
					"maxSpeed : "+maxSpeed);
		}

}
