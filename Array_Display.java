import java.util.*;

class Array_Display
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iLength=0,iCnt=0;
		
		System.out.println("Enter the Number of Elements");
		iLength=sobj.nextInt();
		
		int Arr[]=new int[iLength];
		System.out.println("Enter the elements");
		for(iCnt=0;iCnt<iLength;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}
		
		
		System.out.println("Entered elements:");
		for(iCnt=0;iCnt<iLength;iCnt++)
		{
			System.out.print(Arr[iCnt]+" ");
		}
		
	}
}