import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class p46_1
{
    public static void main(String a[]) throws IOException
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First File name : ");
        String sName1 = sobj.nextLine();

        System.out.println("Enter Second File name : ");
        String sName2 = sobj.nextLine();

        
        File fName1 = new File(sName1);
        File fName2 = new File(sName2);

        fName1.createNewFile();
        fName2.createNewFile();


        FileWriter fW = new FileWriter(fName1);

        System.out.println("Enter data you want to copy : ");
        String data = sobj.nextLine();

        fW.write(data);
        fW.close();

        FileReader fR = new FileReader(fName1);
        FileWriter fW2 = new FileWriter(fName2);

        int ch;

        while((ch = fR.read()) != -1)
        {
            fW2.write(ch);
        }

        fR.close();
        fW2.close();

        System.out.println("Data Copied successfully");

        sobj.close();
        
    }
}