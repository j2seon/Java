package Chap16.Ex04;

//���ʸ� Ŭ���� : �Ű����� (Argument : 2�� )
class KeyValue<K,V>{
	private K Key;
	private V value;
	
	//getter,setter
	
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class TwoGenericArgument {

	public static void main(String[] args) {
		KeyValue<String,Integer> kv1= new KeyValue<String,Integer>(); 
		//KeyValue<String,Integer> kv1= new KeyValue(); �����ؼ��� �� �� �ִ�. 
		kv1.setKey("���");
		kv1.setValue(1000);
		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		System.out.println("==================");
		
		
		KeyValue<Integer, String> kv2= new KeyValue(); 
		kv2.setKey(404);
		kv2.setValue("Not Found(��û�� �������� ã�� �� �����ϴ�.)");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		System.out.println("===================");
		
		KeyValue<String,Double> kv3= new KeyValue(); //�ҹ��ڷ� ������ �ȵ�!!!!
		kv3.setKey("��հ�");
		kv3.setValue(555.555);
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		System.out.println("===================");
		
		//Ư��Ÿ���� ������� ���� ��� Void (���� :�빮����!!!)  Void : �޼ҵ忡�� ������ ������ ���!
		KeyValue <String,Void> kv4=new KeyValue(); 
		kv4.setKey("Ű���� ���");
		//kv4.setValue(11111); //Void ������ ��� �Ұ�
		System.out.println(kv4.getKey());
	}
	
	
}
