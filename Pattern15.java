import java.util.*;

/*
1 1 1 1 1
1 2 2 2 1
1 2 3 2 1
1 2 2 2 1
1 1 1 1 1
*/

class Pattern15
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0,Count=1;
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if((i==1)||(j==1)||(i==iRow)||(j==iCol))
				{
					System.out.print("1 ");
				}
				else if((i==2)||(j==2)||(i==iRow-1)||(j==iCol-1))
				{
					System.out.print("2 ");
				}
				else if((i==3)||(j==3)||(i==iRow-3)||(j==iCol-3))
				{
					System.out.print("3 ");
				}
			}
				Count++;
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

