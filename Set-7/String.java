//string methods
public class stringdemo
{
        public static void main(String[]args)
        {
                String s="111";
                String s1="rahul";
                String s2="rahul";
                String s3="Rahul";
                String s4="satan";
                String s5="hello my name is amal";

                int x=s.length();
                System.out.println("length is                                    "+x);
                System.out.println("s1 &s2are equal:                             "+s1.equals(s2));
                System.out.println("s1&s3 are equl:                              "+s1.equals(s3));
                System.out.println("s1& s3 are equal(without considering case):  "+s1.equalsIgnoreCase(s3));
                System.out.println("s1 compared to s2:                           "+s1.compareTo(s2));
                System.out.println("s1 compared to s4:                           "+s1.compareTo(s4));
                System.out.println("s5 contains amal?:                           "+s5.contains("amal"));
                System.out.println("in s5 amal replaced by chittu:               "+s5.replaceAll("amal","chittu"));
                System.out.println("char at 4 th intex of s1                     "+s1.charAt(4));
                int a=20;
                String s6=String.valueOf(a);
                System.out.println(10+20);
                System.out.println(s6+10);
        }
}
