import java.util.*;

class Sorting
{
	public static void Display(int Arr[],int iSize)
	{	
		int iCnt=0;
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			System.out.print(Arr[iCnt]+"\t");
		}
	}
	
	
	public static void Accending(int Arr[],int iSize)
	{	
		int i=0,j=0,iTemp=0;
		for(i=0;i<iSize;i++)
		{
			for(j=i+1;j<iSize;j++)
			{
				if(Arr[i]>Arr[j])
				{
					iTemp=Arr[i];
					Arr[i]=Arr[j];
					Arr[j]=iTemp;
				}
			}
		}
	}
	
	public static void Decending(int Arr[],int iSize)
	{	
		int i=0,j=0,iTemp=0;
		for(i=0;i<iSize;i++)
		{
			for(j=i+1;j<iSize;j++)
			{
				if(Arr[i]<Arr[j])
				{
					iTemp=Arr[i];
					Arr[i]=Arr[j];
					Arr[j]=iTemp;
				}
			}
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iLength=0,iCnt=0;
		
		System.out.println("Enter the Number of Elements");
		iLength=sobj.nextInt();
		
		int Arr[]=new int[iLength];
		System.out.println("Enter Elements:");
		for(iCnt=0;iCnt<iLength;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		System.out.println("Array elements is:");
		Display(Arr,iLength);
		
		Accending(Arr,iLength);
		System.out.println("");
		System.out.println("After Sorting Array is/Accending Order:");
		Display(Arr,iLength);
		
		Decending(Arr,iLength);
		System.out.println("");
		System.out.println("After Sorting Array is/Decending Order:");
		Display(Arr,iLength);
		
	}
}