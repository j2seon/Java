package Chap14.Ex01;

//Exception�� ������ �ֻ��� Ŭ����
//

public class ArrayException_2 {
	public static void main(String[] args) {
		
		int[] arr= new int[5];	//arr�迭�� �迭�� 5�� ����. index :0,1,2,3,4
		
		try {
			for(int i=0; i<=5; i++) {
				arr[i]=i;
				System.out.println(arr[i]);
			}
		}catch(Exception e){  //������ ��� ���ܸ�  ó���� ���ִ�.
			System.out.println("�迭�� �ε��� ���ȣ�� �ѱ��");
		}finally {
			System.out.println("���");
		}
		System.out.println("����");
	
		
	}
}
