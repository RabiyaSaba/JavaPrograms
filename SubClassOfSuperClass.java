package constructor;

public class SubClassOfSuperClass  extends SuperClassExample 
{
	
	public void ex()
	{
		super.ex();// calling the super class method 
		System.out.println(" Sub class is running :");
	}
	


public static void main(String args[])
{
	// create ob 
	SubClassOfSuperClass sc=new SubClassOfSuperClass();
	// obj will call method 
	sc.ex();
	// when we call ex we call both ex 
	// and both value of super and sub will be printed 
	
}
}
