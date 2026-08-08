package Packer_Unpacker;
import java.io.*;

public class program670
{
    public static void main(String[] args)
    {
        FileReader frobj = null;
        char Buffer[] = new char[20];

        try
        {
            frobj = new FileReader("Demo.txt");
            
            frobj.read(Buffer,3,10);

            System.out.println(Buffer);
            frobj.close();
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
