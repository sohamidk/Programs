// Input : my name is soham
// Output : My Name Is Soham

// Input : my NAME is soHam
// Output : My Name Is Soham

package Advanced_LB;

import java.util.*;

public class program741
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        str = str.toLowerCase();

        System.out.println(str);

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
        
        sobj.close();
    }
}
