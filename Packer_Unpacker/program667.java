package Packer_Unpacker;
import java.io.*;

public class program667
{
    public static void main(String[] args)
    {
        FileReader frobj = null;
        try
        {
            frobj = new FileReader("Demo.txt");
            
            System.out.println((char)(frobj.read()));
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
