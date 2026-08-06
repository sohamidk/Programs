import java.io.IOException;

import java.io.FileWriter;

public class p45_3
{
    public static void main(String args[])
    {
        try
        {
           FileWriter fobj = new FileWriter("Marvellous.txt");
           fobj.write("Jay Ganesh...\n");

           fobj.close();
           System.out.println("File written successfully\n");
        }
        catch(IOException e)
        {
           e.printStackTrace();
        }
    }
}
