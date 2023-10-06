
// yhis class will extends interface 1 
// because interface can be implemented more then once 
// we can acheive multiple inheritence through it
class ClassExtendingInterface1 implements Interface1{
	
	public void display()
	{
		System.out.println(" Interface  running in a class :");
	}
	
	
public static void main(String args[])
{
	// we will create an object of class 
	ClassExtendingInterface1 cei = new ClassExtendingInterface1();
	// here we have called the object of interface
	cei.display();
}
}
