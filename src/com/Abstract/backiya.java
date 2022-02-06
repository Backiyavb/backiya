package com.Abstract;

public class backiya extends partial_abstract {

	@Override
	public void username() {
		System.out.println("Backiya");
		
	}
	@Override
	public void password() {
		System.out.println(12345);
		
	}
	@Override
	public void age(String i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		backiya r = new backiya();
		r.username();
		r.password();
		r.age("16-12-2020");
		r.doctor();
	}
}
