//Write an application that searches through its command-line argument. If an argument is found that does not begin with 
//and upper case letter, display error message and terminate.
public class command {
    public static void main(String[] args) {
        // System.out.println("the string"+args[0]); 
        String s=args[0];
        System.out.println(s);
        if(s.charAt(0)>64 && s.charAt(0)<92){
            System.out.println("this is uppercase");
        } 
        else{
            System.out.println("not upper");
        }
    }
}