package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program694
{
    public static void main(String[] args) throws Exception
    {
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

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

            foobj = new FileOutputStream(fobjPack);


            File fArr[] = fobjFolder.listFiles();

            System.out.println("Number of Files in Folder " + fArr.length);

            byte Buffer[] = new byte[1024];

            for(int i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                System.out.println(fArr[i].getName());

                // Write file name and size

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer, 0, iRet);
                }

                fiobj.close();
            }

            foobj.close();
            sobj.close();
        }
        else
        {
            System.out.println("There is no such Folder");
        }
        sobj.close();
    }
}
