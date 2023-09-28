// Wap to print fibonacci series 
public class FibonnaciSeries {
	public static void main(String args[])
	{
		// we will creat series till ten
		int n =10;
		int sum =0;
		// for loops
		System.out.println("Fibonnaci Series is ");
		for(int i =0;i<=n;i++)
		{
			sum = sum + i;
			System.out.print(" "+sum);
			
		}
	}

}
