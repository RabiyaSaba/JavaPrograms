

// example of single Inheritence 
public class ClassTwo extends Classone {
	
	
	public void MethodTwo()
	{
		System.out.println("This is method two :");
	}
	
	
	// main
	public static void main(String args[])
	{
		ClassTwo t= new ClassTwo();
		t.MethodTwo();
		// class one object calling 
		Classone o = new Classone();
		o.MethodOne();
	}

}
