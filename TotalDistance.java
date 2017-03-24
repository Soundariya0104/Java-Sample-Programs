import java.util.Scanner;

public class TotalDistance {
	public static void main(String args[]){
		double u,a,t;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the intial velociy");
		u=in.nextDouble();
		System.out.println("enter the acceleration");
		a=in.nextDouble();
		System.out.println("enter the time");
		t=in.nextDouble();
		double distance=u*t+((a*t*t)/2);
		System.out.println("distance:" +distance);
	}

}
