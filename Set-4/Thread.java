//Program to Learn about Threads
class evenno extends Thread
{
        public void run()
        {
                for(int i=0;i<10;i++)
                System.out.println("A="+2*i);
        }
}

class oddno extends Thread
{
        public void run()
        {
                for(int i=1;i<20;i++)
                System.out.println("B="+(2*i)+1);
        }
}

public class Thread1
{
        public static void main(String args[])
        {
                evenno t1 = new evenno();
                oddno t2 = new oddno();
                t1.start();
                t2.start();
        }
}
