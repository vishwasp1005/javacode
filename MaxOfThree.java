//Write a program to ƒnd maximum no from given 3 no.
import java.util.Scanner;
public class MaxOfThree{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a=sc.nextInt();
        System.out.println("Enter an integer: ");
        int b=sc.nextInt();
        System.out.println("Enter an integer: ");
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is maximum number");
            }
            else
            {
                System.out.println("c is maximum number");
            }
        }
        if(b>a)
        {
            if(b>c)
            {
                System.out.println("b is maximum number");
            }
            else
            {
                System.out.println("c is maximum number");
            }
        }
   }
}