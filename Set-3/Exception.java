//Program to implement Exception handling
import java.util.Scanner;

class Exception
{
        public static void divide(int a,int b) throws ArithmeticException
        {
                if (b==0)
                {
                        throw new ArithmeticException("Division is not possible!");
                }
                else
                {
                        System.out.println("Result = "+a/b);
                }
        }
        public static void main(String args[])
        {
                try
                {
                        int x,y;
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter the Numbers:-");
                        x=sc.nextInt();
                        sc.nextLine();
                        y=sc.nextInt();
                        sc.nextLine();
                        divide(x,y);
                }
                catch(ArithmeticException e)
                {
                        System.out.println(e.getMessage());
                }
                finally
                {
                        System.out.println("End of Program!");
                }
        }
}
