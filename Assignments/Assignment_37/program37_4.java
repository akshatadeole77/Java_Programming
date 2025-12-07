import java.util.*;

class CharacterX
{
    public static int LastChar(String str, char ch)
    {
        int ipos = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch)
            {
               return ipos;
            }
            
            ipos++;
        }

        return -1;
    }
}

public class program37_4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sobj.nextLine();

        System.out.print("Enter Character: ");
        char cValue = sobj.next().charAt(0);

        int iRet = CharacterX.LastChar(input, cValue);

        System.out.println("Character location is : "+iRet);

        sobj.close();
    }
}
