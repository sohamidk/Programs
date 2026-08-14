// Input : india is my country i live in india
// Output : bharat is my country i live in bharat

package Advanced_LB;

import java.util.*;

public class program750
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        int iCount = 0;

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("india"))
            {
                iCount++;
            }
        }

        System.out.println("Frequency of word : " + iCount);

        sobj.close();
    }
}
