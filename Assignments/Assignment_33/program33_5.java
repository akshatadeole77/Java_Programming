import java.util.*;


class Alphabet
{
    public static void DisplaySchedule(char chDiv)
    {
        if((chDiv >= 'a' && chDiv <= 'z'))
        {
           chDiv = (char)(chDiv - 32);
        }
         switch(chDiv)
        {
            case 'A':
                System.out.println("Exam time for Division A is 7:00 AM");
                break;

            case 'B':
                System.out.println("Exam time for Division B is 8:30 AM");
                break;

            case 'C':
                System.out.println("Exam time for Division C is 9:00 AM");
                break;

            case 'D':
                System.out.println("Exam time for Division D is 10:30 AM");
                break;

            default:
                System.out.println("Invalid Division");
        }
        
    }
}



class program33_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
      

        System.out.println("Enter your division : ");
        cValue = sobj.next().charAt(0);
        Alphabet.DisplaySchedule(cValue);

   
    sobj.close();


    
        
    }
}