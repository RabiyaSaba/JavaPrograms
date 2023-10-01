// now one is inherited by two and two is inherited by three
public class ClassThree extends ClassTwo{
	
	public void MethodThree()
	{
		System.out.println("This is class three method :");
	}
	
	// main
	public static void main(String args[])
	{
		ClassTwo t = new ClassTwo();
		Classone o  = new Classone();
		ClassThree j = new ClassThree();
		t.MethodTwo();
		j.MethodThree();
		o.MethodOne();
		
	}

}
