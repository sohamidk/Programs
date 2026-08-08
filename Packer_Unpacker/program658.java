package Packer_Unpacker;

import java.io.*;

public class program658 
{
    public static void main(String[] args) 
    {
        try
        {
            File fobj = new File("Demo.txt");
            if(fobj.exists())
            {
                System.out.println("File Already Present\n");
            }
            else
            {
                fobj.createNewFile();
                System.out.println("File gets successfully created\n");
            }
                   
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
