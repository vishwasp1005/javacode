//Write a program to check that the given number is prime or not.
import java.util.Scanner;
public class Prime{
public static void main(String[]args){
     int i=2,count=0;
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter an integer: ");
     int n=sc.nextInt();
	while(i<n)
	{
		if(i%n==0)
		{
			count++;
		}i++;
	}
	if(count>0)
    {
        System.out.println("it's not Prime Number");
    }
    else
    {
        System.out.println("it's Prime Number");
    }
   }
}