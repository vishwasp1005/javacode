// WAP that counts the number of objects created using static.
public class L5prog6{
  static int count=0;
public static void main(String[]args){
        L5prog6 l1 = new L5prog6();
        L5prog6 l2 = new L5prog6();
        L5prog6 l3 = new L5prog6();
        L5prog6 l4 = new L5prog6();

        System.out.println(count);
   }
   L5prog6(){
      count++;
   }
   L5prog6(int x){
      count++;
   }
   L5prog6(double y){
      count++;
   }
   L5prog6(char z){
      count++;
   }

}