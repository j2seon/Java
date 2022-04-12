package Chap16.Ex13;

class Points<T,K>{
	T x;
	K y;
	Points(T x, K y){
		this.x=x;
		this.y=y;
	}
	public T getX() {
		return x;
	}
	public K getY() {
		return y;
	}
	
}

class Cal{
	public static <T,K> double cal(Points<T,K> pp1,Points<T,K> pp2) {
		double width1=(double)pp2.getX()-(double)pp1.getX();
		double height1=(double)pp2.getY()-(double)pp1.getY();
		return width1 * height1;
	}
}



public class Exer {

	public static void main(String[] args) {
		Points <Double,Double> pp1 =new Points(2.0,1.0);
		Points <Double,Double> pp2 =new Points(5.0,10.0);
		
		double result=Cal.<Double,Double>cal(pp1, pp2);
		
		
	}

}
