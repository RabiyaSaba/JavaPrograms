

// this method will be responsible to have all the dtails 
// first we will extend it
 class AbstractDetails  extends AbstractionExample {
	void run()
	{
		System.out.println("The bike is on run");
	}
	public static void main(String args[])
	{
		AbstractionExample ae = new AbstractDetails();
		ae.run();
		
		
	}

}
