package Packer_Unpacker;
import java.io.*;
import java.util.*;


public class program735
{
    public static void main(String args[]) throws Exception
    {
        // Variables
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
        int iRet = 0;
        String fileName = null;
        String fileSize = null;



        // Input from user
        System.out.println("Enter the name of Packed file : ");
        packFileName = sobj.nextLine();

        fPackobj = new File(packFileName);

        if(fPackobj.exists())
        {
            fiobj = new FileInputStream(fPackobj);

            // Read  Header
            while((iRet = fiobj.read(Header,0,100)) != -1)
            {
                strHeader = new String(Header);

                System.out.println("Header is : " + strHeader);

                strHeader = strHeader.trim();

                
                strHeader = strHeader.replaceAll("\\s+", " ");
                strHeader = strHeader.replace(" ", "_");

                int iPos = strHeader.lastIndexOf("_");

                fileName = strHeader.substring(0,iPos);
                fileSize = strHeader.substring(iPos + 1);

                newFile = new File(fileName);

                newFile.createNewFile();
                

                Tokens = strHeader.split(" ");
                System.out.println("File Name : " + Tokens[0]);
                System.out.println("File size : " + Tokens[1]);

                newFile = new File(Tokens[0]);
                newFile.createNewFile();

                foobj = new FileOutputStream(newFile);

                Buffer = new byte[Integer.parseInt(fileSize)];

                // Read data
                fiobj.read(Buffer, 0, Integer.parseInt(fileSize));

                // Write the data
                foobj.write(Buffer, 0, Integer.parseInt(fileSize));
                
            }// End of while
        }
        else
        {
            System.out.println("There is no such packed file");
        }
        
    }
    
}
