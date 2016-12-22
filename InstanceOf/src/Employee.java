
public class Employee {

}
class Manager extends Employee{
	
}
class MyClass{
	public static void main(String args[]){
		Employee emp=new Manager();
		if(emp instanceof Employee)
		{
			System.out.println("Hello");
		}
		else{
			System.out.println("Sorry");
		}
	}
}
