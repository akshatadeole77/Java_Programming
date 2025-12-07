import java.util.*;


class Capital
{
    public static int CountCapital(String str)
    {
        int iCnt = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch >= 'A' && ch <= 'Z')   
            {
                iCnt++;
            }
        }
        return iCnt;
       
    }
        

}



class program35_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRet = 0;
    

        System.out.printf("Enter String :");
        String input = sobj.nextLine();

        iRet = Capital.CountCapital(input);

        System.out.println("Number of capital letters: " + iRet);

        

        sobj.close();

    
        
    }
}