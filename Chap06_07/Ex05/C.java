package Chap06_07.Ex05;

public class C {
	//�ʵ忡 �ο��Ǵ� ���� ������
		private String company ="�����ڵ���";
		String model ;//�� default
		protected String color; //����
		public int maxSpeed;	// �ִ�ӵ�
		
		public void setModel(String model) { //public �ܺ� ��Ű���� Ŭ�������� ���ٰ���
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
