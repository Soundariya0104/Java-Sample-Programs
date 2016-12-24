import java.util.Scanner;

public class PalinEx {
	public static void main(String args[]){
		String s1="";
		Scanner r=new Scanner(System.in);
		 System.out.println("enter the String:" );
		 String s=r.nextLine();
		 
		 int length=s.length();
		 for(int i=length-1;i>=0;i--)
			 s1=s1+s.charAt(i);
		 if(s.equals(s1))
		 {
			 System.out.println("Palindrome");
		 }
		 else
{
			 System.out.println("not palindrome");
		 }
	}
	
}