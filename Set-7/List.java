//Program to learn about collections in java
import java.util.*;
import java.io.*;



class listdemo
{
        public static void main(String[]args)
        {
                ArrayList<String> list=new ArrayList<String>();
                list.add("amal");
                list.add("sarang");
                list.add("akshith");
                System.out.println(list);


                Iterator it=list.iterator();
                while(it.hasNext())
                {
                        System.out.println(it.next());
                }
        }
}
