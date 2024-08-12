import java.util.*;

/*
1 2 3 4 5
2 2 2 2 2
1 2 3 4 5
4 4 4 4 4
1 2 3 4 5
*/

class Pattern8
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0;
	
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i%2==0)
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

