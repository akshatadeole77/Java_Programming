import java.util.*;


class Convert
{
    public static void Display(char ch)
    {
            if(ch >= 'a' && ch <= 'z')
            {
                System.out.printf("Capital letter is : %c\n", ch-32);
            }
            else if(ch >= 'A' && ch <= 'Z')
            {
                System.out.printf("Small letter is : %c\n", ch + 32);
            }
        }

}



class program34_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';

        System.out.printf("Enter character :");
        cValue = sobj.next().charAt(0);

        Convert.Display(cValue);

        sobj.close();

    
        
    }
}