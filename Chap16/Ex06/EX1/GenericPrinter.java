package Chap16.Ex06.EX1;

//���ʸ� Ŭ���� : �پ��� Ÿ���� ����� �� �ִ� Ŭ����
public class GenericPrinter <T extends Material> {		//�پ��� ���� �������ϴ� ������(�Ŀ��,�ö�ƽ,��)
						//T: Ÿ������, Material ���� Ŭ������ TŸ�Կ� ���� �� �ִ�.
	private T material ; 		//material : �������� , ��ü , �ν��Ͻ� 

	public T getMaterial() {		//��ü�� �������ִ� 
		return material;
	}

	public void setMaterial(T material) {    	//��ü�� Ȯ��ȭ
		this.material = material;
	}
	
	public String toString() {
		return material.toString();		//�ش� ��ü�� toString()�޼ҵ� ȣ��
	}
	public void printing() { //�޼ҵ常 ���� 
		material.doPrinting();
	}
	
}
