package Chap17.Ex07;


//LinkedHashSet : ���� ������ �� �տ� ���� ������ �� ���� ��ġ������ ������ �ִ�.
	//HashSet�� ������ : ��� �޼ҵ尡 �����ϴ�. �ߺ��� ���� �������� �ʴ´�. ���ȣ(index)���� ������ �ʴ´�.
						//�⺻for������ ����� �� ����. Iterator, ���� for���� ����Ѵ�.
	//HashSet�� �ٸ��� : HashSet�� �Է´�� ��µ��� �ʴ´�. LinkedHashSet�� �Է´�� ��µȴ�.

//����Ű ���� Ȯ�� :Ctrl + Shift + L


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//Set : �������̽�, ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
	// - LinkedHashSet : �ߺ��� ���� ���� �� ����. ��½� ������� ��µȴ�.  
	// - TreeSet  : ����ɶ� ���� ������ �Ǿ ����. ascending (�������� ���ĵǾ� �����) 0 -> 9 a -> z, �� ->�� 
											//���� descending(�������� ����) : 9->0, z->a, ��->��

public class LinkedHashSetMethod {

	public static void main(String[] args) {

		Set<String> linkedset1 =new LinkedHashSet<>(); //Set�� Interface �̹Ƿ� Ÿ�����θ� ���� 
			//Set�� ���ʸ� Ÿ�Ժ����� WrapperŬ������ ����� ���, equals(),hashCode(),toString() �� ������ �Ǿ��ִ�. 
			
		//1. add(E element) : Set�� ���� �߰�
		linkedset1.add("��"); linkedset1.add("��");linkedset1.add("��");  //"��"�� �ߺ� ���� �ȵ�. �ι� �־����� �ȵȴ�~
		System.out.println(linkedset1);
		System.out.println(linkedset1.toString()); 	//toStrnig �޼ҵ尡 ������ �Ǿ� �ִ�.

		System.out.println("=================================");
		
		//2.addAll(�ٸ� set ��ü) : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰� : �ߺ��� ���� ���ŵ�.
		Set<String>linkedset2 = new HashSet();
		linkedset2.add("��");linkedset2.add("��"); //[��,��] 	//�Է°� ����� �����ϴ�/
		linkedset2.addAll(linkedset1);
		System.out.println(linkedset2);
		
		//3. remove(Object o) : ������ ����, (List �� ��� ���ȣ�� ����)
		linkedset2.remove("��");
		System.out.println(linkedset2);
		
		//4. clear() : ��λ���
		linkedset2.clear();
		System.out.println(linkedset2);
		
		//5. isEmpty() : ��������� true, ������� ������ false
		System.out.println(linkedset2.isEmpty());

		
		//6. contains(Object o) : ���� Set�� �����ϸ� true, ������ false
		Set<String>linkedset3 = new HashSet<>();
		linkedset3.add("��");linkedset3.add("��");linkedset3.add("��"); 
		System.out.println(linkedset3);
		System.out.println(linkedset3.contains("��"));  //false
		
		
		
		//7. size(): Set�� ���Ե� ���� ����
		System.out.println(linkedset3.size());

		System.out.println("===========iterator()�� ����� ���.===============");
		
		//8. iterator(): Set�� index�� ������ �ʴ´�. for���� ���ȣ�� ������ ����Ѵ�.����  for���� ��� xxx //but enhanced for���� ��밡��
					// ��ȸ��, Set�� ������ ��ȸ�ϸ鼭 ���.
					//hasNext(): Set�� ���� �����ϸ� true, �������� ������ false.
					// next() : ���簪�� ����ϰ� ���� ������ �̵� 
			Iterator<String> iterator = linkedset3.iterator();
				//Iterator Ŭ����<E> ������ü = Set��ü .iterator();
			while(iterator.hasNext()){
				System.out.print(iterator.next()+"  ");
			}System.out.println();
			System.out.println("============== ���� for�� ================");
			for(String k : linkedset3) {
				System.out.print(k+ "  ");
			}
			System.out.println();
			//toArray() : Set�� ������ �迭�� ������. object Ÿ������ ���� ���� �ٿ�ĳ������ �ʿ��ϴ�.
			Object[] obj = linkedset3.toArray();
			System.out.println(Arrays.toString(obj)); //�����ϰ� ���
			
			//for�� ���
			for(int i=0; i<obj.length; i++) {
				System.out.print(obj[i]);
			}
			System.out.println();
			//���� for��
			for(Object k : obj) {		//�ٿ�ĳ������ �ʿ��ϴ�.
				System.out.print(k);
			}
			System.out.println();
			
			//10.  toArray(T[] t) : �ٷ� �ٿ� ĳ������ �� �� ���.
			String[] strArray = linkedset3.toArray(new String[0]);  //0�� ���� ũ�⸦ ����.
														   // ���� ũ�Ⱑ ���� ������ ���� ��� ���� ũ�⸸ŭ ����.
			System.out.println(Arrays.toString(strArray));
			
			
			//11. ���� Set�� ������ ���� ũ�⸦ ũ�� ���� ���� null�� ��� �� �� �ִ�.
				String[] strArray2 = linkedset3.toArray(new String[5]);  //0�� ���� ũ�⸦ ����.
			// ���� ũ�Ⱑ ���� ������ ���� ��� ���� ũ�⸸ŭ ����.
				System.out.println(Arrays.toString(strArray2));

	
	
			//12 
				Set<Integer> inSet1 =new LinkedHashSet();
				inSet1.add(30);inSet1.add(50);inSet1.add(10);inSet1.add(100);
				Iterator<Integer> iterator1 = inSet1.iterator();
				while(iterator1.hasNext()) {
					System.out.print(iterator1.next()+"  ");
				}
				System.out.println();
				for(Integer kk: inSet1) {
					System.out.print(kk+ "  ");
				} 
				
 	}
	

}


