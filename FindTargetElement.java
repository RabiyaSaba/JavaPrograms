// write a java program to take size of an array from user 
// the user will also provide array element 
// asked for target element and check whether it is present in the list or not

import java.util.*;
public class FindTargetElement {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of an array :");
		int element = scan.nextInt();
		// take array from user 
		int [] a = new int[element];
		System.out.println("Enter the element of array  : ");
		for(int i =0;i<element;i++)
		{
			a[i]=scan.nextInt();
		}
	   // ask user for target element 
		System.out.println("Enter the element to be search :");
		int target = scan.nextInt();
		// loop through 
		for(int i =0;i<element;i++)
		{
			if(a[i]==target)
			{
		       System.out.println("Element present in array ");
			}
				
		}
	}

}
