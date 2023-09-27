// write a program that calculate sum of adjacent difference from Array
public class AdjacentDifference {
	
	public static void main(String args[])
	{
	     // define an array with some element 
		int[] a1 = {1,3,4,6};
		// now define a variable to store adjacent difference 
		int ad =0;
		// varible to  store the sum 
		int sum=0;
		// loop through the array 
		for (int i =0;i<a1.length-1;i++)
		{
			ad = a1[i+1]-a1[i];
			sum = sum + ad;
		}
		// display 
		System.out.println(" The sum of adjacent difference is : "+sum);
	}

}
