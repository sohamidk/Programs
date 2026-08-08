package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program672
{
    public static void main(String[] args)
    {
        String fName = null;

        FileOutputStream foobj = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File Name : ");
        fName = sobj.nextLine();
        
        fobj = new File(fName);

        foobj = new FileOutputStream(fobj);
        String data = "Marvellous Infosystems";

        if(fobj.exists())
        {
           foobj.write(data);       //Error
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
        foobj.close();
    }
}
