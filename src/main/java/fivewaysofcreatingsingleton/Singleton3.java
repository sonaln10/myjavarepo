package fivewaysofcreatingsingleton;

public class Singleton3 {
	private Singleton3() {}
	private static Singleton3 INSTANCE=null;
	
	public Singleton3 getInstance()
	{
		if(INSTANCE==null)
			synchronized (Singleton3.class) {
				if(INSTANCE==null)
			INSTANCE=new Singleton3();
			}		
		return INSTANCE;
		
	}

}
