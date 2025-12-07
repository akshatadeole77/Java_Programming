import java.util.*;

class Frequency
{
    public static int Difference(String str)
    {
        int Cap = 0;
        int Small = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
            {
                Cap++;
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                Small++;
            }
        }

        return Small - Cap;   
    }
}

class program35_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String : ");
        String input = sobj.nextLine();

        int iRet = Frequency.Difference(input);

        System.out.println("Difference: " + iRet);

        sobj.close();
    }
}
