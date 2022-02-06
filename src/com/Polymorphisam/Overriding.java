package com.Polymorphisam;

public class Overriding extends MethodOverriding{
	
	public void name() {
		super.name();
		String s="backiya";
		System.out.println(s);
	}
	public static void main(String[] args) {
		Overriding s=new Overriding();
		s.name();
	}
}
