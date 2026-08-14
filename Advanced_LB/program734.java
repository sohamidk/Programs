package Advanced_LB;

import java.util.*;

public class program734 
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        System.out.println("Number of Words : " + Tokens.length);

        sobj.close();
    }
}
