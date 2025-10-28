///////////////////////////////////////////////////////////////
// Function Name : checkLeapYear
// Description   : Check whether a given year is a leap year or
//                 not.
// Input         : Integer
// Output        : String 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void checkLeapYear(int year)
    {
        if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
        {
            System.out.println(year + "is a leap year");
        }
        else
        {
             System.out.println(year + "is not a leap year");
        }
        

        
    }
}
class program19_1
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
        
    }
}