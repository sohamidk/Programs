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


class SinglyLL
{
    private node first;
    private int iCount;

    
    public SinglyLL()       //constructor
    {
        this.first = null;
        this.iCount = 0;
    }


    public void Display()
    {
        node temp = null;
        temp = first;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        if(first == null)
        {
            this.first = newn;
        }
        else
        {
            newn.next = this.first;
            this.first = newn;
        }
        iCount++;
    }


    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);
        

        if(first == null)
        {
            this.first = newn;
        }
        else
        {
           
        }
        iCount++;
    }
    

    public void InsertAtPos(int iNo,int iPos)
    {

    }


    public void DeleteFirst()
    {}


    public void DeleteLast()
    {}


    public void DeleteAtPos(int iPos)
    {}


}


class program453 
{
    public static void main(String[] args)
    {
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.Display();

    }
    
}
