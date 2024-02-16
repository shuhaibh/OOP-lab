//program to implement FileHandling
import java.io.*;
public class FileHandling
{
        public static void main(String args[])
        {
                try
                {
                        FileInputStream FI = new FileInputStream("Source.txt");
                        FileOutputStream FO = new FileOutputStream("Destination.txt");
                        int i;
                        while((i=FI.read())!=-1)
                        {
                                System.out.print((char)i);
                                FO.write(i);
                        }
                        FI.close();
                        FO.close();
                }
                catch(FileNotFoundException e)
                {
                        System.out.println(e.getMessage());
                }
                catch(IOException e)
                {
                        System.out.println(e.getMessage());
                }
        }
}
