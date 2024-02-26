//Write a program to create basic calculator by getting 2 numbers and 1 string (operation) from the user and apply the 
operation given in a string on the given numbers.
import java.util.Scanner;
public class CalcUsingSwitch{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First integer: ");
        int n=sc.nextInt();
        System.out.println("Enter Second integer: ");
        int m=sc.nextInt();
        char ch=sc.next().charAt(0);
        switch(ch){
            case('+') : 
            {
                System.out.println("sum"+(n+m));
                break;
            }
            case('-') : 
            {
                System.out.println("dif"+(n-m));
                break;
            }
            case('*') : 
            {
                System.out.println("mul"+(n*m));
                break;
            }
        case('/') : 
        {
            System.out.println("div"+(float)(n/m));
            break;
        }
        default : 
        {
            System.out.println("Invalied Character");
        }
    }
    }
}