import java.util.*;

class Letters
{
    public static String struprx(String str)
    {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')  
            {
                ch = (char)(ch - 32);
            }

            result.append(ch);
        }

        return result.toString();
    }
}

class program36_2
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String : ");
        String input = sobj.nextLine();

        String output = Letters.struprx(input);

        System.out.println("Uppercase String : " + output);

        sobj.close();
    }
}
