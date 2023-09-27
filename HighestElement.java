
public class HighestElement {
	
	public static void main(String args[])
	{
		int[] a = {1,2,5,3};
		// to store high 
		int high =a[0];
		// for loop 
		for(int i =0;i<a.length;i++)
		{
			if(high < a[i])
			{
				high = a[i];
			}
		}
		System.out.println(" The Highest Number is :"+high);
		
	}

}
