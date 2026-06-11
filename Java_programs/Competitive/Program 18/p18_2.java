class Logic
{
    void printEvenNum(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt + " ");
            }
        }
    }
}
public class p18_2 {
    public static void main(String[] args) {
        Logic lobj = new Logic();
        lobj.printEvenNum(20);
    }
}
