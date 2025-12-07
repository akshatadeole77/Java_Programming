import java.util.*;

class CharacterX
{
    public static String StrCpyRev(String str)
    {
        StringBuilder dest = new StringBuilder();

        for(int  i = str.length() - 1; i >= 0; i--)
        {
            dest.append(str.charAt(i));
        }
        return dest.toString();
        
    }
}

public class program38_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sobj.nextLine();

        String reversed = CharacterX.StrCpyRev(input);

        System.out.println("Modified string is : " + reversed);

        sobj.close();
    }
}
