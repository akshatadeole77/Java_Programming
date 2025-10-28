///////////////////////////////////////////////////////////////
// Function Name : calculatePower
// Description   : calculate the power of numbers using loop
// Input         : Integer
// Output        : Integer
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void calculatePower(int base, int exp)
    {
        int result = 1;

        for(int i = 1; i <= exp; i++)
        {
            result = result * base;
        }
        System.out.println(base+"power"+exp+"is"+result);
        
 
       }
       }
class program19_5
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
        
    }
}