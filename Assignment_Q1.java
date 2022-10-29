package in.company.main;

public class Assignment_Q1 {

	public static void main(String[] args) {
		int n=8;
  for(int j=0;j<n;j++) 
       {          // printing I
	         for(int i=0;i<n;i++)
			{
				if(i==(n-1)/2 || j==0||j==n-1) 
				{
				System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
				
			}
		  System.out.print("  ");//for printing space between letters
			// printing N
			for(int i=0;i<n;i++)
			{
				if(i==0 ||i==n-1|| i==j)
				{
					System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
			}
			System.out.print(" ");//for printing space between letters
			// printing U
			for(int i=0;i<n;i++)
			{
				if((i==0 && j!=n-1)||(i==n-1 && j!=n-1) || (j==n-1 && i>0 && i<n-1)
						)
				{
					System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
			}
			System.out.print(" ");//for printing space between letters
			
			// printing E
			for(int i=0;i<n;i++)
			{
				if(i==0 ||j==0|| j==n-1||j==(n)/2)
				{
					System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
			}
			System.out.print(" ");//for printing space between letters
			// printing R
			for(int i=0;i<n;i++)
			{
				if(i==0||(j==0&& i<(3*n)/4)||(j==n/2&& i<(3*n)/4)||
						(i==(3*n)/4 && j>0 && j<=(n-1)/2) || 
						(i>(n-1)/2 && j>(n-1)/2 && i==j )
						)
				{
					System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
			}
			System.out.print(" ");//for printing space between letters
			// printing O
			for(int i=0;i<n;i++)
			{
             if((i==0 && j>0 && j<n-1) || (j==0 && i>0 && i<n-1) 
		      || (j==n-1 && i>0 && i<n-1) || (i==n-1&& j>0 && j<n-1)
						)
				{
					System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
			}
			System.out.print(" ");//for printing space between letters
			// printing N
			for(int i=0;i<n;i++)
			{
				if(i==0 ||i==n-1|| i==j)
				{
					System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
			}
			System.out.print(" ");//for printing space between letters
			
			System.out.println();// for printing star in next line to form pattern
			}
}

}

