// Input : india is my country i live in india
// Output : bharat is my country i live in bharat

package Advanced_LB;

import java.util.*;

public class program751
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        StringBuffer Finalstr = new StringBuffer("");

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("india"))
            {
                Finalstr = Finalstr.append("bharat");
                Finalstr = Finalstr.append(" ");

                continue;
            }
            Finalstr = Finalstr.append(Tokens[i]);
            Finalstr = Finalstr.append(" ");
        }

        String Output = new String(Finalstr);
        Output = Output.trim();

        System.out.println(Output);

        sobj.close();
    }
}
