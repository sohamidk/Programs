class Logic
{
    void findLargestDigit(int iNo)
    {
        int iDigit = 0;
        int iLarge = 0;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
             if(iLarge < iDigit)
            {
                iLarge  = iDigit; 
            }
            iNo = iNo / 10;
        }
          System.out.println(iLarge);
    }
}
public class p20_4{
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.findLargestDigit(87654);
        }
}
