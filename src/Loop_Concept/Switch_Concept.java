package Loop_Concept;

import java.util.Scanner;

public class Switch_Concept {
public static void main(String[] args) {
	for (int i = 0; i < 3; i++) {
		System.out.println("Enter The Marks");
		Scanner a = new Scanner(System.in);
		int mark = a.nextInt();
		switch(mark)
		{
		case 90 :
			System.out.println("A grade");
			break;
		case 80 :
			System.out.println("B grade");
			break;
		case 70 :
			System.out.println("C grade");
			break;
		case 60 :
			System.out.println("D grade");
			break;
		case 40 :
			System.out.println("Fail");
			break;
		}
	
		
	}
}
}
