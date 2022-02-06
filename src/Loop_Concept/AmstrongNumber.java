package Loop_Concept;

import java.util.Scanner;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner A= new Scanner(System.in);
		System.out.println("Enter The Number");
		int Z = A.nextInt();
		int i=Z,B=0,C=0;
		while(i>0)
		{
			B=i%10;
			C=(B*B*B)+C;
			i=i/10;
		}
		System.out.println(C);
	}
	

}
