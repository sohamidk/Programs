import java.util.*;
//Converting string into array
class StringX
{
    public int CountCapital(String str)
    {
        int i = 0, iCount = 0;
        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
         if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                iCount++;
            }
        }
      return iCount;
    }
    public int CountSmall(String str)
    {
        int i = 0, iCount = 0;
        char Arr[] = str.toCharArray();

        for(i = 0; i< Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                iCount++;
            }
        }
        return iCount;
    }
}
class program272
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iRet = 0;
        String data = null;
        StringX strobj = new StringX();
        
        System.out.println("Enter string : ");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);
        System.out.println("Count of capital letters are : " + iRet);

        iRet = strobj.CountSmall(data);
        System.out.println("Count of small letters are : " + iRet);
        
        sobj.close();
    }    
}
