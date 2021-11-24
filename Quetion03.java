import java.util.Scanner;
public class Quetion03
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 10 numbers: ");
		int sum=0;
		for(int i=0;i<10;i++)
		{
		int num=scan.nextInt();
		
		if(num<100 && num>0)
		{
			if(num>75)
			{
			    i=15;	
			}
			else
				
			{
				num=num;
				sum=sum+num;
			}
			
		}
		else
		{
			i=11;
		}
		}
System.out.println("Your score is :"+sum);
	}
}
		
		
		
		