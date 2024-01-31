import java.util.*;
public class vowels_consonent_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		str=str.toLowerCase();
		int vowels=0,consonents=0;
		//System.out.println();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||
					str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				vowels+=1;
			}
			else if(str.charAt(i)>='a'|| str.charAt(i)<='z')
			{
				consonents+=1;
			}
		}
		System.out.println("vowels :"+vowels);
		System.out.println("consonents :"+consonents);
		
	}

}
