#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>
#include<sys/stat.h>

#define BUFFER_SIZE 1024

int CalculateFileSize(char FileName[])
{
   struct stat sobj;

   stat(FileName,&sobj);

   return sobj.st_size;
}

int main()
{
    char FName[30] = {'\0'};
    int iRet = 0;
    
    printf("Enter the file name : \n");
    scanf("%[^'\n']s",FName);

    iRet = CalculateFileSize(FName);
    printf("Number of bytes file contains are : %d bytes\n",iRet);
   
    return 0;
}