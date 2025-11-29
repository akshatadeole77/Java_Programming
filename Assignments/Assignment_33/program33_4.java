import java.util.*;


class Alphabet
{
    public static boolean ChkSmall(char ch)
    {
        if((ch >= 'a' && ch <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}



class program33_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);
        bRet = Alphabet.ChkSmall(cValue);

    if(bRet == true)
    {
        System.out.println("It is a Small case character");
    }
    else
    {
        System.out.println("It is not Small case character");
    }
    sobj.close();


    
        
    }
}