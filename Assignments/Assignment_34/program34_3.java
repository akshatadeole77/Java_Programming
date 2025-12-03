import java.util.*;


class Character
{
    public static void Display(char ch)
    {
        char i = 0;
        
            if(ch >= 'A' && ch <= 'Z')
            {
                for(i = ch; i <= 'Z'; i++)
                {
                    System.out.printf("%c", i);
                }
                System.out.printf("\n");
                
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                for(i =ch; i >= 'a'; i++)
                {
                    System.out.printf("%c", i);
                }
                System.out.printf("\n");
            }
                else
                {
                    return;
                }
        }
        

}



class program34_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';

        System.out.printf("Enter character :");
        cValue = sobj.next().charAt(0);

        Character.Display(cValue);

        sobj.close();

    
        
    }
}