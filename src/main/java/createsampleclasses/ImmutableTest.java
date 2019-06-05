package createsampleclasses;

public class ImmutableTest {
	    public static void main(String args[]) 
	    { 
	        ImmutableClass i = new ImmutableClass(101,"ABC");
	        System.out.println(i.a); 
	        System.out.println(i.s); 
	        //i.a=6;
	        //uncommenting this would cause error
	} 
}
