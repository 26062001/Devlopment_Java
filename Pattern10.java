import java.util.*;

/*
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/

class Pattern10
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0,Count=1;
	
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print(Count+" ");
				Count++;
			}
		
			System.out.println();
		}
	}
	
	
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0,iValue2=0;
	
		System.out.println("Enter Number of Rows");
		iValue1=sobj.nextInt();
	
		System.out.println("Enter Number of Coloms");
		iValue2=sobj.nextInt();
	
		Display(iValue1,iValue2);
		
	}
	
}

