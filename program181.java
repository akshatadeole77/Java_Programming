/*
    iRow : 4
    iCol : 4

    a b c d
    efgh
    ijkl
    mnop
*/

import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol,int iNo)
    {
       int i = 0, j = 0;
       char ch = '\0';
       
        for(i=1;i<=iRow;i++)
        {
            
            for(j=1, ch = 'a';j<=iCol;j++,ch++)
            {
                System.out.printf("%c\t");
                ch++;
            }
            System.out.println();
        }
    }
}

class program179
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the frquency:");
        iValue = sobj.nextInt();

        
       

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
        
    }
}