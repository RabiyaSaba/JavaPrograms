// wap to print the element which are larger then their previous element
public class NextLargest {
	public static void main(String args[])
	{
         int [] a = { 1,2,3,4};
         for (int i =0;i<a.length;i++)
         {
        	 if(a[i]<a[i+1])
        	 {
        		 System.out.println(" Previous value is :"+a[i]);
        		 System.out.println(" next value is greater "+a[i+1]);
        	 }
         }
	}

}
