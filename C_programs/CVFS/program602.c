#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>
#include<sys/stat.h>

#define BUFFER_SIZE 1024

void DisplayFileInformation(char FileName[])
{
   struct stat sobj;

   stat(FileName,&sobj);

   printf("File Name : %s\n",FileName);
   printf("Inode Number : %lu\n",sobj.st_ino);
   printf("File size is : %ld\n",sobj.st_size);
}

int main()
{
    char FName[30] = {'\0'};
    
    printf("Enter the file name : \n");
    scanf("%[^'\n']s",FName);

    DisplayFileInformation(FName);
   
    return 0;
}