package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Arraylist {
	
	public static void main(String[] args) {
		
		List<Integer> a =new ArrayList<Integer>();
		
		a.add(11);
		a.add(1);
		a.add(13);
//		System.out.println(a);
		ListIterator<Integer> i = a.listIterator();
//		while (i.hasNext()) {
//			Integer next = i.next();
//			System.out.println(next);
//			
//		}
		while (i.hasNext()) {
			
			System.out.println("*"+i.next());
		}
		while (i.hasPrevious()) {
		
			System.out.println("="+i.previous());
		}
		
//		System.out.println(a.size());
//		
//		Integer a1 = a.get(2);
//		
//		System.out.println(a1);
//		
//		Collections.sort(a);
//		System.out.println(a);
//		
//		Collections.sort(a,Collections.reverseOrder());
//		System.out.println(a);
//		
//		
//		Integer set = a.set(2, 15);
//		System.out.println(a);
//		Integer r1 = a.remove(1);
//		System.out.println(a);
//		int a3 = a.indexOf(11);
//		System.out.println(a3);
//	
//	boolean c1 = a.contains(13);
//	System.out.println(c1);
//	
//	a.clear();
//	System.out.println(a);
//	
	
	}

}
