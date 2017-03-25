import java.util.Scanner;

 class FixedAccount{
	double amount;
	double rate;
	double time;
	public void calculateInterest(){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the amount");
	amount=scan.nextDouble();
	System.out.println("enter the rate");
	rate=scan.nextDouble();
	System.out.println("enter the time:");
	time=scan.nextDouble();
	double calculate=(amount*rate*time)/100;
	System.out.println(calculate);
	
	}
}
 class SavingsAccount extends FixedAccount  {
	public void calculateInterest(){
		
		super.calculateInterest();
	

}}
public class Account{
	public static void main(String args[]){
		FixedAccount fa=new SavingsAccount();
		fa.calculateInterest();
	}
}