package Chap17.Ex01.EX1;

import java.util.ArrayList;
import java.util.List;

public class Exer {

	public static void main(String[] args) {

		List<String> alist = new ArrayList<>();
		alist.add("�ȳ�");
		alist.add("�ϼ���");
		alist.add("����");
		System.out.println(alist);
		System.out.println(alist.size());
		
		alist.remove("����");
		System.out.println(alist);
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i));
		}
	}

}
