package Packer_Unpacker;


public class program719
{
    public static void main(String[] args)
    {
        String header = "    India  is  my  country    ";

        System.out.println(header);

        header = header.trim();  
        
        System.out.println(header);

        header = header.replaceAll("  ", " ");

        System.out.println(header);
    }

}
