import java.util.Scanner;

public class vowel {
	public static boolean isvowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		str=str.toLowerCase();
		System.out.println("vowels");
		for(int i=0;i<str.length();i++)
		{
			if(isvowel(str.charAt(i)))
			{
				System.out.print(str.charAt(i)+"");
			}
			
		}
		System.out.println("\nconsonenets");
		for(int i=0;i<str.length();i++)
		{
			if(isvowel(str.charAt(i))==false)
			{
				System.out.print(str.charAt(i)+"");
			}
			
		}
		
		
	}
	

}
