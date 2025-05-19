public class CommandLineFibonacciSeries
{
	public static void main(String [ ] args)
	{
		int firstNum = 0, secNum = 1;
		int num = Integer.parseInt(args[0]);
		
		if(num==0)
		{
			System.out.println("Error");
		} else
		{
			System.out.print(firstNum+" "+secNum+" ");		
	
			for(int i=1; i < num; i++)
			{
				int result = firstNum + secNum;
				System.out.print(" "+result+" " );
					
				firstNum = secNum;
				secNum = result;
			}
		}
	}
}
//end
