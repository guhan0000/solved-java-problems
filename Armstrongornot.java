
public class Armstrongornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=407;
		int temp1=num;
		int count=0,rem;
		while(num!=0)
		{
			rem=num%10;
			count++;
			num/=10;
			
		}
		//System.out.println(count);
		int temp=temp1;
		int sum=0;
		int digit;
		while(temp!=0)
		{
			digit=temp%10;
			sum= sum+(int)(Math.pow(digit, count));
			temp/=10;
		}
		if(temp1==sum)
		{
			System.out.println(temp1 +"is an armstrong no");
		}
		else
		{
			System.out.println(temp1 +"is not an armstrong no");
		}

	}

}
