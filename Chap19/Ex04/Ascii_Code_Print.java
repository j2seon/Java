package Chap19.Ex04;

/*ASCII�ڵ� �� ��� : 1byte =8bit, ���� ó�� ��Ʈ�� ��ȣ ��Ʈ, 7bit :128�� (0~127)
 *  1 ~ 32 ��Ʈ������ : ����� �� �� ���� Ư�� �� �ڵ�, �� )null,����� ����,�����(7),���� 10, (LF)....
 * 	127 : delete.
 *  ���� ��� ������ 33����Ʈ ~ 126��Ʈ 
 *  ����, ����,Ư������
 * 
 *  ���
 * ========================================
 * ASCII	����		ASCII 	����	 
 * ========================================
 * 34		!		 34		&
 * 35		#		 36		$
 * */


public class Ascii_Code_Print {

	public static void main(String[] args) {
		System.out.println("ASCII"+'\t'+"����"+'\t'+'\t'+"ASCII"+'\t'+"����");
		
		//teacher
		for(int i =33; i<127; i+=2) {
			System.out.println(i+"\t"+(char)i+"\t\t"+(i+1)+"\t"+(char)(i+1));
		}
		
		
		//me
		for(int a=33; a<127; a++) {
		byte b = (byte) a;
		byte bb = (byte) ((byte) a+1);
		char c = (char) b;
		char cc= (char) bb;
		StringBuffer sb = new StringBuffer();
		sb.append(b).append('\t').append(c).append('\t').append('\t').append(bb).append('\t').append(cc);
		System.out.println(sb);
		}

	}

}
