public class Single {

		   private static Single singleton = new Single( );

		   private Single() { }

		   public static Single getInstance( ) {
		      return singleton;
		   }

		   protected static void demoMethod( ) {
		      System.out.println("demoMethod for singleton");
		   }
		}


 class SingleDemo {

	   public static void main(String[] args) {
	      Single tmp1 = Single.getInstance( );
	      tmp1.demoMethod( );
	      System.out.println("tmp1 : "+tmp1);
	      Single tmp2=Single.getInstance();
	      System.out.println("tmp2 : "+tmp2);
	   }
	}