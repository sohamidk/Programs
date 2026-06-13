class Logic
{
    void findSmallestDigit(int iNo)
    {
        int iDigit = 0;
        int iSmall = 9;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
             if(iDigit < iSmall)
            {
                iSmall  = iDigit;   
            }
            iNo = iNo / 10;
        }
          System.out.println(iSmall);
    }
}
public class p20_5{
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.findSmallestDigit(87654);
        }
}
