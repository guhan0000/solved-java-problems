
public class prime_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=1;
		int high=20;
		//int count=0;
		for(int num=low;num<=high;num++)
		{
			if(isprime(num))
			{
				System.out.println(num+" ");
			}
		}
	}
	static boolean isprime(int n)
	{
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;	
			}
				
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
