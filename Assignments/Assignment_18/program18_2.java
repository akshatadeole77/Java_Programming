///////////////////////////////////////////////////////////////
// Function Name : printEvenNumbers
// Description   : Accept number from user and display all 
//                 even numbers up to that number.
// Input         : Integer
// Output        : Integer 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void printEvenNumbers(int num)
    {
        if(num <= 1)
        {
           System.out.println("Even numbers up to " + num + " are:");
        }
        

        for (int i = 2; i <= num; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        } 
    }
}
class program18_2
{
    public static void main(String args [])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
        
    }
}