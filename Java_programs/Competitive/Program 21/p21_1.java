class Logic
{
    void productOfDigit(int iNo)
    {
        int iDigit = 0;
        int iMulti = 1;
        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iMulti = iMulti * iDigit;
            iNo = iNo / 10;
        }
          System.out.println(iMulti);
    }
}
public class p21_1{
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.productOfDigit(234);
        }
}
