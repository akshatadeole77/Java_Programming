///////////////////////////////////////////////////////////////
// Function Name : SumOfDigits
// Description   : Accept number from user and find the sum of 
//                 its digits.
// Input         : Integer
// Output        : Integer 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void SumOfDigits(int num)
    {
        int iDigit = 0;
        int iSum = 0;

        if(num < 0)
        {
            num = -num;
        }
        while(num != 0)
        {
            iDigit = num % 10;
            iSum = iSum + iDigit;
            num = num / 10;
        }
        System.out.println("Sum of digits is:"+iSum);

    }
}
class program17_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.SumOfDigits(1234);
    }
}