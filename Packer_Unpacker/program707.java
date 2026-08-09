package Packer_Unpacker;
import java.util.*;


public class program707
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        System.out.println("String is : " + str + " Having Length : " + str.length());

        str = str.trim();

        System.out.println("String is : " + str + " Having Length : " + str.length());

        str = str.replaceAll(" ", "");
       
        System.out.println("String is : " + str + " Having Length : " + str.length());
    }

}
