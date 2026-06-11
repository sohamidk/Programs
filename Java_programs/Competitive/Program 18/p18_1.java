class Logic
{
    int checkPrime(int iNo)
    {
        if(iNo <= 0)
        {
            System.out.println(iNo + "is not prime number");
        }
        else if(iNo > 0)
        {
            int iCnt = 0, iFlag = 0;
            for(iCnt = 2; iCnt <= iNo/2; iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    iFlag = 1;
                }
            }
        if(iFlag == 0)
          {
            System.out.println("it is prime number");
          }
        else
            {
             System.out.println("it is not prime number");
            }
        }
        return 0;
    }
}

class p18_1
{
    public static void main(String[] args) {
        Logic lobj = new Logic();
        lobj.checkPrime(11);
    }
}