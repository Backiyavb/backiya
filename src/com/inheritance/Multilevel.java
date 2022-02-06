package com.inheritance;

public class Multilevel extends Inheritance{
	private void string() {
		char a = 'v';
		System.out.println(a);

	}
	public static void main(String[] args) {
		Multilevel b = new Multilevel();
		b.string();
		b.name();
		
	}

}
