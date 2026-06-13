class Logic
{

    void displayGrades(int marks)
    { 
            if(marks < 50 )
                System.out.println("P");
        
            else if(marks > 50 && marks < 60)
            {
                System.out.println("B");
            }
          
            else if(marks > 60 && marks < 70)
            {
                System.out.println("B+");
            }
         
            else if(marks > 70 && marks < 80)
            {
                System.out.println("A");
            }
          
            else if(marks > 80 && marks < 90)
            {
                System.out.println("A+");
            }
          
           else
            {
                System.out.println("O");
            }
        
    }
}

public class p19_2 {
        public static void main(String[] args) {
            Logic lobj = new Logic();
            lobj.displayGrades(82);
        }
}
