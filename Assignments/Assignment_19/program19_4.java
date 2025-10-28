///////////////////////////////////////////////////////////////
// Function Name : printDigits
// Description   : print each digit of a number separately
// Input         : Integer
// Output        : Integer
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void printDigits(int num)
    {
        int iDigit = 0;

        System.out.println("Digits of" +num+ "are:");

        while (num != 0) 
        {
            iDigit = num % 10;
            System.out.println(iDigit);
            num = num / 10;
            
        }
    }
 }
class program19_4
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
        
    }
}