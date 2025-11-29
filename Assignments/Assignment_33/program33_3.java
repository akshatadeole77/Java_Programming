import java.util.*;


class Alphabet
{
    public static boolean ChkDigit(char ch)
    {
        if((ch >= '0' && ch <= '9'))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}



class program33_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);
        bRet = Alphabet.ChkDigit(cValue);

    if(bRet == true)
    {
        System.out.println("It is a Digit");
    }
    else
    {
        System.out.println("It is not Digit");
    }
    sobj.close();


    
        
    }
}