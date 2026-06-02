#include<stdio.h>
int Divide(int iNo1, int iNo2){
    int iAns = 0;
    if(iNo2 > iNo1){
        return -1;
    }
    iAns = iNo1 / iNo2;
    return iAns;
}

int main()
{
    int iVal1 = 15;
    int iVal2 = 5;

    int iRet = Divide(iVal1, iVal2);
    printf("Division is %d", iRet);
    return 0;
}


