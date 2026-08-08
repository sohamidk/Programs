package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program679
{
    public static void main(String[] args) throws Exception
    {
        String fName = null;

        FileInputStream fiobj = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File Name : ");
        fName = sobj.nextLine();
        
        fobj = new File(fName);

        fiobj = new FileInputStream(fobj);
        
        byte Arr[] = new byte[50];
        
        if(fobj.exists())
        {
           fiobj.read(Arr);
           System.out.println(new String(Arr));
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
        fiobj.close();
    }
}
