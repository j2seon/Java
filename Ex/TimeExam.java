package Ex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timePoint =LocalDateTime.now();//현재 내 지역의 날짜시간!!!
		System.out.println(timePoint);
		
		//원하는 시간에 대한 정보!
		LocalDate localdate = LocalDate.of(2012, 12, 12);
		System.out.println(localdate);
		//원하는 시간
		LocalTime localdatet = LocalTime.of(12, 18);
		System.out.println(localdatet);
		
		LocalTime localdatet1 = LocalTime.parse("10:15:30");
		System.out.println(localdatet1);

		//연월일만! 표시 calender과달리+를 하지 않아도 월이 제대로 표시된다.
		LocalDate date = timePoint.toLocalDate();
		System.out.println(date);
		Month mon =timePoint.getMonth();
		System.out.println(timePoint.getMonthValue());
		System.out.println(timePoint.getMonth());
		System.out.println(mon);
		System.out.println(timePoint.getHour());
		
		LocalDateTime timePoint1 = LocalDateTime.now();  // 현재의 날짜와 시간

		LocalDate theDate = timePoint1.toLocalDate();
		Month month = timePoint1.getMonth();
		System.out.println(month);
		
		
	}

}
