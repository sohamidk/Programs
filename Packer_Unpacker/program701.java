package Packer_Unpacker;


public class program701
{
    public static void main(String[] args)
    {
        String header = "Marvellous";

        System.out.println(header);    

        header = header.replaceAll("l", "L");        // ISSUE RESOLVED

        System.out.println(header);
    }

}
