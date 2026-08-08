package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program671
{
    public static void main(String[] args)
    {
        String fName = null;
        File fobj = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File Name : ");
        fName = sobj.nextLine();
        
        fobj = new File(fName);

        if(fobj.exists())
        {
            System.out.println("File Name : " + fobj.getName());
            System.out.println("Absoulte path : " + fobj.getAbsolutePath());
            System.out.println("File Size : " + fobj.length());
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();

    }
}
