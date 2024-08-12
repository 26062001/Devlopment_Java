import java.util.*;

/*
1 2 3 4 5
F G H I J
11 12 13 14 15
P Q R S T
21 22 23 24 25
*/

class Pattern12
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		char ch='A';
		int Count=1;
	
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i%2==0)
				{
					System.out.print(ch+" ");
					
				}
				else
				{
					System.out.print(Count+" ");
					
				}
				ch++;
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

