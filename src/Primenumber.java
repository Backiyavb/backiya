import java.util.Scanner;

public class Primenumber {
	
public static void main(String[] args) {
	
Scanner s = new Scanner(System.in);
System.out.println("Enter Number");

int i =s.nextInt();

//for (int i = 1; i < 50; i++) {
	
	int k=0;
	
for (int j = 2; j <50; j++) {
	if(i%j==0)
	{
		k=k+1;
		
}
}
	if(k==1)
{
	System.out.println("Primenumber");
}else
{System.out.println("Non Prime number");
}
}
}