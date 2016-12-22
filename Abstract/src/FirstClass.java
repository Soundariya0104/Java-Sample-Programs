
abstract class FirstClass {
	abstract void disp();
	abstract void delete();
	void display()
	{
		System.out.println("Hello");
	
	}

}
class SecondClass extends FirstClass
{
	void disp(){
		System.out.println("display");
	}
	void delete(){
		System.out.println("delete");
	}
}
class Test
{
	public static void main(String args[])
	{
		FirstClass obj=new SecondClass();
		obj.display();
		obj.delete();
		obj.disp();
		
	}
}
