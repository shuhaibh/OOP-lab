//Program to implement Method overriding
class A
{
        int i=5;
        public void print()
        {
                System.out.println(i);
        }
}
class B extends A
{
        int j=6;
        public void print()
        {
                System.out.println(j);
        }
}
public class metd_overriding
{
        public static void main(String[]args)
        {
                B b=new B();
                b.print();
        }
}
