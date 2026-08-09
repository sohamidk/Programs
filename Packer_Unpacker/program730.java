package Packer_Unpacker;
import java.io.*;
import java.util.*;


public class program730
{
    public static void main(String args[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String packFileName = null;
        File fPackobj = null;
        FileInputStream fiobj = null;
        byte Header[] = new byte[100];
        String strHeader = null;
        String Tokens[] = null;



        // Input from user
        System.out.println("Enter the name of Packed file : ");
        packFileName = sobj.nextLine();

        fPackobj = new File(packFileName);

        if(fPackobj.exists())
        {
            fiobj = new FileInputStream(fPackobj);

            fiobj.read(Header,0,100);

            strHeader = new String(Header);

            System.out.println("Header is : " + strHeader);

            strHeader = strHeader.trim();
            strHeader = strHeader.replaceAll("\\s+", " ");

            Tokens = strHeader.split(" ");
            System.out.println("File Name : " + Tokens[0]);
            System.out.println("File size : " + Tokens[1]);

        }
        else
        {
            System.out.println("There is no such packed file");
        }
        
    }
    
}
