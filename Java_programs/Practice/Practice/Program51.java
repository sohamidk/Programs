//copy of 50
import java.util.*;
class NumberX
{
    public boolean CheckPerfect(int iNo){
        int iSum = 0;
        int iCnt = 0;
       for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        { 
            if((iNo % iCnt) == 0){
            iSum = iSum + iCnt;
        }
        if(iSum > iNo){
            break;
        }
    }
    if(iSum == iNo){
        return true;
    }else{
        return false;
    }
    }
}
public class Program51{
    public static void main(String args[]){
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();
        NumberX nobj = new NumberX();
        bRet = nobj.CheckPerfect(iValue);

        if(bRet == true){
            System.out.println("Number is Perfect");
        }
        else{
            System.out.println("Number is not Perfect");
        }
        
    }

    }