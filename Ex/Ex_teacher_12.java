package Ex;

import java.util.Scanner;

public class Ex_teacher_12 {

	public static void main(String[] args) {
		
		/*[���� 12] ��ǻ�Ϳ� ���� ������ ���� ���� �� ������ ������. ���ô� ����
			�׸��� ����. ���ں��� ���� �����Ѵ�. ���ڰ� ���� ���� �� �� �ϳ��� �Է��ϰ�
			<Enter>Ű�� ġ��, ���α׷��� ���� ���� �� �߿��� �����ϰ� �ϳ��� �����ϰ�
			��ǻ�Ͱ� �� ������ �Ѵ�. ���ڰ� �Է��� ���� �����ϰ� ������ ���� ���Ͽ�
			���� �̰���� �Ǵ��Ѵ�. ���ڰ� ���� ���� �� ��� "�׸�"�� �Է��ϸ� ������ ������.
			��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.
			���� ���� ��! >> ����
			����� = ���� , ��ǻ�� = ���� ����ڰ� �̰���ϴ�.
			���� ���� ��! >> ����
			����� = ���� , ��ǻ�� = ���� �����ϴ�.
			���� ���� ��! >> �׸�
			������ �����մϴ�...
			[Hint] 
			������ ���� ���ڿ� �迭�� �����.
			String str[] = {"����", "����", "��"};
			��ǻ�Ͱ� ���� ���� �����ϰ� �����ϱ� ���ؼ��� ���� �ڵ带 �̿��Ѵ�.
			int n = (int)(Math.random()*3); // n �� 0, 1, 2 �߿��� �����ϰ� ����
			��ǻ�Ͱ� �� ���� "����" ���� ���ϴ� �ڵ�� ������ ���� �Ѵ�.
			if(str[n].equals("����")) //��ǻ�Ͱ� �� ���� "����"���� ���ϴ� 
		 */
		
		String str[] = {"����","����","��"};
		String com = null; // ��ǻ�Ͱ� �� ���� ������ ����
		String user = null; // ����ڰ� �� ���� ������ ����
		int n;  //�������� �� ���� �����ϴ� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �����մϴ�!!!");
		do {
			System.out.print("���� ���� ��! >> ");
			user=sc.next(); //����ڰ� ���� ��
			if (user.equals("�׸�")) {
				break;
			}
			n=(int)(Math.random()*3);//��ǻ�Ͱ� �� �� ��������
			com = str[n]; //��ǻ�Ͱ� ���� �� : 0-����, 1- ����, 2- ��
			//����ڰ� ���� �� ��
			if(user.equals(str[0])) {
				if (com.equals(str[0])) {
					System.out.print("����� = "+user+", ��ǻ�� = "+ com);
					System.out.println(" �����ϴ�.");
				}else if(com.equals(str[1])) {
					System.out.print("����� = "+user+", ��ǻ�� = "+ com);
					System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
				}else if(com.equals(str[2])) {
					System.out.print("����� = "+user+", ��ǻ�� = "+ com);
					System.out.println(" ����ڰ� �̰���ϴ�.");
				}
				//����ڰ� ���� �� ��
			}else if (user.equals(str[1])) {
				if (com.equals(str[0])) {
					System.out.print("����� = "+user+", ��ǻ�� = "+ com);
					System.out.println(" ����ڰ� �̰���ϴ�.");
				}else if(com.equals(str[1])) {
					System.out.print("����� = "+user+", ��ǻ�� = "+ com);
					System.out.println(" �����ϴ�..");
				}else if(com.equals(str[2])) {
					System.out.print("����� = "+user+", ��ǻ�� = "+ com);
					System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
				//����ڰ� �� �� �� 
				}
			}else if (user.equals(str[2])) {
				if (com.equals(str[0])) {
					System.out.print("����� = "+user+", ��ǻ�� = "+ com);
					System.out.println(" ��ǻ�Ͱ� �̰���ϴ�.");
				}else if(com.equals(str[1])) {
					System.out.print("����� = "+user+", ��ǻ�� = "+ com);
					System.out.println(" ����ڰ� �̰���ϴ�.");
				}else if(com.equals(str[2])) {
					System.out.print("����� = "+user+", ��ǻ�� = "+ com);
					System.out.println(" �����ϴ�");
				}
			}	
			
		} while (true);
		
			
		sc.close();
	 System.out.println("������ �����մϴ�...");
	}
		
}
