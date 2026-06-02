//copy of 50
import java.util.*;
class NumberX
{
    public boolean CheckPrime(int iNo){
        int iCnt = 0;

       for(iCnt= 2; iCnt <= (iNo / 2); iCnt++)
        { 
            if((iNo % iCnt) == 0){  //checks Factors
                break;
        }
       
    }
        if(iCnt < (iNo/2)){
            return false;
        }
        else{
            return true;
        }
    }
}
class program65{
    public static void main(String args[]){
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();
        bRet = nobj.CheckPrime(iValue);

        if(bRet == true){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is not prime");
        }
        
    }
}