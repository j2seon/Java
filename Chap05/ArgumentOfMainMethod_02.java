package Chap05;

public class ArgumentOfMainMethod_02 {

	public static void main(String[] args) {
		
		//main �޼ҵ忡 ��ǲ �Ű� ������ ������ �迭�� ���̸� ���Ͻÿ�.
		System.out.println(args.length);
		System.out.println();
		
		// �Է� �Ű������� for�� ���� ���
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		} //
		System.out.println("======================");
		
		// �Էµ� �Ű������� ����(enhanced) for ������ ���
		for(String k : args) { //String Ÿ���� ������ args�� ���Եȴ�.
			System.out.println(k);
		}
	}
	
}
