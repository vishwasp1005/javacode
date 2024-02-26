// Write a program to print given array in reverse order.
import java.util.Scanner;
public class ReverseOfArray{
public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of array element: ");
     int n=sc.nextInt();
     int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter Element: ");
            arr[i]=sc.nextInt();
        }
      for(int i=arr.length-1;i>=0;i--)
     {
        System.out.println("Array="+(arr[i]));
     }
   }
}