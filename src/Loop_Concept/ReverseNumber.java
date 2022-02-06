package Loop_Concept;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter The Value");
		int Value = a.nextInt();
		int i = 0 , j = 0;
		while(Value>0)
		{
			i=Value%10;//5 4 3 2  1 
			j=(j*10)+i;//5 54 543 5432 54321
			Value=Value/10;//1234 123 12 1 0
			
		}
		System.out.println("Reverse Number Is" + j);
	}
	

	
}
