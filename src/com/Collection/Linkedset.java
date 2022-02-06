package com.Collection;

import java.util.LinkedHashSet;
import java.util.Set;
public class Linkedset {


	public static void main(String[] args) {
		
		Set<Integer> a =new LinkedHashSet <Integer>();
		
		a.add(11);
		a.add(12);
		a.add(13);
		System.out.println(a);
		
		System.out.println(a.size());    
		
	boolean c1 = a.contains(13);
	System.out.println(c1);
	
	a.clear();
	System.out.println(a);
	
}
}