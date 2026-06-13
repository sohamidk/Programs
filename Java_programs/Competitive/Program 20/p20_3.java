class Logic
{
    void checkPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1; iCnt <= (iNo /2) + 1; iCnt++)
        {
           if(iNo % iCnt == 0)
           {
             iSum = iSum + iCnt;
           }
        }
        if(iSum == iNo)
        {
            System.out.println("It is perfect number");
        }
        else
        {
            System.out.println("It is not perfect number");
        }
    }
}
public class p20_3 {
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.checkPerfect(6);
        }
}
