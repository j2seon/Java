package Chap13.Ex05;


class A {		//A.class
	void abc(){
		class B{}		//A$1B.class
		class C{}		//A$1C.class
	}
	void bcd() {		
		class C{}		//A$2C.class
		class D{}		//A$1.Dclass
		}
	void cde() {
		class B{} 		//A$2B.class 
		class C{} 		//A$3C.class
	}
}



public class InnerClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
