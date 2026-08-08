package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program684
{
    public static void main(String[] args) throws Exception
    {
        String fNameSrc = null;
        String fNameDest = null;

        File fobjsrc = null;
        File fobjdest = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;


        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Source File Name : ");
        fNameSrc = sobj.nextLine();
        
        System.out.println("Enter Destination File Name : ");
        fNameDest = sobj.nextLine();

        fobjsrc = new File(fNameSrc);
        fobjdest = new File(fNameDest);

        fobjdest.createNewFile();

        fiobj = new FileInputStream(fobjsrc);
        foobj = new FileOutputStream(fobjdest);

        

        byte Buffer[] = new byte[100];
        
        if(fobjsrc.exists())
        {
            int iRet = 0;
            String str = null;
            while((iRet = fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer, 0, iRet);
            } 
            fiobj.close();
            foobj.close();
        }
        else
        {
            System.out.println("There is no such file");
        }

        

        sobj.close();
        
    }
}
