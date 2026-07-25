#include<stdio.h>
#include<fcntl.h>   //file control(fcntl)


int main()
{
    int fd = 0;     //fd = file discripter
    //fd is index of UFDT 
    fd = creat("Marvellous.txt",0777);

    if(fd == -1)
    {
        printf("Unable to create file\n");
    }
    else
    {
        printf("File gets successfully created\n");
    }
    return 0;
}