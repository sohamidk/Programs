package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program691
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;

        System.out.println("Enter Folder Name : ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the Name of packed file : ");
        PackFileName = sobj.nextLine();

        File fobjFolder = new File(FolderName);

        
        if((fobjFolder.exists()) && (fobjFolder.isDirectory()))
        {
            System.out.println("Folder exists");

            File fobjPack = new File(PackFileName);
            fobjPack.createNewFile();                   //Pack File gets created.

            File fArr[] = fobjFolder.listFiles();

            System.out.println("Number of Files in Folder " + fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                // Logic
            }
        }
        else
        {
            System.out.println("There is no such Folder");
        }
        sobj.close();
    }
}
