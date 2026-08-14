// Input : my name is soham
// Output : ym eman si mahos

package Advanced_LB;

import java.util.*;

class StringX
{
    public String WordReverse(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        StringBuffer sb = null;
        StringBuffer Finalstr = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            sb = new StringBuffer(Tokens[i]);
            sb = sb.reverse();
            Finalstr = Finalstr.append(sb);     // to get in one line
            Finalstr = Finalstr.append(" ");    // to get space between tokens
        }

        String Output = new String(Finalstr);

        Output = Output.trim();

        return Output;

    }
}

public class program748
{
    public static void main(String args[])
    {
        String sRet = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        StringX strobj = new StringX();

        sRet = strobj.WordReverse(str);

        System.out.println(sRet);

        sobj.close();
    }
}
