package fivewaysofcreatingsingleton;

public class Singleton2 {
	private Singleton2() {}
	private static Singleton2 INSTANCE=null;
	
	public Singleton2 getInstance()
	{
		if(INSTANCE==null)
			synchronized (Singleton2.class) {
			INSTANCE=new Singleton2();
			}		
		return INSTANCE;
		
	}

}
