package com.newpackage;

import java.util.ArrayList;

public class ArrayListDemo {
	// store the heterogeneous elements  in list
	public static void main(String[] args) {
		
		
		ArrayList <String> list = new ArrayList<String>();
		list.add("first_name");
		list.add("last_name");
		list.add("middle|_name");
		
		System.out.println(list);  // using direct in sop.
		for (String add :list) {
			System.out.println(add);
		}
		
	}

}
