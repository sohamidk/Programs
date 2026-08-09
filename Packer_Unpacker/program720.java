package Packer_Unpacker;


public class program720
{
    public static void main(String[] args)
    {
        String header = "A.txt 10";

        System.out.println("Actual header length : " + header.length());        /// 8
        
        System.out.println("Number of white spaces we need : " + (100 - header.length()));        //11

    }

}
