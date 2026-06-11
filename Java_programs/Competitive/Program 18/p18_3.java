class Logic
{
    void printOddNum(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 1)
            {
                System.out.println(iCnt + " ");
            }
        }
    }
}
public class p18_3 {
    public static void main(String[] args) {
        Logic lobj = new Logic();
        lobj.printOddNum(20);
    }
}