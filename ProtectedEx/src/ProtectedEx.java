
public class ProtectedEx {
	protected int x=35;
	public void showDemo(){
		System.out.println("the variable value is:"+x);
		
		}
}
class ChildAccess extends ProtectedEx{
	}
class Test{
	public static void main(String args[]){
		ChildAccess ca=new ChildAccess();
		ca.showDemo();
		
	}
	
}


