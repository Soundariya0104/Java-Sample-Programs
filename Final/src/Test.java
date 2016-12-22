
public class Test {
	int rollno;
	String name;

	final String college="Arunai";
	Test(int r,String n){
		rollno=r;
		name=n;
	}
void display(){
	System.out.println(rollno+""+name+""+college);
}
public static void main(String args[]){
	Test t1=new Test(111,"Ram");
	Test t2=new Test(222,"Sri");
	t1.display();
	t2.display();
}
}
