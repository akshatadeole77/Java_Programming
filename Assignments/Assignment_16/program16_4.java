///////////////////////////////////////////////////////////////
// Function Name : reverseNumber
// Description   : Accept number from user and display its reverse.
// Input         : Integer
// Output        : Integer 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////



class Logic
{
    void reverseNumber(int num)
    {
       int iDigit = 0;
       int iRev = 0;

       while( num != 0)
       {
        iDigit = num % 10;
        iRev = (iRev * 10) + iDigit;//reverse number
        num = num / 10;
       }
       System.out.println("Reversed number is:"+iRev);
    }
}
class program16_4
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(12345);
    }
}