package Loop_Concept;

//import java.util.Scanner;

public class Fibanacci {
public static void main(String[] args) {
	//Scanner b = new Scanner(System.in);
	int i=0,j=1;
	System.out.print(i +" " +j+ " ");
	for (int j2 = 0; j2 <8; j2++) {
		int a;
		a=i+j;
		i=j;
		j=a;
		System.out.print(a+" ");
		
	}
	
}
}
