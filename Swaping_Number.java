import java.util.*;

//In this Code we Are using function for Swap Number
//1)Using Temp Variable
//2)Without using Temp Variable
//3)Using XOR 

class Swaping_Number
{
	/*public static void Swap(int iNo1,int iNo2)
	{
		int iTemp=0;
		iTemp=iNo1;
		iNo1=iNo2;
		iNo2=iTemp;
		
		System.out.print(iNo1+ "\t"+iNo2);
	}*/
	
	/*public static void Swap1(int iNo1,int iNo2)
	{
		iNo2=iNo1+iNo2;	//32=11+21
		iNo1=iNo2-iNo1; //21=32-11
		iNo2=iNo2-iNo1; //11=32-21
		
		System.out.print(iNo1+ "\t"+iNo2);
	}*/
	
	public static void Swap2(int iNo1,int iNo2)
	{
		iNo2=iNo1^iNo2;
		iNo1=iNo1^iNo2;
		iNo2=iNo1^iNo2;
		System.out.print(iNo1+ "\t"+iNo2);
		
	}
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0,iValue2=0;
		
		System.out.println("Enter the 1st Number");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the 2nd Number");
		iValue2=sobj.nextInt();
		System.out.println("Before Swaping Number");
		System.out.print(iValue1+ "\t"+iValue2);
		System.out.println("");
		System.out.println("After Swaping Number");
		//Swap(iValue1,iValue2);
		//Swap1(iValue1,iValue2);
		Swap2(iValue1,iValue2);
		
		
	}
}
