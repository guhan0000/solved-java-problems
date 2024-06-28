
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int f1=0;
		int f2=1;
		int fn=0;
		System.out.print("0 1 ");
		for(int i=3;i<=num;i++)
		{
			
			fn=f1+f2;
			System.out.print(fn+" ");
			f1=f2;
			f2=fn;
			
		}
	}

}
