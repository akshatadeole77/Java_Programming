///////////////////////////////////////////////////////////////
// Function Name : countDigits
// Description   : Accept number from user and count the number 
//                 of digits in that number.
// Input         : Integer
// Output        : Integer 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////



class Logic
{
    void countDigits(int num)
    {
       int iCount = 0;
    
       if(num < 0)
       {
        num = -num;
       }
       if(num == 0)
       {
        iCount = 1;
       }
       else
       {
            while (num != 0) 
            {
                num = num / 10;
                iCount++;
            }
       }
       System.out.println("Numbers of digits are:"+iCount);
    }
}
class program16_5
{
    public static void main (String args[])
    {
        Logic obj = new Logic();
        obj.countDigits(786543);
    }
}