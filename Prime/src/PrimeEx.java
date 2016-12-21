import java.util.Scanner;

public class PrimeEx {  
		 public static void main(String args[]){  
		  int i,flag=0;    
		  Scanner r=new Scanner(System.in);
			 System.out.println("enter the number:" );
			 int count=r.nextInt();    
		  for(i=2;i<=count/2;i++){    
		   if(count%i==0){    
		   System.out.println("Number is not prime");    
		   flag=1;    
		   break;    
		   }    
		  }    
		  if(flag==0)    
		  System.out.println("Number is prime");    
		}  
		}  
