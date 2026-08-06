import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class p45_2 
{
    public static void main(String args[])
    {
        System.out.println("Enter FileName to Open :");
        Scanner sobj = new Scanner(System.in);
        String FileName = sobj.nextLine(); 

        File file = new File(FileName);

        try
        {
            Scanner sobj1 = new Scanner(file);

            System.out.println("File Opened Successfully\n");
            sobj1.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error : File Not found\n");
        }
        sobj.close();
        
    }
    
    
}
