///////////////////////////////////////////////////////////////
// Function Name : countEvenOddRange
// Description   : count how many even and odd numbers are 
//                 present between 1 and N
// Input         : Integer
// Output        : String
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////

class Logic
{
    void countEvenOddRange(int n)
    {
        int evenCount = 0;
        int oddCount = 0;

        for(int i=1; i <= n; i++)
        {
            if(i % 2 == 0)
                evenCount++;
            else
                oddCount++;

        }
               
        System.out.println("Total even numbers between 1 and " + n + " = " + evenCount);
        System.out.println("Total odd numbers between 1 and " + n + " = " + oddCount);

                
            }
            
        } 
    

        
class program21_2
{
    public static void main(String args[]) 
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
        
    }
}