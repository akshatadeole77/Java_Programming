///////////////////////////////////////////////////////////////
// Function Name : checkEvenOdd
// Description   : Accept number from user and check whether
//                 it is even or odd.
// Input         : Integer
// Output        : String 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
//////////////////////////////////////////////////////////////



class Logic
{
    void checkEvenOdd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println(num+"is a even number");
        }
        else
        {
            System.out.println(num+"is a odd number");
        }
    }
}
class program16_2
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}