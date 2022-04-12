package Chap02;
public class NamingVariableAndConstant {
	public static void main(String[] args) {
		//변수명
		boolean aBcD;  //변수명은 첫자는 소문자로 시작한다, 단어를 연결한 경우 첫단어는 대문자로
		byte 가나다라;  //변수명은 한글을 넣을 수 있다. (권장하지 않음)
		short _abcd; //_를 특수문자로 사용할 수 있다.
		char $ab_cd; //$를 사용할 수 있다. 공백은 사용 불가능
		long abcd3; //변수명에 숫자를 넣을 수 있다. 단, 첫번째 단어에 숫자가 오면 안됌.
		double main; 
		//double class; // JAVA에서 사용하는 예약어들은 면수명으로 사용할 수 없다.
		int ABCD; //변수명은 대문자를 넣을 수 있다. (권장하지 않음 : 변수,상수 구분을 위함.), 상수는 상수명을 전체 대문자로 사용.
		
		//상수: 값을 변경할 수 없다. final키워드를 사용한다, 상수이름을 대문자로 사용
		final double PI;
		final int MY_DATA;
		final float my_Data; //권장하지 않음.
		
		PI= 3.141957;
		System.out.println(PI);
		
		//PI=123.4567; // 상수에는 값을 재할당 할 수 없다.
		
		abcd3 = 1234L; //정수 데이터 타입 long변수에 값을 할당할 때, 소문자 l 대문자 L을 명시해야함.
		System.out.println(abcd3);
		abcd3 = 56789l; //변수의 값을 재할당.
		System.out.println(abcd3);
	
		aBcD= true; //true or false만 가능하다.
		
		가나다라 = 127; //byte는 -128~127까지 가능하다.
		System.out.println(가나다라);
		//가나다라 = 128; 127까지기 때문에 128은 오류발생함.
		
	
		
		
		
	}

}
