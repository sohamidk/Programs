import java.util.*;
//Converting string into array
class StringX
{
    public String update(String str)
    {
        int i = 0;
        char Arr[] = str.toCharArray();
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'A' || Arr[i] == 'a')
            {
                Arr[i] = '_';
            }
        }
        String ret = new String(Arr);           //converting array to string
        return ret;
    }
   
}
class program278
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        String data = null;
        StringX strobj = new StringX();
        String sRet = null;

        System.out.println("Enter string : ");
        data = sobj.nextLine();
       
        sRet = strobj.update(data);

        System.out.println("Updated string is : " + sRet);
        sobj.close();
    }    
}
