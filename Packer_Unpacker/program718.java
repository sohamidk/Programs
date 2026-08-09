package Packer_Unpacker;
import java.util.*;

class StringX
{
    int CountWords(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        return Tokens.length;
    }
     
    void DisplayWords(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        for(int i = 0; i < Tokens.length; i++)
        {
            System.out.println(Tokens[i] + " : " + Tokens[i].length());
        }
    }

    void LargestWord(String str)
    {
        int max = 0;
        String temp = null;

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");
        
        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].length() > max)
            {
                max = Tokens[i].length();
                temp = Tokens[i];
            }
        }
        System.out.println("Largest word length is : " + max);
        System.out.println("Largest word is : " + temp);
    }

    int PatternMatching(String str, String word)
    {
        int iCount = 0;
        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Tokens[] = str.split(" ");

        for(int i = 0; i < Tokens.length; i++)
        {
            if(word.equals(Tokens[i]))
            {
                iCount++;
            }
        }
        return iCount;
    }
    
}

public class program718
{
    public static void main(String a[])
    {
        StringX strobj = new StringX();
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        String str = null;


        System.out.println("Enter String : ");
        str = sobj.nextLine();


        strobj.LargestWord(str);

        iRet = strobj.PatternMatching(str, "are");
        System.out.println("Frequency of the word is : " + iRet);

    }

}
