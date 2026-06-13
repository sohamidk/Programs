class Logic
{
    void SumEvenNum(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 0; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.println(iSum);
    }
}
public class p20_1 {
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.SumEvenNum(10);
        }
}
