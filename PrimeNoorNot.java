import java.util.*;
public class PrimeNoorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print(num+" is a prime no");
		}
		else
		{
			System.out.print(num+" is not a prime no");
		}
				
	}

}
