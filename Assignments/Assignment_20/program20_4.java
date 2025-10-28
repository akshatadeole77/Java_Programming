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
    void findLargestDigit(int num)
    {
        int largest = 0;

        while(num > 0)
        {
            int digit = num % 10;

            if(digit > largest)
            {
                largest = digit;
            }
            num = num/10;
        }
        System.out.println("Largest digit is:"+largest);

        
       
       }
    }
class program20_4
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
        
    }
}