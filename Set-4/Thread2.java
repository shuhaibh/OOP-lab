//More about Thread handling
import java.util.Random;

class Randomthread extends Thread
{
        public void run()
        {
                Random r = new Random();
                for(int i=0;i<20;i++)
                {
                        int n = r.nextInt(100);
                        if (n%2==0)
                        {
                                new Even(n).start();
                        }
                        else
                        {
                                new Odd(n).start();
                        }
                }
        }
}

class Even extends Thread
{
        private int num;
        public Even(int num)
        {
                this.num = num;
        }

        public void run()
        {
                System.out.println("Even:-"num*num);
        }
}

class Odd extends Thread
{
        private int num;
        public Odd(int num)
        {
                this.num=num;
        }
        public void run()
        {
                System.out.println("Odd:-"num*num*num);
        }
}

public class Threadpgm
{
        public static void main(String args[])
        {
                Randomthread r1 = new Randomthread();
                r1.start();
        }
}

