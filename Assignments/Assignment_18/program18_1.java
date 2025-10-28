///////////////////////////////////////////////////////////////
// Function Name : checkPrime
// Description   : Accept number from user and check whether 
//                 it is a prime number or not.
// Input         : Integer
// Output        : String 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////

class Logic
{
    void checkPrime(int num)
    {
        if(num <= 1)
        {
            System.out.println(num + "is not a prime number");
        }
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++)
        {
            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime)
        {
            System.out.println(num + " is a prime number.");
        }
        else
        {
            System.out.println(num + " is not a prime number.");
        }

    }
}
class program18_1
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
        
    }
}