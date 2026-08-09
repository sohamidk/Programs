package Packer_Unpacker;
import java.util.*;
import java.io.*;

public class program727
{
    public static void main(String[] args) throws Exception
    {
        int iRet = 0;
        int size = 0;
        int i = 0 , j = 0;

        byte Buffer[] = new byte[1024];
        byte bHeader[] = null;
        

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
            String header = "";
            System.out.println("Folder exists");

            File fobjPack = new File(PackFileName);
            fobjPack.createNewFile();                   //Pack File gets created.

            foobj = new FileOutputStream(fobjPack);


            File fArr[] = fobjFolder.listFiles();

            System.out.println("Number of Files in Folder " + fArr.length);


            for(i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                header = header + fArr[i].getName();
                header = header + " ";
                header = header + fArr[i].length();

                size = 100 - header.length();

                for(j = 1; j <= size; j++)
                {
                    header = header + " ";
                }

                bHeader = header.getBytes();
                
                // Write file name and size

                foobj.write(bHeader);

                // while((iRet = fiobj.read(Buffer)) != -1)
                // {
                //     foobj.write(Buffer, 0, iRet);
                // }

                fiobj.close();
                header = "";
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
