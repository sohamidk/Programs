package Packer_Unpacker;
import java.io.*;

public class program665
{
    public static void main(String[] args)
    {
        FileWriter fwobj = null;
        try
        {
            fwobj = new FileWriter("Demo.txt");
            fwobj.write("Jay Ganesh...");

            fwobj.close();
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        finally
        {

        }      
    }
}
