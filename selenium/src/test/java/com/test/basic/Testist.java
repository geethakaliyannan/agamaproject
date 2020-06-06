package com.test.basic;

import java.util.ArrayList;
import java.util.List;

public class Testist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer> ();
		list.add(0,100);
		list.add(1,300);
		list.add(2,500);
		list.add(3,700);
		System.out.println(list);
		list.remove(3);
		System.out.println(list.get(2));
		list.set(3,5);
		System.out.println(list);

	}

}
