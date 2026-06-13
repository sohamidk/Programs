class Logic
{
    void printRev(int iNo)
    {
        int iCnt = 0;
        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
           System.out.println(iCnt);
        }
    }
}
public class p20_2 {
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.printRev(10);
        }
}
