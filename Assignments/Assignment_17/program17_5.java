///////////////////////////////////////////////////////////////
// Function Name : printTable
// Description   : Accept number from user and display its 
//                 multiplication table.
// Input         : Integer
// Output        : Integer 
// Author        : Akshata Dhananjay Deole
// Date          : 28/10/2025
///////////////////////////////////////////////////////////////
class Logic
{
    void printTable(int num)
    {
        System.out.println("Multiplication table of " + num + ":");
        
        for(int i = 1; i <= 10; i++)
        {
            System.out.println((num * i));
        }
         
        

    }
}
class program17_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}