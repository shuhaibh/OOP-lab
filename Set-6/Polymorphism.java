//Program to implement runtime polymorphism
class A
{
        String a="from class A";
        public void print()
        {
                System.out.println(a);
        }
}
class B extends A
{
        String b="from class B";
        public void print()
        {
                System.out.println(b);
        }
}
public class run_poly
{
        public static void main(String[]args)
        {
                A a=new A();
                B b=new B();
                a=b;
                a.print();
        }
}
