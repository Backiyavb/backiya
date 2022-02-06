package tcs.com;

public class overriding12 extends overriding {
	@Override
	public void bankdetails(long A) {
		// TODO Auto-generated method stub
		super.bankdetails(A);
		System.out.println(A);
	}
	@Override
	public void ac() {
		// TODO Auto-generated method stub
		System.out.println("ac");
		
	}

	
	public static void main(String[] args) {
		overriding12 i = new overriding12();
		i.bankdetails(123456987);
		i.ac();

	
	}
}
