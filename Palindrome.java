//Write a program to ƒnd that given number or string is palindrome or not. 
import java.util.Scanner;
public class Palindrome{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        // int n=sc.nextInt();
        // int sum=0;
        // int temp = n;
        // while(n>0)
        // {
        //     int rem=n%10;
        //     sum=(sum*10)+rem;
        //     n=n/10;
        // }
        // if(temp==sum)
        // {
        //     System.out.println(" palindrome ");
        // }
        // else
        // {
        //     System.out.println(" not palindrome ");
        // }
        String str=sc.next();
        String reversestr="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversestr=reversestr + str.charAt(i);
        }
        if(str.equals(reversestr))
        {
            System.out.println(" it's Palindrome ");
        }
        else{
            System.out.println(" it's not Palindrome ");   
        }
   }
}