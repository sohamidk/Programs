package Packer_Unpacker;
import java.io.*;
import java.util.*;


public class program732
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
        File newFile = null;
        FileOutputStream foobj = null;
        byte Buffer[] = null;



        // Input from user
        System.out.println("Enter the name of Packed file : ");
        packFileName = sobj.nextLine();

        fPackobj = new File(packFileName);

        if(fPackobj.exists())
        {
            fiobj = new FileInputStream(fPackobj);

            // Read  Header
            fiobj.read(Header,0,100);

            strHeader = new String(Header);

            System.out.println("Header is : " + strHeader);

            strHeader = strHeader.trim();
            strHeader = strHeader.replaceAll("\\s+", " ");

            Tokens = strHeader.split(" ");
            System.out.println("File Name : " + Tokens[0]);
            System.out.println("File size : " + Tokens[1]);

            newFile = new File(Tokens[0]);
            newFile.createNewFile();

            foobj = new FileOutputStream(newFile);

            Buffer = new byte[Integer.parseInt(Tokens[1])];

            // Read data
            fiobj.read(Buffer, 0, Integer.parseInt(Tokens[1]));

            // Write the data
            foobj.write(Buffer, 0, Integer.parseInt(Tokens[1]));

        }
        else
        {
            System.out.println("There is no such packed file");
        }
        
    }
    
}
