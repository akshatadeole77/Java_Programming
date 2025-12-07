import java.util.*;

class CharacterX
{
    public static String StrCpyX(String str)
    {   
        StringBuilder dest = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            
            if(ch >= 'A' && ch <= 'Z')
            {
                ch = (char)(ch + 32);
            }

            dest.append(ch);
        }

        return dest.toString();
    }
}

public class program38_3
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sobj.nextLine();

        String modified = CharacterX.StrCpyX(input);

        System.out.println("Modified string is : " + modified);

        sobj.close();
    }
}
