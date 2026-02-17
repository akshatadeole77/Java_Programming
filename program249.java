import java.util.*;

class StringX
{
    public int CountOccarnace(String str)
    {
        int iCnt = 0;
        int iCount = 0;


        char Arr[] = str.toCharArray();

        

        if( Arr[iCnt] == 'a')
        {
            System.out.println(iCnt);
        }
        return iCnt;
    }
    
}

class program249
{
    public static void main(String A[])
    {
        int iRet = 0;
        

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter String : \n");
        
        String sobj = scanobj.nextLine();

        StringX strobj =  new StringX();

        iRet = strobj.CountOccarnace(sobj);

        System.out.println("Occrance count is :" +iRet);

        

      
    }
}