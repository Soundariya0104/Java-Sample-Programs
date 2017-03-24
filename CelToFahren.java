import java.util.Scanner;

public class CelToFahren {
public static void main(String args[]){
	double f,c;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the celsius:");
	c=scan.nextDouble();
	f=c*(9/5)+32;
	System.out.println("the fahrenheit value is:" +f);
		
	
}
}
