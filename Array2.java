import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the element "+i);
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr1[i]);
		}
		
	}

}
