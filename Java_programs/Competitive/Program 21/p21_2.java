class Logic
{
    void countEvenOdd(int iNo)
    {
        int iCnt = 0;
        int iCountEven = 0, iCountOdd = 0;
        for(iCnt = 0; iCnt < iNo;iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }
        }
        System.out.println("Count of even number is : " + iCountEven);
        System.out.println("Count of odd number is : " + iCountOdd);
    }  
}
public class p21_2{
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.countEvenOdd(50);
        }
}
