package Java_programs.Data_Structure;

class node
{
    public int data;
    public node next;
    
}
public class program444 
{
    public static void main(String[] args)
    {
        node newn = null;
        
        newn = new node();

        newn.data = 11;
        newn.next = null;

        System.out.print("| " + newn.data + " | ->");
        System.out.print(newn.next);
        
    }
    
}
