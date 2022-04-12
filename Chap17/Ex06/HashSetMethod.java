package Chap17.Ex06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set : �������̽�, ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
	// - HashSet 	: �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�.
	// - LinkedHashSet : �ߺ��� ���� ���� �� ����. ��½� ������� ��µȴ�.  
	// - TreeSet  : ����ɶ� ���� ������ �Ǿ ����. ascending (�������� ���ĵǾ� �����) 0 -> 9 a -> z, �� ->�� 
											//���� descending(�������� ����) : 9->0, z->a, ��->��

public class HashSetMethod {

	public static void main(String[] args) {

		Set<String> hSet1 =new HashSet<>(); //Set�� Interface �̹Ƿ� Ÿ�����θ� ���� 
	
		//1. add(E element) : Set�� ���� �߰�
		hSet1.add("��"); hSet1.add("��");hSet1.add("��");  //"��"�� �ߺ� ���� �ȵ�. �ι� �־����� �ȵȴ�~
		System.out.println(hSet1);
		System.out.println(hSet1.toString()); 	//toStrnig �޼ҵ尡 ������ �Ǿ� �ִ�.
		
		//addAll(�ٸ� set ��ü) : �ڽ��� Set�� �ٸ� Set�� ����� ���� �߰� : �ߺ��� ���� ���ŵ�.
		Set<String>hSet2 = new HashSet();
		hSet2.add("��");hSet2.add("��");
		hSet2.addAll(hSet1);
		System.out.println(hSet2);
		
		//3. remove(Object o) : ������ ����, (List �� ��� ���ȣ�� ����)
		hSet2.remove("��");
		System.out.println(hSet2);
		
		//4. clear() : ��λ���
		hSet2.clear();
		System.out.println(hSet2);
		
		//5. isEmpty() : ��������� true, ������� ������ false
		System.out.println(hSet2.isEmpty());

		
		//6. contains(Object o) : ���� Set�� �����ϸ� true, ������ false
		Set<String>hSet3 = new HashSet<>();
		hSet3.add("��");hSet3.add("��");hSet3.add("��"); 
		System.out.println(hSet3);
		System.out.println(hSet3.contains("��"));  //false
		
		
		
		//7. size(): Set�� ���Ե� ���� ����
		System.out.println(hSet3.size());

		System.out.println("===========iterator()�� ����� ���.===============");
		
		//8. iterator(): Set�� index�� ������ �ʴ´�. for���� ���ȣ�� ������ ����Ѵ�.����  for���� ��� xxx //but enhanced for���� ��밡��
					// ��ȸ��, Set�� ������ ��ȸ�ϸ鼭 ���.
					//hasNext(): Set�� ���� �����ϸ� true, �������� ������ false.
					// next() : ���簪�� ����ϰ� ���� ������ �̵� 
			Iterator<String> iterator = hSet3.iterator();
				//Iterator Ŭ����<E> ������ü = Set��ü .iterator();
			while(iterator.hasNext()){
				System.out.print(iterator.next()+"  ");
			}System.out.println();
			System.out.println("============== ���� for�� ================");
			for(String k : hSet3) {
				System.out.print(k+ "  ");
			}
			System.out.println();
			//toArray() : Set�� ������ �迭�� ������. object Ÿ������ ���� ���� �ٿ�ĳ������ �ʿ��ϴ�.
			Object[] obj = hSet3.toArray();
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
			String[] strArray = hSet3.toArray(new String[0]);  //0�� ���� ũ�⸦ ����.
														   // ���� ũ�Ⱑ ���� ������ ���� ��� ���� ũ�⸸ŭ ����.
			System.out.println(Arrays.toString(strArray));
			
			
			//11. ���� Set�� ������ ���� ũ�⸦ ũ�� ���� ���� null�� ��� �� �� �ִ�.
				String[] strArray2 = hSet3.toArray(new String[5]);  //0�� ���� ũ�⸦ ����.
			// ���� ũ�Ⱑ ���� ������ ���� ��� ���� ũ�⸸ŭ ����.
				System.out.println(Arrays.toString(strArray2));

	
	
			//12 
				Set<Integer> inSet1 =new HashSet<>();
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


