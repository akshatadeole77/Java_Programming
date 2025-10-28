///////////////////////////////////////////////////////////////
// Function Name : findMax
// Description   : Accept two numbers from user and find the 
//                 maximum among them.
// Input         : Integer
// Output        : Integer 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void findMax(int a, int b)
    {
        if(a>b)
        {
            System.out.println(a + " is greater than " + b);
        }
        else if(b > a)
        {
            System.out.println(b + " is greater than " + a);
        }
        else
        {
            System.out.println("Both numbers are equal.");
        }
         
        

    }
}
class program17_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20,15);
    }
}