///////////////////////////////////////////////////////////////
// Function Name : findLargestDigit
// Description   : find largest digit in given number
// Input         : Integer
// Output        : String
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void findSmallestDigit(int num)
    {
        int smallest = 9; //maximum possible digit is 9

        while(num > 0)
        {
            int digit = num % 10;

            if(digit < smallest)
            {
                smallest = digit;
            }
            num = num/10;
        }
        System.out.println("Smallest digit is:"+smallest);

        
       
       }
    }
class program20_5
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(83429);
        
    }
}