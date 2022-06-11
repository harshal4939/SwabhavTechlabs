import java.util.*;
class Prime
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number to be checked if prime");
			int n = sc.nextInt();
			int i,temp,flag=0;      
			temp=n/2;      
			if(n==0||n==1)
				{  
					System.out.println(n+" is not prime number");      
			    }
			else
				{  
					for(i=2;i<=temp;i++)
						{      
							if(n%i==0)
								{      
									System.out.println(n+" is not prime number");      
									flag=1;      
									break;      
								}      
						}      
			    }
			if(flag==0)  
				{ 
					System.out.println(n+" is prime number"); 
				}  
		}
}