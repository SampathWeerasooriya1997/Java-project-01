import java.util.Scanner;
public class Quetion04
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int ans;
		do
		{
			System.out.println("Enter 10 numbers: ");
			int sum=0;
			int i;
			for( i=0;i<10;i++)
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

			System.out.println();

			System.out.println("Do you want play again.?");
			System.out.println("if yes enter, 'yes'");
			System.out.println("if no enter , 'no'");
			ans = scan.nextInt();
			
		}
		while(ans == 1);
		

	}
}
		
		
		
		