///////////////////////////////////////////////////////////////
// Function Name : checkPalindrome
// Description   : Accept number from user and check whether 
//                 it is a palindrome or not.
// Input         : Integer
// Output        : String 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void checkPalindrome(int num)
    {
        int iDigit = 0;
        int iRev = 0;
        int temp = num; //store original number

        if(num < 0)
        {
            num = -num;
            temp = num;
        }
        while(num != 0)
        {
            iDigit = num % 10;
            iRev = (iRev*10) + iDigit;
            num = num / 10;
        }
        if(temp == iRev)
        {
            System.out.println(temp+"is a palindrome number.");
        }
        else
        {
            System.out.println(temp+"is not a palindrome number");
        }
        

    }
}
class program17_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}