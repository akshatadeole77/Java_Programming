///////////////////////////////////////////////////////////////
// Function Name : productOfDigits
// Description   : calculate the product of digits of a number
// Input         : Integer
// Output        : String
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////

class Logic
{
    void productOfDigits(int num)
    {
        int product = 1;
        int digit;

        while (num > 0)
        {
            digit =  num % 10;
            product = product * digit;
            num = num / 10;
            
        }
        System.out.println("Products of digit is:"+product);

    }
}
class program21_1
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
        
    }
}