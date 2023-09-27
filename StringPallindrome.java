import java.util.Scanner;
 
public class StringPallindrome {
    public static void main (String[] args) {
        String original;
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter the number or String");
        original = in.nextLine();
        length = original.length();
        String reverse="";
        for (int i =0;i<length;i++)
        {
        	char ch = original.charAt(i);
        	reverse=ch+reverse;
        }
                System.out.println("reverse is:" +reverse);
         
        if(original.equals(reverse)) 
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
         
    }
}