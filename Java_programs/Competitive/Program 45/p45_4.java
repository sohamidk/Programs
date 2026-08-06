import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class p45_4
{
    public static void main(String args[])
    {
        try
        {
            File fobj = new File("Marvellous.txt");

            Scanner sobj = new Scanner(fobj);

            while(sobj.hasNextLine())
            {
                System.out.println(sobj.nextLine());
            }

            System.out.println("File Successfully read\n");
            sobj.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found\n");
        }
    }
}
