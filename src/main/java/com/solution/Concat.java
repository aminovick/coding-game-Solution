package com.solution;

import java.util.ArrayList;
import java.util.List;

public class Concat {

	public static void main(String[] args) {
		String[] array= {"f","o","o","bar"};
		System.out.println(concat(array));
		List list=new ArrayList<Integer>(2);
		list.add(1);
		list.add(1);
		list.add(1);
		System.out.println(list.size());
	}
	
	static String concat(String [] strings) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<strings.length;i++) {
		sb.append(strings[i]);
			
		}
		
		
		return sb.toString();
		
	}
}
