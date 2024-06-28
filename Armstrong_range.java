
public class Armstrong_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=1;
		int high=1000;
		
		for(int num=low;num<=high;num++)
		{
			int sum=0,digit,count;
			int temp=num;
			 count=getorder(num);
			
			while(temp!=0)
			{
				digit=temp%10;
				sum=sum+(int)Math.pow(digit, count);
				temp/=10;
				
			}
			if(sum==num)
			{
				System.out.print(num+" ");
			}
		}
		
	}
	private static int  getorder(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}
		
		return count;
	}

}
