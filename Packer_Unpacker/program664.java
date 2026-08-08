package Packer_Unpacker;
import java.io.*;

public class program664
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fwobj = new FileWriter("Demo.txt");
        fwobj.write("Jay Ganesh...");
        
        fwobj.close();      //Important
    }
}
