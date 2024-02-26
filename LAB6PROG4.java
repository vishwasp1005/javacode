import java.util.Scanner;

public class LAB6PROG4{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Employee e1= new Employee();
        Manager m1=new Manager();
        e1.SetData("suzi", 52, 9028725,"home",2000000,"Frontend");
        e1.printDetails();
        m1.SetData("nobi", 27, 9025785,"not home",20,"SocialMEdia");
        m1.printDetails();
    }
}

class Member{
    String Name;
    int Age;
    int Phonenumber;
    String Adress;
    double Salary;

    void SetData(String Name, int Age, int Phonenumber, String Adress, double Salary)
    {
        this.Name=Name;
        this.Age=Age;
        this.Phonenumber=Phonenumber;
        this.Adress=Adress;
        this.Salary=Salary;
    }
    void printSalary()
    {
        System.out.println("name:"+Name+"\nAge:"+Age+"\nPhonenumber:"+Phonenumber+"\nAdress:"+Adress+"\nSalary:"+Salary);
    }
   } 

   class Employee extends Member{
    String specialization;

    void SetData(String Name, int Age, int Phonenumber, String Adress, double Salary,String specialization){
        super.SetData(Name, Age, Phonenumber, Adress, Salary);
        this.specialization = specialization;
    }
    void printDetails(){
        //.SetData( Name, Age, Phonenumber, Adress, Salary);
        super.printSalary();
        System.out.println("Speialization:"+specialization);
    }
   }

   class Manager extends Member{
    String department;

    void SetData(String Name, int Age, int Phonenumber, String Adress, double Salary,String department){
        super.SetData(Name, Age, Phonenumber, Adress, Salary);
        this.department = department;
    }
    void printDetails(){
        //.SetData( Name, Age, Phonenumber, Adress, Salary);
        super.printSalary();
        System.out.println("Department:"+department);
    }
   }