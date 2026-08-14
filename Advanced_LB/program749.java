// Input : my name is amit school is name is Abhinav city name is pune
// Output : 3

package Advanced_LB;

import java.util.*;

public class program749
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
            if(Tokens[i].equals("name"))
            {
                iCount++;
            }
        }

        System.out.println("Frequency of word : " + iCount);

        sobj.close();
    }
}
