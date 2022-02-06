package com.Abstract;

public class Interface1 implements Interface{

	@Override
	public void name() {
		// TODO Auto-generated method stub
	System.out.println("name");	
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
	System.out.println("s");	
	}

	@Override
	public void h() {
		// TODO Auto-generated method stub
		System.out.println("c");	
	}
public static void main(String[] args) {
	Interface1 a = new Interface1();
	a.name();
	a.m();
	a.h();
	
}
}
