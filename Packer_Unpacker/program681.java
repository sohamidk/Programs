package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program681
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
        
        byte Buffer[] = new byte[50];
        
        if(fobj.exists())
        {
            String str = null;
            int iRet = 0;
            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer);
                System.out.print(str); 
                str = null;
            }
            
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
        fiobj.close();
    }
}
