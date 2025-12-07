import java.util.*;

class CharacterX
{
    public static String StrRevX(String str)
    {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        char temp;

        while(start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }
}

public class program37_5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = sobj.nextLine();

        String reversed = CharacterX.StrRevX(input);

        System.out.println("Modified string is : " + reversed);

        sobj.close();
    }
}
