//Program to demontrate the use of garbage collector
public class Garbage
{
        public void finalize()
        {
                System.out.println("Object memory Released!");
        }
        public static void main(String args[])
        {
                Garbage Gb = new Garbage();
                Gb=null;
                System.gc();
        }
}
