import java.util.Scanner;

class Nearest_Prime
{
	static int prime(int n)
	{
		int flag = 1;
				for (int i = 2; i <=n/2; i++)
				{
					if(n%i == 0)
					{
						flag =0;
						break;
					}
				}
				if(flag==0 )
					return 0;
				else 
					return 1;
	}
	
	static int befor_num(int n)
	{
		int c=0;
		while(true)
		{
			if(prime(n) == 1)
				return c;
			else
			{
				n--;
				c=c+1;
			}
		}
	}
	
	static int After_num(int n)
	{
		int c=0;
		while(true)
		{
			if(prime(n) == 1)
				return c;
			else
			{
				n++;
				c=c+1;
			}
		}
	}
	

	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter a numbers ");
			int n= s.nextInt();
			int m1 =befor_num(n);
			int m2 = After_num(n);
			
			if(m1 > m2)
			{
				System.out.println("Nearest value =  " +(n+m2));
			}
			
			else if(m2 > m1)
			{
				System.out.println("Nearest value  = " +(n-m1));
			}
			else if((n-m1) == (n+m2))
			{
				System.out.println(" Prime number is  = " + n);
			}
			else if(m1 == m2)
			{
				System.out.println("Nearest value = "  +(n-m2) +", " +(n+m2) );
			}
	}

}
