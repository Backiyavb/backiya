package com.Polymorphisam;

public class Overloading {
String empname="pavin";
	private void bank() {
		System.out.println(empname);
	}
	public void bank(int id) {
		System.out.println(id);
	}
	
	public void bank(String s) {
		
		System.out.println(s);
	}
	public void bank(String s,int id) {
		System.out.println(s+" "+id);
	}
	public static void main(String[] args) {
		Overloading s=new Overloading();
		s.bank();
		s.bank(1);
		s.bank("pavin");
		s.bank("pavin", 2);
	}
}
