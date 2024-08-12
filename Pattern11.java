import java.util.*;

/*
A B C D E
F G H I J
K L M N O
P Q R S T
U V W X Y
*/

class Pattern11
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		char ch='A';
	
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print(ch+" ");
				ch++;
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

