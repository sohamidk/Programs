import java.util.*;
import java.io.File;

public class p45_5 
{
    public static void main(String a[])
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory name : ");
        String str = sobj.nextLine();

        File fobj = new File(str);

        if(fobj.exists() && fobj.isDirectory())
        {
            String arr[] = fobj.list();

            System.out.println("Files and directorires are : \n");
            for(i = 0; i < arr.length;i++)
            {
                System.out.println(arr[i]);
            }
        }
        else
        {
            System.out.println("Invalid Directory\n");
        }
        sobj.close();
    }    
}
