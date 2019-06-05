package project.milestone1;

public class Sample {
		int i;
		Sample (int x)
		{
			i=x;
		}
		public void finalize()
		{
			System.out.println("In Finalize method" );
			System.out.println("In Finalize method" );
			System.out.println("In Finalize method" );
			System.out.println("i: "+i);
			System.out.println("In Finalize method" );
			
		}
		public static void main(String[] args) 
		{
			Sample  obj1;
	            	obj1=new Sample (10);
			obj1=new Sample (20);
			System.gc();    // request to gc
		}
	}