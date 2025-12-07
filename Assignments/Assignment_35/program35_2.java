import java.util.*;


class Capital
{
    public static int CountSmall(String str)
    {
        int iCnt = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z')   
            {
                iCnt++;
            }
        }
        return iCnt;
       
    }
        

}



class program35_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;
    

        System.out.printf("Enter String :");
        String input = sobj.nextLine();

        iRet = Capital.CountSmall(input);

        System.out.println("Number of small letters: " + iRet);

        

        sobj.close();

    
        
    }
}