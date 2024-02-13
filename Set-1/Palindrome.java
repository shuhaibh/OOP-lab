//Program to check if a given String is a Palindrome
import java.util.*;
public class Palindrome{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                //inputting the string
                System.out.println("Enter the string to check");
                String str = sc.nextLine();

                int flag=0;//flag=0 ==> String is a palindrome

                int len= str.length();

                for(int i=0;i<=len/2;i++)
                {
                        if(str.charAt(i)!=str.charAt(len-1-i))
                                flag=1;
                        break;
                }

                if (flag==0)
                        System.out.println("The String '"+str+"' is a Palindrome");
                else
                        System.out.println("The string '"+str+"' is not a Palindrome");
        }
}
