package Ex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timePoint =LocalDateTime.now();//���� �� ������ ��¥�ð�!!!
		System.out.println(timePoint);
		
		//���ϴ� �ð��� ���� ����!
		LocalDate localdate = LocalDate.of(2012, 12, 12);
		System.out.println(localdate);
		//���ϴ� �ð�
		LocalTime localdatet = LocalTime.of(12, 18);
		System.out.println(localdatet);
		
		LocalTime localdatet1 = LocalTime.parse("10:15:30");
		System.out.println(localdatet1);

		//�����ϸ�! ǥ�� calender���޸�+�� ���� �ʾƵ� ���� ����� ǥ�õȴ�.
		LocalDate date = timePoint.toLocalDate();
		System.out.println(date);
		Month mon =timePoint.getMonth();
		System.out.println(timePoint.getMonthValue());
		System.out.println(timePoint.getMonth());
		System.out.println(mon);
		System.out.println(timePoint.getHour());
		
		LocalDateTime timePoint1 = LocalDateTime.now();  // ������ ��¥�� �ð�

		LocalDate theDate = timePoint1.toLocalDate();
		Month month = timePoint1.getMonth();
		System.out.println(month);
		
		
	}

}
