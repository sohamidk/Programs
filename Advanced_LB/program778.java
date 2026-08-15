import java.util.*;

public class program778
{
    public static void main(String args[])
    {
        HashMap<String , Integer> hobj = new HashMap<String , Integer>();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        
        String Tokens[] = str.split(" ");

        for(String s : Tokens)
        {
            System.out.println(s);
        }

        hobj.clear();
        sobj.close();
    }
}
