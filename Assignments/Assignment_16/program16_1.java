///////////////////////////////////////////////////////////////
// Function Name : CalculateSum
// Description   : Accept number from user and display the
//                 summation of first N natural numbers.
// Input         : Integer
// Output        : Integer (Displayed on screen)
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////



class Logic
{
    void CalculateSum(int n)
    {
        int iSum = 0;

        for(int i = 1; i <= n; i++)
        {
            iSum = iSum + 1;
            System.out.println("Sum of first"+n+"natural number is"+iSum);
        }

    }
}
class program16_1
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.CalculateSum(10);
    }
}