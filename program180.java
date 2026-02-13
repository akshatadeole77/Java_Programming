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
       int i = 0 , j=0;
       char ch = 'a';
       
        for(i=1;i<=iRow;i++)
        {
            ch = 'a';
            for(j=1;j<=iCol;j++)
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