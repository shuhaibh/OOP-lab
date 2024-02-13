//Program to check the frequency of characters in a given string
import java.util.*;
public class Frequency{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                //Inputting the string
                System.out.println("Enter the String:");
                String str = sc.nextLine();
                //Inputting the charactor to search for
                System.out.println("Enter the Character:");
                char ch = sc.nextLine().charAt(0);

                int count=0;//Initializing the frequency to be 0

                for(int i=0;i<str.length();i++)
                {
                        if(str.charAt(i) == ch)
                                count++;
                }
                System.out.println("No of occurences of '"+ch+"' is:-"+count);
        }
}
