package chintaginjala;

import java.util.Scanner;

public class Palindrome
{
   public static void main(String args[])
   {
      String string, rev ="";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      string = sc.nextLine();
    
      string= string.toUpperCase();
     System.out.println(string);
 
     int length = string.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + string.charAt(i);
 
      if (string.equals(rev))
         System.out.println(string+" is a palindrome");
      else
         System.out.println(string+" is not a palindrome");
      sc.close();
 
   }
}
