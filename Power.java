import java.util.*;

class Power
{
	public static int Calculate_Power(int Base,int Power)
	{
		int iMult=1;
		while(Power!=0)
		{
			iMult=Base*iMult;
			Power--;
		}
		return iMult;
	}
	public static void main(String [] args)
	{
		Scanner sobj=new Scanner(System.in);
		
		int iValue1=0,iValue2=0,iRet=0;
		
		System.out.println("Enter the Base");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the Power");
		iValue2=sobj.nextInt();
		
		iRet=Calculate_Power(iValue1,iValue2);
		System.out.println("Base to the Power="+iRet);
		
		
	}
}