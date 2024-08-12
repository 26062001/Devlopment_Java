import java.util.*;

class BinarySearch
{
	public static void Display(int Arr[],int iSize)
	{	
		int iCnt=0;
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			System.out.print(Arr[iCnt]+"\t");
		}
	}
	
	
	public static int Binary_Search(int iSize,int Arr[],int Key)
	{
		int iStart=0,iEnd=0,iMid=0;
		iEnd=iSize;

		while(iStart<=iEnd)
		{
			iMid=(iStart+(iEnd-iStart)/2);
			
			if(Key==Arr[iMid])
			{
				return iMid;
			}
			else if(Key>Arr[iMid])
			{
				iStart=iMid+1;
			}
			else
			{
				iEnd=iMid-1;
			}
			iStart++;
			iEnd--;
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
		
		int iRet=Binary_Search(iLength,Arr,Key);
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