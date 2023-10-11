
public class Autoboxing {
	
	
	public static void main(String args[])
	{
		// convert primitive data type into wrapper class 
		//the process of converting pritive data type into object is called 
		// autoboxing 
		
		// primitive data type
		int a = 10;
		
		// object type of Integer 
		Integer ab =Integer.valueOf(a);
		
		System.out.println(" Object value :"+ab);
		
		//actually converted into object 
		if(ab instanceof Integer)
		{
			// true 
			System.out.println("Yes it is an object ");
		}
		else
		{
			System.out.println("No it is not an object");
		}
		
	}

}
