package Chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//java.lang ��Ű���� Ŭ�������� import�� �ʿ����� �ʴ�.
/* �÷��� : ������ �ڷ����� ����, ���� ũ�Ⱑ �������� ��ȭ 
 * �迭 : ������ �ڷ����� ����, ���� ũ�Ⱑ �����Ǿ��ִ�, �迭 ���� �� ���� ũ�⸦ ����
 * 		 ���� ũ��� ���� �Ұ�
 * 
 * List<E> : �������̽�, ���ʸ� �������̽� : �پ��� ������ Ÿ���� ��밡��
  	- Ư¡: �ε���(Index ���ȣ)�� ������ �ִ�. ���� ũ��� �������� ��ȭ�Ѵ�.  
	- ArrayList<E> : �̱� ������ȯ�濡�� ���. �˻��� ������ ���� �߰��ϰų� �����Ҷ� ������.
	- Vector<E> : ��Ƽ ������ ȯ�濡�� ���. ���޼ҵ尡 ����ȭ �Ǿ��ִ�.
	- LinkedList<E> : �˻��� �������� ���� �߰��ϰų� �����Ҷ� ������.
*/
public class ArrayList_1 {
	public static void main(String[] args) {
	//1. �迭
		String array[]=new String[] {"��","��","��","��","��","��","��"};
		System.out.println(array.length);  //7
		array[2]=null;
		array[5]=null;
		System.out.println(array.length); 	//7
		
		//1.Arrays.toStrnig)(�迭����)
		System.out.println(Arrays.toString(array)); //Arrays.toString(�迭����)
		//2. for�� ���
		for(int i =0; i<array.length; i++) {
			if(i==array.length-1) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]+ " , ");
			}
		}
		System.out.println();
		//3. ���� for��
		for (String k: array) {
			System.out.print(k + " , ");
		}
	
		System.out.println();
	//2. List : �������̽� , ��ü������ �� �� ����, Ÿ���� ���� ����
		
		List<String> aList1= new ArrayList<String>();
		List<String> aList2= new ArrayList<>();
		List<String> aList3= new ArrayList();
		
		//List���� ���� ������� : aList.size();//size()���		//length:�迭���� ��� 
		
		System.out.println(aList1.size());  //���� ũ��� 0
		
		//List�� �� �Ҵ��ϱ� : aList.add(���Ҵ�); ���� �������� ���� �߰�
		aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");aList1.add("��");
		//List�� ����� �������� ���� ���ϱ� : aList.size()
		System.out.println(aList1.size());
		
		//List�� ����� ���� ���� : aList.remove("�����ҳ���")
		aList1.remove("��");
		aList1.remove("��");
		System.out.println(aList1.size());

		//List�� index�� ������ �ִ�. (1.for �� ���)
		for(int i =0; i<aList1.size(); i++) {
			System.out.print(aList1.get(i));
		}
		//2.���� for
		
		System.out.println();
		//3. ��ü�� toStrnig()�� ȣ���ؼ� ���
		System.out.println(aList1);		// List�� toStrnig�� ������ �Ǿ��ִ�.
		
		}
	}


