///////////////////////////////////////////////////////////////
// Function Name : findFactorial
// Description   : Accept number from user and find its factorial 
//                 using a for loop.
// Input         : Integer
// Output        : Integer 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////



class Logic
{
    void findFactorial(int num)
    {
       int fact = 1;

       for(int i = 1; i <= num; i++)
       {
        fact = fact * 1;
       }
       System.out.println("Factorial of" +num+ "is:"+fact);
    }
}
class program16_3
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}