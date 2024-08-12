import java.util.*;

/*
1 1 3 1 5
1 2 3 2 5
1 3 3 3 5
1 4 3 4 5
1 5 3 5 5
*/

class Pattern9
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0;
	
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(j%2==0)
				{
					System.out.print(i+ " ");
				}
				else
				{
					System.out.print(j+ " ");
				}
				
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

