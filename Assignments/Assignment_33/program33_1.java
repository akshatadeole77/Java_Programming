import java.util.*;


class Alphabet
{
    public static boolean ChkAlpha(char ch)
    {
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}



class program33_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);
        bRet = Alphabet.ChkAlpha(cValue);

    if(bRet == true)
    {
        System.out.println("It is character");
    }
    else
    {
        System.out.println("It is not character");
    }
    sobj.close();


    
        
    }
}