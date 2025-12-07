import java.util.*;

class CharacterX
{
    public static int CountChar(String str, char ch)
    {
        int iCnt = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ch)
            {
                iCnt++;
            }
        }

        return iCnt;
    }
}

public class program37_2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sobj.nextLine();

        System.out.print("Enter Character: ");
        char cValue = sobj.next().charAt(0);

        int iRet = CharacterX.CountChar(input, cValue);

        System.out.println("Character Frequency is: " + iRet);

        sobj.close();
    }
}
