///////////////////////////////////////////////////////////////
// Function Name : checkDivisible
// Description   : check whether number is divisible by 5 and 
//                 11 or not
// Input         : Integer
// Output        : String 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void checkDivisible(int num)
    {
        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println(num + "is divisible by both 5 and 11");
        }
        else
        {
            System.out.println(num + "is not divisible by both 5 and 11");
        }
        }
        
 }
class program19_3
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
        
    }
}