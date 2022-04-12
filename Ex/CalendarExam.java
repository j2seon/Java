package Ex;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // new 로 상속받는 클래스로 구현하지 않음 
												// 나중에 다른 표준 달력이 추가 되었을때 변경시키지 않고 calendar의 instance 를 get하면됨!!!
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //0~11까지 여서 +1을 무조건한다.
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
//		cal.add(Calendar.HOUR,-5); //add를 이용해서 원하는 시간으로 바꿀수도있다.
//		System.out.println(cal.get(Calendar.HOUR));
		cal.add(Calendar.DATE,100);
		int yyyy = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH)+1;
	    
	    int date = cal.get(Calendar.DATE);
	    
	    System.out.println(yyyy+"년"+month+"월"+date+"일");
		
		
		
	}

}
