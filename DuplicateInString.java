import java.util.*;

public class DuplicateInString {
	public static void main(String args[])
	{
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Enter a String :");
	     String s = scan.nextLine();
		// take length
		int len = s.length();
		for (int i =0;i<len;i++)
		{
			for (int j =i+1;j<len;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					char ch = s.charAt(i);
					System.out.println(" Duplicate values are :"+ch);
				}

			}
		}
		
	
	}

}
