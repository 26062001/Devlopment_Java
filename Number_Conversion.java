import java.util.*;

class Number_Conversion
{
	public static int Bin_Dec(int iNo)
	{
		int iDigit=0,iRet=0,Power=1;
		
		while(iNo!=0)
		{
			iDigit=iNo%10;
			iRet=(iDigit*Power)+iRet;
			Power=Power*2;
			iNo=iNo/10;
		}
		return iRet;
	}
	
	public static int Dec_Bin(int iNo)
	{
		int iDigit=0,iRet=0,Power=1;
		
		while(iNo!=0)
		{
			iDigit=iNo%2;
			iRet=(iDigit*Power)+iRet;
			Power=Power*10;
			iNo=iNo/2;
		}
		return iRet;
	}
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the Binary Nmber");
		int iValue1=sobj.nextInt();
		
		System.out.println("Enter the Decimal Nmber");
		int iValue2=sobj.nextInt();
		
		int iRet=Bin_Dec(iValue1);
		System.out.println("Decimal Number is:"+iRet);
		
		int iRet1=Dec_Bin(iValue2);
		System.out.println("Binary Number is:"+iRet1);
		
		
	}
}