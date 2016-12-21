
public class SimpleClassEx {
	public String s="simple class";

	public void getS() {
		System.out.println(s);
	}

	public void setS(String s) {
		this.s = s;
	}
	
}



class MainClass
{
	public static void main(String[] args)
	{
		SimpleClassEx sim=new SimpleClassEx();
		sim.setS("this is simple class example");
		sim.getS();
		System.out.println("sim:" +sim);
		
		SimpleClassEx sim1=new SimpleClassEx();
		System.out.println("sim1: " +sim1);
	}
	
}

