
public class WrapperBasic {
	public static void main(String args[])
	{
		// wrapper class is used to convert the variable (primitive data type)
		// into objects 
		// there are 2 process one is Autoboxing 
	     //the other one is Unboxing
		
		// here this is autoboxing 
		int a =10;
		// now convert into Object 
		Integer b =Integer.valueOf(a);
		// now we need to check if actually converted to Object 
		if( b instanceof Integer )
		{
			System.out.println("Yes object is created :");
			System.out.println("Object value :"+b);
		}
		else
		{
			System.out.println(" No object is not created :");
		}
		
	}

}
