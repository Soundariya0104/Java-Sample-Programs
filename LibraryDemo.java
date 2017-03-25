abstract class Library
{

  protected String authorName;
  protected String title;
  protected int price;
  protected int stock;
  protected int num_of_pages;
  
  public abstract void accept();
  public abstract void display();
 }
 class Software extends Library {
 private double version;
 private String name;

	public void accept() {
		authorName="fgsadjha";
		title="fjkj";
		price=212;
		stock=34;
		num_of_pages=144;
		version=2.1;
		name="gvuyea";
		
	}

	
	public void display() {
	System.out.println("displaying value for software");
	System.out.println("------------------------------");
	System.out.println(authorName);
	System.out.println(title);
	System.out.println(price);
	System.out.println(stock);
	System.out.println(num_of_pages);
	System.out.println(version);
	System.out.println(name);
	
		
	}

}
 class Hardware extends Library{

	private int category;
	private String publisher;
	
	
	public void accept() {
authorName="fjgf";
title="ahsvgk";
price=21;
stock=43;
num_of_pages=637;
category=47;
publisher="sdvfjw";		
	}

	@Override
	public void display() {
		System.out.println("displaying value for hardware");
		System.out.println("-----------------------------");

		System.out.println(authorName);
		System.out.println(title);
		System.out.println(price);
		System.out.println(stock);
		System.out.println(num_of_pages);
		System.out.println(category);
		System.out.println(publisher);
		
	}
	
}
public class LibraryDemo{
	public static void main(String args[]){
		Library s=new Software();
		s.accept();
		s.display();
		Library h=new Hardware();
		h.accept();
		h.display();
	}
}