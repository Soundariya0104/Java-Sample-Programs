import java.util.Scanner;

public class EmployeeBook {
	public static void main(String args[]){
		int choice;
		System.out.println("1.Enter Data");
		System.out.println("2.Display Data");
		System.out.println("3.Exit");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Choice");
		choice=scan.nextInt();
		
		
		switch(choice){
		case 1:
			System.out.println("Enter Data");
			enterData();
			break;
		case 2:
			System.out.println("Display Data");
			displayData();
			break;
			case 3:
				System.out.println("Exit");
				exit();
				break;
				default:
					System.out.println("not an option");
		}
	}

	private static void exit() {
		System.out.println("inside exit method");
		
	}

	private static void displayData() {
		System.out.println("inside display data method");
		
	}

	private static void enterData() {
		System.out.println("inside enter data method");
		
	}

}
