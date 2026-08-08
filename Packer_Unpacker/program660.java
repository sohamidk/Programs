package Packer_Unpacker;

import java.io.*;

public class program660
{
    public static void main(String[] args) 
    {
        File fobj = null;
        boolean bRet = false;
        
        try
        {
            fobj = new File("Demo.txt");
            

            bRet = fobj.exists();

            if(bRet == true)
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
