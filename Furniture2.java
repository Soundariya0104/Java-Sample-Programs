 abstract class FurnitureDemo {

  protected String color;
  protected int width;
  protected int height;
  public abstract void accept();
  public abstract void display();
 }
     class chair extends FurnitureDemo {
  private int numOf_legs;

  public void accept() {

  color = "Brown";
  width = 36;
  height = 48;
  numOf_legs = 4;
 }
    public void display()    {
  System.out.println("DISPLAYING VALUE FOR CHAIR");
  System.out.println
 ("==================================");
  System.out.println("Color is" + color);
  System.out.println("Width is" + width);
  System.out.println("Height is" + height);
  System.out.println("Number of legs is" + numOf_legs);
  System.out.println(" ");
  }
 }

 class Bookshelf extends FurnitureDemo {

  private int numOf_shelves;
  
  public void accept()  {
  
   color ="Black";
   width = 72;
   height = 84;
   numOf_shelves = 4;
  }
  public void display ()  {
   System.out.println("DISPLAYING VALUES FOR BOOKSHELF");
   System.out.println
  ("===================================");

  System.out.println("Color is" + color);
  System.out.println("Width is" + width);
  System.out.println("Height is" + height);
  System.out.println("Number of shelves is" + numOf_shelves);
  System.out.println(" ");
  }
 }

 class Furniture2  {
  public static void main(String[] args)   {
   FurnitureDemo b1 = new Bookshelf();
   b1.accept();
   b1.display();
   

   FurnitureDemo c1 = new chair ();
   c1.accept();
   c1.display();

  }
 }
