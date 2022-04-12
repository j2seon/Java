package Chap16.Ex13;

import java.lang.reflect.GenericSignatureFormatError;

//������ ��ǥ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���. ���ʸ��޼ҵ带 ���.

class Point<T,V>{ //������ ��ǥ�� ��� Ŭ���� 
	T x; 	//�� ���� x ��ǥ 
	V y;	//�� ���� y��ǥ
	Point(T x,V y){ //������. Setter ��� �����ڷ� ������ ���� �Ҵ��Ѵ�. 
		this.x=x;
		this.y=y;
	}
	public T getX() {
		return x;
	} 
	public V getY() {
		return y;
	}
}

class GenericMethod {
	public static <T, V> double makeRectangle (Point<T,V> p1 , Point<T,V> p2) {
		double width = (double)p2.getX() - (double)p1.getX();
		double height = (double)p2.getY() - (double)p1.getY();
		return width * height ; //���� * ���� = ���� 
	}
}


public class EX_Make_Rectangle {
	public static void main(String[] args) {
		 Point <Double, Double> p1 = new Point<Double, Double>(1.0,2.0);
		 Point <Double, Double> p2 = new Point<Double, Double>(10.0,50.0);
		 
		 double rect = GenericMethod.<Double,Double> makeRectangle(p1, p2);
		 System.out.println("�� ���� ���̴� : "+rect+"�Դϴ�." );
	}

}