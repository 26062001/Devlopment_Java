import java.util.*;

class Addition
{
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0,iValue2=0,iSum=0;
		
		System.out.println("Enter the 1st Number");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the 2nd Number");
		iValue2=sobj.nextInt();
		
		iSum=iValue1+iValue2;
		System.out.println("Addition of Two Number is:"+iSum);
	}
}