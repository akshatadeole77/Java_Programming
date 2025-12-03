import java.util.*;


class ASCII
{
    public static void Display(char ch)
    {
        int Ascii = (int) ch;

        System.out.println("--------------------------------------------------------\n");
        System.out.printf("Character : %c\n", ch);
        System.out.printf("Decimal : %d\n", Ascii);
        System.out.printf("Hexadeciml : %X\n", Ascii);
        System.out.printf("Octal : %o\n", Ascii);
        
    }
        

}



class program34_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';

        System.out.printf("Enter character :");
        cValue = sobj.next().charAt(0);

        ASCII.Display(cValue);

        sobj.close();

    
        
    }
}