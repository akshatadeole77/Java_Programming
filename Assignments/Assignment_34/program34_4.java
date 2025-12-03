import java.util.*;


class Speical
{
    static boolean ChkSpecial(char ch)
    {
        if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        

}



class program34_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;

        System.out.printf("Enter character :");
        cValue = sobj.next().charAt(0);

        bRet = Speical.ChkSpecial(cValue);

        if(bRet == true)
        {
            System.out.println("It is a special character");
        }
        else
        {
            System.out.println("It is not a special character");
        }

        Speical.ChkSpecial(cValue);

        sobj.close();

    
        
    }
}