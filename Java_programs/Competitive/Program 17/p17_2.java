class Logic
{
    void checkPallindrome(int iNum)
    {
        int iDigit = 0, iRev = 0;
        while(iNum > 0)
        {
            iDigit = iNum % 10;
            iRev = iRev * 10 + iDigit;
            iNum = iNum / 10;
        }
        System.out.println(iRev + "is Pallindrome");
    }
}

public class p17_2 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.checkPallindrome(121);
    }
}
