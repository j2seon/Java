package Ex;

public class Ex6 {

	public static void main(String[] args) {
		
		// �迭�� �׸񿡼� �ִ밪���ϱ� for�� �̿�
		int max=0; //�ִ밪�� �����ϴ� ����
		int[] array = {4,5,1,2,3};
		for (int i:array) {  //���� for�� �̿� i�� array�� ���� �Էµȴ�.
			if(i>max) {
				max=i;
			}
		}System.out.println(max);
		
		System.out.println("====== �ٸ� ��� �����غ��� =======");
		max = array[0];  
		for (int i = 0; i < array.length; i++) {//������ ���� ��ȯ�ϸ鼭 ������´�.
			if(array[i]>max) { //���� ���� max������ ������ Ŭ]
				max=array[i]; //max ������ ū���� ����
			}
		}System.out.println(max);
		
		System.out.println("================");
		
		max=0;
		for (int i = 0; i < array.length; i++) {
			max=array[0];  //max�� �������� �����ϴϱ� ��ȿ�����ϵ�
			if (max<array[i]) {
				max=array[i];
				System.out.println(max);
			} //����� �ۿ��� �ϰԵǸ� for�� �ִ� max������ �����...
		}
	
		
	}

}
