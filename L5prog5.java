//Deƒne class for Complex number with real and imaginary as data members. Create its contructor, overload the constructors. 
//Also deƒne addition method to add two complex objects.
    
    public class L5prog5 {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        Complex n1=new Complex();
        Complex n2=new Complex(6,2);
        // n1.rn=sc.nextInt();
        // n2.rn=sc.nextInt();
        // n1.in=sc.nextInt();
        // n2.in=sc.nextInt();
        Complex.addition(n1,n2);
    }
}
class Complex{
    int rn;
    int in;
    Complex(){
        rn=5;
        in=2;
    }
    Complex(int r,int i){
        rn=r;
        in=i;
    }
    static void addition(Complex n1,Complex n2){
        int totalr=n1.rn+n2.rn;
        int totali=n1.in+n2.in;
        System.out.println("the ans is:-"+totalr+"+"+totali+"i");
    }
}