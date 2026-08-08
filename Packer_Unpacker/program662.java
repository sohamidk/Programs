package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program662
{
    public static void main(String[] args) 
    {
        Scanner sobj = null;
        File fobj = null;
        boolean bRet = false;
        String fName = null;

        System.out.println("Enter File Name : ");
        
        sobj = new Scanner(System.in);
        fName = sobj.nextLine();

        try
        {
            fobj = new File(fName);

            bRet = fobj.exists();

            if(bRet == true)
            {
               fobj.delete();
               System.out.println("File gets deleted Succesfully");
            }
            else
            {
                System.out.println("There is no such file");
            }       
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
        sobj.close();
    } 
}
