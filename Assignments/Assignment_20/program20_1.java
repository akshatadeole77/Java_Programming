///////////////////////////////////////////////////////////////
// Function Name : sumEvenNumbers
// Description   : find the sum of all even numbers up to N
// Input         : Integer
// Output        : Integer
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void sumEvenNumbers(int n)
    {
        int iSum = 0 ;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                iSum = iSum + i;
            }
        }
        System.out.println("Sum of all even numbers"+n+"is:"+iSum);

       
       }
    }
class program20_1
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
        
    }
}