///////////////////////////////////////////////////////////////
// Function Name : findMin
// Description   : Accept two numbers from user and find the 
//                 minimum among them.
// Input         : Integer
// Output        : Integer 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void findMin(int a, int b,int c)
    {
        if(a <= b && a <= c)
        {
            System.out.println(a + " is smallest number ");
        }
        else if(b <= a && b <= c)
        {
            System.out.println(b + " is smallest number ");
        }
        else
        {
            System.out.println(c + " is the smallest number.");
        }
         
        

    }
}
class program17_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMin(3,7,2);
    }
}