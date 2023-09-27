// wap to find the second hightest number in array 
public class SecondHightestNumber {

	public static void main(String args[])
	{
      int[] a = { 3,6,7,4};
      // len 
      int len = a.length;
      // for 
      for(int i =0;i<len;i++)
      {
    	  for (int j =i+1;j<len;j++)
    	  {
    		  if(a[i]>a[j])
    		  {
    			  int temp=a[i];
    			  a[i]=a[j];
    			  a[j]=temp;
    			  
    		  }
    	  }
    	  
      }
      // second largest value 
      System.out.println(" Second largest "+a[len-2]);
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}