package Chap16.Ex04;

//제너릭 클래스 : 매개변수 (Argument : 2개 )
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
		//KeyValue<String,Integer> kv1= new KeyValue(); 생략해서도 쓸 수 있다. 
		kv1.setKey("사과");
		kv1.setValue(1000);
		
		System.out.println(kv1.getKey());
		System.out.println(kv1.getValue());
		System.out.println("==================");
		
		
		KeyValue<Integer, String> kv2= new KeyValue(); 
		kv2.setKey(404);
		kv2.setValue("Not Found(요청한 페이지를 찾을 수 없습니다.)");
		System.out.println(kv2.getKey());
		System.out.println(kv2.getValue());
		System.out.println("===================");
		
		KeyValue<String,Double> kv3= new KeyValue(); //소문자로 넣으면 안됨!!!!
		kv3.setKey("평균값");
		kv3.setValue(555.555);
		System.out.println(kv3.getKey());
		System.out.println(kv3.getValue());
		System.out.println("===================");
		
		//특정타입을 사용하지 않을 경우 Void (주의 :대문자임!!!)  Void : 메소드에서 리턴이 없을때 사용!
		KeyValue <String,Void> kv4=new KeyValue(); 
		kv4.setKey("키값만 사용");
		//kv4.setValue(11111); //Void 때문에 사용 불가
		System.out.println(kv4.getKey());
	}
	
	
}
