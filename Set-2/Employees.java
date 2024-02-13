//Program to implement Inheritance
import java.util.Scanner;
class Employee
{
        private String name;
        private int Age;
        private String Phonenumber;
        private String Address;
        private double Salary;
        public void printSalary()
        {
                System.out.println("Salary:-" +Salary);
        }
        public Employee(String name,int Age,String Phonenumber,String Address,double Salary)
        {
                this.name=name;
                this.Age=Age;
                this.Phonenumber=Phonenumber;
                this.Address=Address;
                this.Salary=Salary;
        }
        public void displayEmp()
        {
                System.out.println("/nName = " +name);
                System.out.println("Age = " +Age);
                System.out.println("Phone Number = " +Phonenumber);
                System.out.println("Address = " +Address);
                System.out.println("Salary = " +Salary);
        }
}
class Officer extends Employee
{
        private String Specialization;
        private String Department;
        public Officer(String name,int Age,String Phonenumber,String Address,double Salary,String Specialization,String Department)
        {
                super(name,Age,Phonenumber,Address,Salary);
                this.Specialization=Specialization;
                this.Department=Department;
        }
        public void displayOff()
        {
                displayEmp();
                System.out.println("Specialization = " +Specialization);
                System.out.println("Department = " +Department);
        }
}
class Manager extends Employee
{
        private String Specialization;
        private String Department;
        public Manager(String name,int Age,String Phonenumber,String Address,double Salary,String Specialization,String Department)
        {
                super(name,Age,Phonenumber,Address,Salary);
                this.Specialization=Specialization;
                this.Department=Department;
        }
        public void displayMan()
        {
                displayEmp();
                System.out.println("Specialization = " +Specialization);
                System.out.println("Department = " +Department);
        }
}
public class Employees
{
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter Manager Details:-\n");
                System.out.print("Name:-");
                String name=sc.nextLine();
                System.out.print("Age:-");
                int age=sc.nextInt();
                        sc.nextLine();
                System.out.print("Phone No:-");
                String phone=sc.nextLine();
                System.out.print("Address:-");
                String add=sc.nextLine();
                System.out.print("Salary:-");
                double sal=sc.nextInt();
                           sc.nextLine();
                System.out.print("Specialization:-");
                String spe=sc.nextLine();
                System.out.print("Department:-");
                String dep=sc.nextLine();

                Manager M = new Manager(name,age,phone,add,sal,spe,dep);
                M.displayMan();

                System.out.print("\n\nEnter Officer Details:-\n");
                System.out.print("Name:-");
                String name1=sc.nextLine();
                System.out.print("Age:-");
                int age1=sc.nextInt();
                         sc.nextLine();
                System.out.print("Phone No:-");
                String phone1=sc.nextLine();
                System.out.print("Address:-");
                String add1=sc.nextLine();
                System.out.print("Salary:-");
                double sal1=sc.nextInt();
                            sc.nextLine();
                System.out.print("Specialization:-");
                String spe1=sc.nextLine();
                System.out.print("Department:-");
                String dep1=sc.nextLine();

                Officer O = new Officer(name1,age1,phone1,add1,sal1,spe1,dep1);
                O.displayOff();

        }
}
