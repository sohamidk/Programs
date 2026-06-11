
class Logic
{
    void sumOfDigits(int iNum)
    {
        int iDigit = 0, iSum = 0;
        while(iNum < 0)
        {
             iDigit = iDigit % 10;
             iSum = iSum + iDigit;
             iNum = iNum / 10;
        }
        System.out.println(iSum);
    }
}
public class p17_1 
{
    public static void main(String[] args) 
    {   
        Logic lobj = new Logic();
        lobj.sumOfDigits(1234);
    }

}
