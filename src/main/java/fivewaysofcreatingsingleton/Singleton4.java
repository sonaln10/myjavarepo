package fivewaysofcreatingsingleton;

public class Singleton4 {
	private Singleton4() {}
	
	private static class SingletonInner{
		
		private static final Singleton4 INSTANCE=new Singleton4();
	}
	
	
	public Singleton4 getInstance()
	{
		return SingletonInner.INSTANCE;
		
	}

}
