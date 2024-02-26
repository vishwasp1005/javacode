import java.util.Scanner;
public class circleClass{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double r=sc.nextDouble();
        Area a = new Area();
        double ans=a.circle(r); 
        System.out.println(ans);
   }
  
}

 class Area{
     double circle(double r){
        return Math.PI*r*r;
     }
 }