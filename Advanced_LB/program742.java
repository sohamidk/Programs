// Input : my name is soham
// Output : My Name Is Soham

// Input : my NAME is soHam
// Output : My Name Is Soham

package Advanced_LB;

import java.util.*;

public class program742
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
            if(Arr[i] == ' ')
            {
                if(Arr[i+1] >= 'a' && Arr[i+1] <= 'z')
                {
                    Arr[i+1] = (char)(Arr[i+1] - 32);
                }
            }
        }

        String output = new String(Arr);
        System.out.println("Updated string : " + output);
        
        sobj.close();
    }
}
