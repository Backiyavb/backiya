package com.Collection;

import java.util.Collections;
import java.util.HashSet;

public class Set {

		
		public static void main(String[] args) {
			
			HashSet<Integer> a =new HashSet <Integer>();
			
			a.add(11);
			a.add(12);
			a.add(13);
			System.out.println(a);
			
			System.out.println(a.size());    
			
		boolean c1 = a.contains(13);
		System.out.println(c1);
		
		a.clear();
		System.out.println(a);
		
//		Collections.sort(a);
		
		
		}

	}
