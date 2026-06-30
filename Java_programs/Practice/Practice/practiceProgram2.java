import java.util.*;
class StringX
{
    public void ReverseString(String str)
    {
        char Arr[] = str.toCharArray();
        int i = 0;
        int j = Arr.length;
        int start = Arr[0];
        while(Arr[i] !=  j)
        {
            Arr[i]++;
        }
        while(start <= j)
        {
            System.out.print(j);
            j--;
        }
        start++;
    }
}
public class practiceProgram2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;

        StringX strobj = new StringX();

        System.out.println("Enter a string : ");
        data = sobj.nextLine();

        strobj.ReverseString(data);
        sobj.close();
    }
}