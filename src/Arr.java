
public class Arr {

	public static void main(String[] args) {
		
		int a[]= {5,2,8,7,6};
		
//		for(int i =0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		//ascending order
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
				{
				int k = a[j];
				 a[j]= a[i];
				a[i]=k;
					
			}
			}
			}
				for(int d = 0;d<a.length;d++)
				{
					System.out.println(a[d]);
				}
		}
		
}
