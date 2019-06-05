package project.milestone1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	method(null);
        System.out.println( "Hello World!" );
    }
    
    static
    void method(Object o) 
    {
    	System.out.println("Object");
    }
    
    static
    void method(String s) 
    {
    	System.out.println("String");
    }
    
    /*static
    void method(Integer s) 
    {
    	System.out.println("Integer");
    }*/
}
