package Chap16.Ex06.EX1;

//GenericPrinter�� ���� ��ü [���]

public class Powder extends Material{	//�߻�Ŭ������ ���

	
	public void doPrinting() { // �߻�޼ҵ带 ����
		System.out.println("�Ŀ�� ���� ����մϴ�.");
	}
	@Override
	public String toString() {
		return "���� �Ŀ���Դϴ�";
	}
	
	
}
