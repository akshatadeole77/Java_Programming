///////////////////////////////////////////////////////////////
// Function Name : checkSign
// Description   : Accept number from user and check whether 
//                 it is positive, negative or zero.
// Input         : Integer
// Output        : String 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void checkSign(int num)
    {
        if(num > 0)
        {
            System.out.println(num + "is a positive number");
        }
        else if(num < 0)
        {
            System.out.println(num + " is a negative number.");
        }
        else
        {
            System.out.println("The number is zero.");
        }

        
    }
}
class program18_5
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
        
    }
}