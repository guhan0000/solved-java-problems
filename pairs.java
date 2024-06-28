import java.util.*;
public class pairs {
	public static String reversal(String str)
	{
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String name="231032";
		//name.substring(4, 6);
		//System.out.println(name.substring(4, 6));
		String list1[]={"231001","231002","231003","231004","231005",
				"231006","231007","231008","231009","231010",		
				"231020","231030","231040","231050","231060"};
		for(int i=0;i<list1.length;i++)
		{
			//String flag=rev
			if(list1[i].substring(4, 6).equals("2310".concat(reversal(list1[i].substring(4, 6)))))
			{
				System.out.print("succes");
			}
		}
		
		
		
		

	}

}
