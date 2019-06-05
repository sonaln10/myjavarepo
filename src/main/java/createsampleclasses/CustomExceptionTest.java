package createsampleclasses;

public class CustomExceptionTest {

	
	public static void main(String[] args)// throws CustomException 
	{
		
		int age=5;
		try {
		if(age==0)
			System.out.println("Zero");
		else
			throw new CustomException("Exception ");
	}
		catch(CustomException c)
		{
			
		System.out.println("Inside catch "+c+"\n");
			c.getMessage();
			c.printStackTrace();
		}
		
	}
	
}
