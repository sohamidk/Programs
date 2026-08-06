import java.io.File;
import java.io.IOException;

public class p45_1 
{
    public static void main(String args[])
    {
        try
        {
            File file = new File("Marvellous.txt");

            if(file.createNewFile())
            {
                System.out.println("File created successfully\n");
            }
            else
            {
                System.out.println("File Already Exists\n");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
