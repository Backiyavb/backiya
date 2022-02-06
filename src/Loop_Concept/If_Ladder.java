package Loop_Concept;

import java.util.Scanner;

public class If_Ladder {
	public static void main(String[] args) {
		
	for (int i = 0; i <5; i++) {
	System.out.println("Enter The Marks");
	Scanner A = new Scanner(System.in);
	int Marks = A.nextInt();
	if(Marks<50)
	{
		System.out.println("Fail");
	}else if(Marks>=50 && Marks<60)
	{
		System.out.println("D grade");
	}else if(Marks>=60 && Marks<70)
	{System.out.println("C Grade");
	}
	else if(Marks>=70 && Marks<80)
	{System.out.println("B Grade");
	}
	else if(Marks>=80 && Marks<90)
	{System.out.println("A Grade");
	
	}
	else if(Marks>=90 && Marks<100)
	{System.out.println("S Grade");
}
	}
	}
}