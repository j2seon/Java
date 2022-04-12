package Chap17.Ex01.EX1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Chap16.Ex05.Obeject_Generic;

public class Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList<>();
		li.add(1);li.add(2);li.add(3);li.add(4);
		System.out.println(li);
		ArrayList<String> a1 = new ArrayList<>(10);
		a1.add("진선");a1.add("강은");a1.add("현아");a1.add("지은");
		System.out.println(a1);
	

		
		Integer[] itg = li.toArray(new Integer[0]);
		System.out.println(Arrays.toString(itg));
		
		Object[] ob1 = a1.toArray();
		System.out.println(Arrays.toString(ob1));
		
		String[] str = a1.toArray(new String[5]);
		System.out.println(Arrays.toString(str));
		
		
	}

}
