// Input : my name is soham
// Output : ym eman si mahos

package Advanced_LB;

import java.util.*;

public class program745
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        StringBuffer sb = null;

        for(int i = 0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);
            System.out.println(sb.reverse());
        }


    

        sobj.close();
    }
}
