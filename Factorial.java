
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int fact=1;
		if(num==0)
		{
			System.out.println("1");
		}
		else
		{
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.print(fact+" ");
		}
		
	}

}
