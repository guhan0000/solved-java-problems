import java.util.Scanner;

public class PalindromeString {
	public static boolean ispalindrome(String str)
	{
		if(str.length()==0||str.length()==1)
		{
			return true;
		}
		if(str.charAt(0)!=str.charAt(str.length()-1))
		{
			return false;
		}
		
		
			return ispalindrome(str.substring(1,str.length()-1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		if(ispalindrome(str))
		{
			System.out.println(str+" is a palindrome");
		}
		else
		{
			System.out.println(str+" is not a palindrome");
		}
		
		
	}

}
