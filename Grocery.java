import java.util.Scanner;

public class Grocery {

	public float weight;
	public void weightNow(float wt){
		weight=wt;
	}
	public void checkWeight(){
		System.out.println("Weight :"+weight);
	}
	public static void main(String args[]){
		Grocery obj=new Grocery();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter weight :");
		float wt=scan.nextFloat();
		obj.weightNow(wt);
		obj.checkWeight();
		
		
	}
}
