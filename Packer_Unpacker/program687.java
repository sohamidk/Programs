package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program687
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;

        System.out.println("Enter Folder Name : ");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);
        
        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder exists");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of Files in Folder " + fArr.length);
        }
        else
        {
            System.out.println("There is no such Folder");
        }
        sobj.close();
    }
}
