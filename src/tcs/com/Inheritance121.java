package tcs.com;

public class Inheritance121 extends Inheritance12{
	public void age() {
		int  age = 25;
		System.out.println(age);

	}

	public static void main(String[] args) {
		Inheritance121 D = new Inheritance121();
		D.name();
		
		D.age();
	}
}
