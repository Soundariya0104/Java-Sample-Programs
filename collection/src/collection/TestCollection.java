package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<String>();
		al.add("Nivas");
		al.add("Janani");
		al.add("SriRam");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		}
}
