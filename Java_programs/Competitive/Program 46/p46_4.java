import java.util.*;
import java.io.*;
import java.security.*;

public class p46_4
{
    public static void main(String a[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name : ");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(!fobj.exists() || !fobj.isFile())
        {
            System.out.println("Invalid File\n");
        }
        
        FileInputStream fis = new FileInputStream(fobj);

        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] buffer = new byte[1024];
        int bytesRead;

        while((bytesRead = fis.read(buffer)) != -1)
        {
            md.update(buffer, 0, bytesRead);
        }

        fis.close();

        byte[] checksum = md.digest();

        System.out.print("CheckSum : ");

        for(byte b : checksum)
        {
            System.out.printf("%02x", b);
        }

        System.out.println();
        sobj.close();
        
    }
}