 class MyException extends Exception {
	MyException(String s){
	 super(s);}
}

 public class UserDefinedException{
	
	 static void validate(int age) throws MyException{
		 if(age<20){
			 throw new MyException("invalid");
		 }else{
			 System.out.println("welcome");
		 }
	 }
	 public static void main(String args[]){
	
	try{
		int age=6;
		validate(age);

	}
		catch(Exception e){
			System.out.println("invaid age: "+e);
			
		}
	}

}
