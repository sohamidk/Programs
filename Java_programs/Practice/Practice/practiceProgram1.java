import java.util.*;

class stringX
{
    public void Display(String str)
    {
        int i = 0;
        for(i = str.length()-1; i >=0; i--)
        {
           System.out.print(str.charAt(i));
        }
        System.out.println();
      
    }
}
public class practiceProgram1 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        stringX strobj = new stringX();
       
        String data = null;
        String sRet = null;
        System.out.println("Enter a String : ");
        data = sobj.nextLine();
       
        strobj.Display(data);
        sobj.close();


    }
}
