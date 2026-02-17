import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        int iCnt = 0;
        int iCount = 0;


        char Arr[] = str.toCharArray();

        

        if( Arr[iCnt] >= 'a' &&  Arr[iCnt] <= 'z')
        {
            System.out.println(iCnt);
        }
        return iCnt;
    }
    
}

class program250
{
    public static void main(String A[])
    {
        int iRet = 0;
        

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : \n");
        
        String sobj = scanobj.nextLine();

        StringX strobj =  new StringX();

        iRet = strobj.CountSmall(sobj);

        System.out.println("Frequency of small character is :" +iRet);

        

      
    }
}