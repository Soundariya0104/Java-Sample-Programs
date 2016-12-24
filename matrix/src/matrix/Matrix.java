package matrix;

public class Matrix {

	public static void main(String args[]){
	for(int j=0;j<3;j++){
		
		for(int i=0;i<3;i++)
		{
			if(i==j)
			{
				System.out.print(1+" ");
				continue;
			}
			System.out.print(0+" ");
		}
		System.out.println();
}
}
}