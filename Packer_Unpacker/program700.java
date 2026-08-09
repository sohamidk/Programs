package Packer_Unpacker;


public class program700
{
    public static void main(String[] args)
    {
        String header = "Marvellous";

        System.out.println(header);    

        header.replaceAll("l", "L");        // ISSUE

        System.out.println(header);
    }

}
