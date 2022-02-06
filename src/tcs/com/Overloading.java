package tcs.com;

public class Overloading {
	public void empdetails() {
		String D = "pavithra";
		System.out.println(D);
		

	}
	
	public void empdetails(int a) {
		
		System.out.println(a);
	}
	
	public void empdetails(String S , int r)
	{
		System.out.println("name "+S +" "+ "age "+r);

	}
public static void main(String[] args) {
	Overloading t = new Overloading();
	t.empdetails();
	t.empdetails(5);
	t.empdetails("Pavithra", 23);
	
}
}
