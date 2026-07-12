package Java_programs.Data_Structure;

class node
{
    public int data;
    public node next;
    
    node(int iNo)
    {
        this.data = iNo;
        this.next = null;
    }

}
class program450 
{
    public static void main(String[] args)
    {
        node newn = new node(11);
        
        System.out.println(newn.data);
        System.out.println(newn.next);

    }
    
}
