
public class Poly {
	void add(int n1, int n2) {
		System.out.println("add:" + (n1 + n2));
	}

	void add(String s1, String s2) {
		System.out.println("add:" + (s1 + s2));
	}
}
class Test {
	public static void main(String args[]) {
		Poly obj = new Poly();
		obj.add(5, 10);
		obj.add("hello", "world");
	}
}
