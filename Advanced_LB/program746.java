// Input : my name is soham
// Output : ym eman si mahos

package Advanced_LB;

import java.util.*;

public class program746
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
        StringBuffer Finalstr = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);
            sb = sb.reverse();
            Finalstr = Finalstr.append(sb);
        }

        System.out.println(Finalstr);

        sobj.close();
    }
}
