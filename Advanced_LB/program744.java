package Advanced_LB;

import java.util.*;

public class program744
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        StringBuffer sb = new StringBuffer(str);
        
        System.out.println(sb.reverse());

    

        sobj.close();
    }
}
