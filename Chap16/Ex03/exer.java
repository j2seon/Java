package Chap16.Ex03;

class JJS<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class exer {
	public static void main(String[] args) {
		JJS<String> jjs1= new JJS<String>();
		jjs1.setT("Áø¼±");
		System.out.println(jjs1.getT());
		
		JJS<Integer> jjs2= new JJS<Integer>();
		jjs2.setT(27);
		System.out.println(jjs2.getT());
	}

}
