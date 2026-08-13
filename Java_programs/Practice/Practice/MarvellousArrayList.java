package Java_programs.Practice.Practice;

import java.util.*;
public class MarvellousArrayList 
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("Marvellous");
        list.add("Infosystems");
        list.add("Marvellous");

        System.out.println("List : " + list);
        System.out.println("First element : " + list.get(0));
        System.out.println("Contains Marvellous ? " + list.contains("Marvellous"));

        list.remove("Infosystems");

        System.out.println("After Removal : " + list);
    }
    
}
