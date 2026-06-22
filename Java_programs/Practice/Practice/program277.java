import java.util.*;
import Marvellous.program280;

class program277
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iRet = 0;
        String data = null;
        program280 strobj = new program280();     
        

        System.out.println("Enter string : ");
        data = sobj.nextLine();


        iRet = strobj.CountCapital(data);
        System.out.println("Count of capital letters are : " + iRet);


        iRet = strobj.CountSmall(data);
        System.out.println("Count of small letters are : " + iRet);
        

        iRet = strobj.CountDigits(data);
        System.out.println("Count of digits  are : " + iRet);


        iRet = strobj.CountSpace(data);
        System.out.println("Count of white spaces are : " + iRet);

        iRet = strobj.CountSpace(data);
        System.out.println("Count of special symbols are : " + iRet);
        
        sobj.close();
    }    
}
