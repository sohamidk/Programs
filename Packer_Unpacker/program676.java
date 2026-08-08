package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program676
{
    public static void main(String[] args) throws Exception
    {
        String fName = null;

        FileOutputStream foobj = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File Name : ");
        fName = sobj.nextLine();
        
        fobj = new File(fName);

        foobj = new FileOutputStream(fobj);
        
        String Data = "Marvellous Infosystems";
        byte Arr[] = Data.getBytes();

        if(fobj.exists())
        {
           foobj.write(Arr);
        }
        else
        {
            System.out.println("There is no such file");
        }

        sobj.close();
        foobj.close();
    }
}
