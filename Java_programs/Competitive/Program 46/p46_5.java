import java.util.*;
import java.io.*;
import java.security.*;

public class p46_5
{
    public static void main(String a[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory name : ");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(!fobj.exists() || !fobj.isDirectory())
        {
            System.out.println("Invalid Directory\n");
            sobj.close();
            return;
        }

        File arr[] = fobj.listFiles();

        System.out.println("\nFile_Name\t\tsize  (Bytes)");
        System.out.println("--------------------------------------------------");
        
       
        sobj.close();
        
    }
}