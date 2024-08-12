import java.util.*;

/*
	At time call only one Function
*/
//Display Array

class Array_Opration
{
	public static void DisplayArray(int iSize,int Arr[])
	{
		int iCnt=0;
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			System.out.println(Arr[iCnt]+" ");
		}
		System.out.println("");
	}
	
//Insetr Element at any Position exception last index
	public static void Insert_At_Pos(int iSize,int Arr[],int Index,int iNo)
	{
		int iCnt=0;
		for(iCnt=iSize;iCnt>=Index;iCnt--)
		{
			Arr[iCnt+1]=Arr[iCnt];	
		}
		Arr[Index]=iNo;
	}
	
//Insetr Element at Last
/*public static void Insert_At_Last(int iSize,int Arr[],int iNo)
	{
		int iCnt=0;
		for(iCnt=0;iCnt<=iSize;iCnt++)
		{
				Arr[iSize]=iNo;
		}
	
	}
*/

	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		int iLength=0,iCnt=0,Index=0,iValue=0;
		
		System.out.println("Enter the Number of Elements");
		iLength=sobj.nextInt();
	
		System.out.println("Enter the Index for Add element this Postion");
		Index=sobj.nextInt();
	
		System.out.println("Enter the Number fo adding this Number");
		iValue=sobj.nextInt();
	
		int Arr[]=new int[iLength];
		System.out.println("Enter the Elements");
		for(iCnt=0;iCnt<iLength;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		
		System.out.println("Befor Adding Element array is:");
		DisplayArray(iLength,Arr); 
	
		Insert_At_Pos(iLength,Arr,Index,iValue);
		iLength=iLength+1;
		System.out.println("After Adding Element array is:");
		DisplayArray(iLength,Arr);
	
		/*Insert_At_Last(iLength,Arr,iValue);
		iLength=iLength+1;
		System.out.println("After Adding Element array is:");
		DisplayArray(iLength,Arr);
		*/
	}
}
 





	
	
	
	
	
	
	
	
	
	
