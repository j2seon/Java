package Chap10.Ex07.EX02;

class AA{
	int time;
	AA(int time){
		this.time=time;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.time==((AA)obj).time) {
			return true;
		}else {
			return false;
		}
	}
}

public class ObjectMethod_equals2 {

	public static void main(String[] args) {
		AA a =new AA(3);
		AA b =new AA(5);
		System.out.println(b.equals(a));
		
		
	}

}
