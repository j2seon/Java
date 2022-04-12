package Chap16.Ex04;


class Cafe<K,V,A,B>{
	private K key;
	private A key2;
	private V value;
	private B value2;
	public A getKey2() {
		return key2;
	}
	public void setKey2(A key2) {
		this.key2 = key2;
	}
	public B getValue2() {
		return value2;
	}
	public void setValue2(B value2) {
		this.value2 = value2;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
}

public class exer {
	public static void main(String[] args) {
		Cafe<String,String,Integer,Integer> menu =new Cafe();
		menu.setKey("초코케이크");
		menu.setValue("아메리카노");
		menu.setKey2(6000);
		menu.setValue2(3000);
		String chocoset=menu.getValue()+ "와 " + menu.getKey();
		int setprice=(int)menu.getKey2()+menu.getValue2();
		
		System.out.println(chocoset +" "+setprice + "원");
		
		
		
	}

}
