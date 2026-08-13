package Java_programs.Practice.Practice;
import java.util.*;
public class MarvellousArrayDeque
{
    public static void main(String args[])
    {
        ArrayDeque<String> dq = new ArrayDeque<>();

        dq.push("Marvellous");
        dq.push("Infosystems");

        System.out.println("Stack Style : " + dq);

        dq.pop();

        System.out.println("After Pop : " + dq);
    }
    
}
