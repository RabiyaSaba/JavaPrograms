// wap to create a method with return type and parameter
public class ReturnTypeParameter {
	
	
	public static void main(String args[])
	{
		
		int a =10;
		methodType4(a);
		int res = methodType4(a);
		System.out.println(" res is "+res);
	}
	public static int methodType4(int a )
	{
		int result = a+a;
		return result;
	}

}
