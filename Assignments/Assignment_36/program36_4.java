import java.util.*;

class Letters
{
    public static String struprx(String str)
    {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= '1' && ch <= '9')  
            {
                System.out.printf("%c", ch);
            }
            

            result.append(ch);
        }

        return result.toString();
    }
}

class program36_4
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String : ");
        String input = sobj.nextLine();

        String output = Letters.struprx(input);

      

        sobj.close();
    }
}
