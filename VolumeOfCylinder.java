import java.util.Scanner;

public class VolumeOfCylinder {
	public static void main(String args[]){
		double r,h;
		final double PI=3.14;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the radius:");
		r=in.nextDouble();
		System.out.println("enter the height");
		h=in.nextDouble();
		
		double volume=(PI*r*r*h);
		System.out.println("Volume of the Cylider:" +volume);
		
	}

}
