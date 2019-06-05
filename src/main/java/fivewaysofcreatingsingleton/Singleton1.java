package fivewaysofcreatingsingleton;

public class Singleton1 {
	private Singleton1() {}
	private static final Singleton1 INSTANCE=new Singleton1();
	
	public Singleton1 getInstance()
	{
		return INSTANCE;
		
	}

}
