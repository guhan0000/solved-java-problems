
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="10o1";
		String rev="";
		int len=str.length();
		boolean ans = false;
		//System.out.println("palindrome");
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		
	}

}
