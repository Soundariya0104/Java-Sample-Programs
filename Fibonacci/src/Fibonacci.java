import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[])  
	{    
	 int n1=0,n2=1,n3; 
	 Scanner r=new Scanner(System.in);
	 System.out.println("enter the number:" );
	 int count=r.nextInt();
	 
	 System.out.print(n1+" "+n2);//printing 0 and 1    
	    
	 for(int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
	}
}
