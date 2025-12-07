import java.util.*;

class Letters
{
    public static String CountWhite(String str)
    {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == ' ')  
            {
                ch++;
            }
            

            result.append(ch);
        }

        return result.toString();
    }
}

class program36_5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String : ");
        String input = sobj.nextLine();

        String output = Letters.CountWhite
        (input);

      

        sobj.close();
    }
}
