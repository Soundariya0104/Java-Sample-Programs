import java.util.Scanner;
 
public class Swap
{  
    public static void main(String[] args) 
    {    
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter First String :");
         
        String s1 = sc.next();
         
        System.out.println("Enter Second String :");
         
        String s2 = sc.next();
         
        System.out.println("Before Swapping :");
         
        System.out.println("s1 : "+s1);
         
        System.out.println("s2 : "+s2);
         
        //Swapping starts
         
        s1 = s1 + s2;
         
        s2 = s1.substring(0, s1.length()-s2.length());
         
        s1 = s1.substring(s2.length());
         
        //Swapping ends
         
        System.out.println("After Swapping :");
         
        System.out.println("s1 : "+s1);
         
        System.out.println("s2 : "+s2);
    }    
}