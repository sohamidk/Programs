class Logic
{
    void countFactor(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iCount++;
            }
        }
        System.out.println(iCount);
    }  
}
public class p21_4{
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.countFactor(20);
        }
}
