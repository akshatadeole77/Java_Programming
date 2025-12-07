import java.util.*;

class CharacterX
{
    public static boolean ChkChar(String str, char ch)
    {
        

        for(int i = 0; i < str.length(); i++)
        {
           
            if(str.charAt(i) == ch)  
            {
                return true;
                
            }
        }
            
            return false;
        
            

           
        }

        
    }


class program37_1
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
       

        System.out.print("Enter String : ");
        String input = sobj.nextLine();

        System.out.print("Enter Character : ");
        char cValue = sobj.next().charAt(0);

        boolean bRet = CharacterX.ChkChar(input, cValue);


        if(bRet == true)
        {
            System.out.println("Character Found");
        }
        else
        {
            System.out.println("Charatcer not found");
        }

        
      

        sobj.close();
    }
}
