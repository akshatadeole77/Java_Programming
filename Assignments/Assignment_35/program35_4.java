import java.util.*;

class Vowels
{
    public static boolean ChkVowels(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                return true;   
            }
        }

        return false;   
    }
}

class program35_4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String : ");
        String input = sobj.nextLine();

        boolean bRet = Vowels.ChkVowels(input);

        if(bRet)
        {
            System.out.println("Contains Vowel");
        }
        else
        {
            System.out.println("There is no Vowel");  
        }

        sobj.close();
    }
}
