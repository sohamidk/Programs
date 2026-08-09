package Packer_Unpacker;
import java.io.*;
import java.util.*;


public class program729 
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String packFileName = null;
        File fPackobj = null;
        FileInputStream fiobj = null;
        byte Header[] = new byte[100];
        String strHeader = null;

        System.out.println("Enter the name of Packed file : ");
        packFileName = sobj.nextLine();

        fPackobj = new File(packFileName);

        if(fPackobj.exists())
        {
            fiobj = new FileInputStream(fPackobj);

            fiobj.read(Header,0,100);

            strHeader = new String(Header);

            System.out.println("Header is : " + strHeader);

        }
        else
        {
            System.out.println("There is no such packed file");
        }
        
    }
    
}
