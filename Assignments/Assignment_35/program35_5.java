import java.util.*;

class ReverseString
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sobj.nextLine();  // read full line including spaces

        String reversed = "";

        for(int i = input.length() - 1; i >= 0; i--)
        {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        sobj.close();
    }
}
