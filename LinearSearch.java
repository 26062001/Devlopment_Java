import java.util.*;

class LinearSearch
{
	public static void Display(int Arr[],int iSize)
	{	
		int iCnt=0;
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			System.out.print(Arr[iCnt]+"\t");
		}
	}
	
	
	public static int Search(int Arr[],int iSize,int Key)
	{
		int iCnt=0;
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			if(Arr[iCnt]==Key)
			{
				return iCnt;
			}
			
		}
		return -1;
	}
	
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iLength=0,iCnt=0;
		
		System.out.println("Enter the Number of Elements");
		iLength=sobj.nextInt();
		
		System.out.println("Enter the Number Key");
		int Key=sobj.nextInt();
		
		int Arr[]=new int[iLength];
		System.out.println("Enter Elements:");
		for(iCnt=0;iCnt<iLength;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		System.out.println("Array elements is:");
		Display(Arr,iLength);
		
		int iRet=Search(Arr,iLength,Key);
		System.out.println("");
		if(iRet==-1)
		{
			System.out.println("Key is not Found");
		}
		else
		{
			System.out.println("Key is Founded at Index number:"+iRet);
		}
		
	}
}