import java.util.*;
import java.io.File;
import java.io.IOException;

public class p46_2
{
    public static void main(String a[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name : ");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(fobj.exists())
        {
            if(fobj.isFile())
            {
                System.out.println("Its a Regular file\n");
            }
            else
            {
                System.out.println("Its not a Regular file\n");
            }
        }
        else
        {
            System.out.println("File Not Exist\n");
        }
        sobj.close();
        
    }
}