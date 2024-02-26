//Deƒne Time class with constructor to initialize hour and minute. Also deƒne addition method to add two time objects
import java.util.*;
public class conhourandmin{
public static void main(String[]args){
      Time t1=new Time();
      Time t2=new Time(11,60);
      // System.out.println("hours="+t1.h);
      // System.out.println("minutes="+t1.m);
      // System.out.println("hours="+t2.h);
      // System.out.println("minutes="+t2.m);
      int H=t1.h+t2.h;
      int M=t1.m+t2.m;
      if(M>59)
      {
         M=M-60;
         H++;
      }
      System.out.println("hours="+H);
      System.out.println("minutes="+M);
   }
}
class Time{
   int h,m;
   Time()
   {
      h=1;
      m=50;
   }
   Time( int hr,int min)
   {
      h=hr;
      m=min;
}