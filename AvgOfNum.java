import java.util.Scanner;
public class AvgOfNum{
public static void main(String[]args){
         int[] n=new int[4];
         int sum=0;
         Scanner sc=new Scanner(System.in);
         for(int i=0;i<4;i++)
         {
            System.out.println("Enter Element: ");
            n[i]=sc.nextInt();
            sum+=(n[i]);
         }
         System.out.println("Averege="+(sum/4.0));
   }
}