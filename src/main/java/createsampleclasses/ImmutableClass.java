package createsampleclasses;

public final class ImmutableClass {

	final int a;
	final String s;
	
	
	public int getA() {
		return a;
	}


	public String getS() {
		return s;
	}


	ImmutableClass(int a, String s){
		this.a=a;
		this.s=s;
		
	}
	
}
