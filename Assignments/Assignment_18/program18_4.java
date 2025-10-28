///////////////////////////////////////////////////////////////
// Function Name : sumEvenOddDigits
// Description   : Accept number from user and display all 
//                 odd numbers up to that number.
// Input         : Integer
// Output        : Integer 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void sumEvenOddDigits(int num)
    {
        int iDigit = 0;

        System.out.println("Even digits are:");
        
        int temp = num;  
        while (temp != 0)
        {
            iDigit = temp % 10;
            if (iDigit % 2 == 0)
            {
                System.out.println(iDigit);
            }
            temp = temp / 10;
        }

        System.out.println("Odd digits are:");
        while (num != 0)
        {
            iDigit = num % 10;
            if (iDigit % 2 != 0)
            {
                System.out.println(iDigit);
            }
            num = num / 10;
        }
    }
}
class program18_4
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(2030);
        
    }
}