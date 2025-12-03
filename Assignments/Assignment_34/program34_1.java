import java.util.*;


class ASCII
{
    public static void DisplayASCII(char ch)
    {
        int i =0;

        System.out.println("----------------------------------------------------\n");
        System.out.println(" Symbol \t Decimal \t Hexadecimal \t Octal\n");
        System.out.println("----------------------------------------------------\n");

        for(i = 0; i < 255; i++)
        {
            if(i < 32 || i == 127)
            {
                System.out.printf("  NP\t\t%d\t%X\t\t%o\n", i, i, i);
            }
            else
            {
                System.out.printf("   %c\t\t%d\t%X\t\t%o\n", i, i, i, i);
            }
        }

        System.out.println("----------------------------------------------------\n");
        
    }
}



class program34_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';

        ASCII.DisplayASCII(cValue);

        sobj.close();

    
        
    }
}