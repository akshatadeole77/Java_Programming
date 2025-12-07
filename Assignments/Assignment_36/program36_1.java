import java.util.*;

class Letters
{
    public static String strlwrx(String str)
    {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z')  
            {
                ch = (char)(ch + 32);
            }

            result.append(ch);
        }

        return result.toString();
    }
}

class program36_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String : ");
        String input = sobj.nextLine();

        String output = Letters.strlwrx(input);

        System.out.println("Lowercase String : " + output);

        sobj.close();
    }
}
