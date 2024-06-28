import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		//int year = Integer.parseInt(args[0]);
		int year=sc.nextInt();
		if(year%400==0||(year%4==0&&year%100!=0))
			System.out.println(year+"is leap year");
		else
		{
			System.out.println(year+"is not leap year");	
		}
			
	
		

	}

}
