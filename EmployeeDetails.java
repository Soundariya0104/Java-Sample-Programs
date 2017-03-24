import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String args[]){
		int option  ;
		System.out.println("--------MENU--------");
		System.out.println("1.Summer");
		System.out.println("2.Spring");
		System.out.println("3.Autumn");
		System.out.println("4.Winter");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice:");
	      option=scan.nextInt();
	      
	      
switch(option){
case 1:
	System.out.println("Summer");
	break;
case 2:
	System.out.println("Spring");
	break;
case 3:
	System.out.println("Autumn");
	break;
case 4:
	System.out.println("Winter");
	break;
	default:
		System.out.println("not an option");
}
	}
}
