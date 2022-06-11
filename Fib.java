import java.util.*;
class Fib
{
	public static void main(String[] args)
		{
		     Scanner sc= new Scanner(System.in); 
			  
			 int n1=0,n2=1,n3,i;    
			 System.out.print("Enter the number of elements in the Fibonacci series");   
			 int n = sc.nextInt();
			 System.out.print("The fibonacci series for " + n + " elements is "); 
			 System.out.print(n1+" "+n2);   
				
					 for(i=2;i<n;++i)						   
					 {    
					  n3=n1+n2;    
					  System.out.print(" "+n3);    
					  n1=n2;    
					  n2=n3;    
					 }    
		}
}

