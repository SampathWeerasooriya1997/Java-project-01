import java.util.Scanner;
public class Quetion01
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 10 numbers: ");
		
		for(int i=0;i<10;i++)
		{
		int num=scan.nextInt();
		
		if(num<100 && num>0)
		{
			
			num=num;
		}
		else
		{
			i=11;
		}
		}

	}
}
		
		
		
		