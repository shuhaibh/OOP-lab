//program to implement String Tokenizer

import java.util.Scanner;
import java.util.StringTokenizer;

public class SumofInt
{
        public static void main(String args[])
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the limit");
                int n=sc.nextInt();
                      sc.nextLine();
                System.out.println("Enter the "+n+" Numbers(with spaces seperating each)");

                String numlist = sc.nextLine();

                StringTokenizer ST = new StringTokenizer(numlist," ");

                int sum = 0;

                while(ST.hasMoreTokens())
                {
                        sum = sum + Integer.parseInt(ST.nextToken());
                }

                System.out.println("Sum = " +sum);

        }
}
