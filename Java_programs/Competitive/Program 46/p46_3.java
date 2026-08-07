import java.util.*;
import java.io.File;
import java.io.IOException;

public class p46_3
{
    public static void main(String a[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory name : ");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(fobj.exists())
        {
            System.out.println("Directory already exists");
        }
        else
        {
            if(fobj.mkdir())
            {
                System.out.println("Directory created Successfully\n");
            }
            else
            {
                System.out.println("Unable to create Directory\n");
            }
        }

        sobj.close();
        
    }
}