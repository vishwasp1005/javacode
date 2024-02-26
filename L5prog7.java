//Write a program in Java to demonstrate use of this keyword. Check whether this can access the Static variables of the class 
//or not.
import java.util.Scanner;
class rectangle{
    double length;
    double breadth;
    double height;

    void areaOfRect(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        area();
    }
    void area(){
        double A = length*breadth*height;
        System.out.println(A);
    }
}
public class L5prog7{
public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter dimentions of Ractengle:" );
       double length = sc.nextDouble();
       double breadth =sc. nextDouble();
       double height =sc. nextDouble();
       rectangle one = new  rectangle();
       one.areaOfRect(length,breadth,height);
   }
}