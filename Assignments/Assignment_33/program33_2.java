import java.util.*;


class Alphabet
{
    public static boolean ChkCapital(char ch)
    {
        if((ch >= 'A' && ch <= 'Z'))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}



class program33_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cValue = '\0';
        boolean bRet = false;

        System.out.println("Enter the character : ");
        cValue = sobj.next().charAt(0);
        bRet = Alphabet.ChkCapital(cValue);

    if(bRet == true)
    {
        System.out.println("It is a capial");
    }
    else
    {
        System.out.println("It is not capital");
    }
    sobj.close();


    
        
    }
}