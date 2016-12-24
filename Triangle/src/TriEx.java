import java.util.Scanner;

public class TriEx {
	public static void main(String arg[]){
		int a=0;
		 Scanner r=new Scanner(System.in);
		 System.out.println("enter the number:" );
		 int count=r.nextInt();
		 for(int i=1;i<=count;i++)
		 {
			 for(int c=1;c<=i;c++)
			 {
				 System.out.print("*");
				 a++;
			 }
			 System.out.println("");
		 }
		
	}
}
