package Ex;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // new �� ��ӹ޴� Ŭ������ �������� ���� 
												// ���߿� �ٸ� ǥ�� �޷��� �߰� �Ǿ����� �����Ű�� �ʰ� calendar�� instance �� get�ϸ��!!!
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1); //0~11���� ���� +1�� �������Ѵ�.
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
//		cal.add(Calendar.HOUR,-5); //add�� �̿��ؼ� ���ϴ� �ð����� �ٲܼ����ִ�.
//		System.out.println(cal.get(Calendar.HOUR));
		cal.add(Calendar.DATE,100);
		int yyyy = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH)+1;
	    
	    int date = cal.get(Calendar.DATE);
	    
	    System.out.println(yyyy+"��"+month+"��"+date+"��");
		
		
		
	}

}
