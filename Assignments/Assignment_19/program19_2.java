///////////////////////////////////////////////////////////////
// Function Name : displayGrade
// Description   : Display the grade of a student based on marks.
// Input         : Integer
// Output        : String 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void displayGrade(int marks)
    {
        if(marks >= 90)
        {
            System.out.println("Grade: A+");
        }
        else if(marks >= 80)
        {
            System.out.println("Grade: A");
        }
        else if(marks >= 70)
        {
            System.out.println("Grade: B");
        }
        else if(marks >= 60)
        {
            System.out.println("Grade: C");
        }
        else if(marks >= 50)
        {
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Grade: F(Fail)");
        }
        

        
    }
}
class program19_2
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
        
    }
}