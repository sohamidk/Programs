package Packer_Unpacker;

import java.io.*;

public class program656 
{
    public static void main(String[] args) 
    {
        try
        {
            File fobj = new File("Demo.txt");
            fobj.createNewFile();       
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }

    } 
}
